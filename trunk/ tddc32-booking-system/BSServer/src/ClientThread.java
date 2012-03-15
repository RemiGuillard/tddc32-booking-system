import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *	Handle the client
 *	Client can access to synchronized value BookSystem and DB
 **/
public class ClientThread implements Runnable {

	private Thread _t;					//*Will contain client thread
	private Socket _socket;				// Client socket
	private BufferedInputStream _in;	// In stream
	private BufferedOutputStream _out;	// Out stream
	private SocketManager _sockManager;		//*pour utilisation des méthodes de la classe principale
	private int _numClient = 0; 		//*contiendra le numéro de client géré par ce thread
	
	/**
	 * Constructor
	 * @param s
	 */
	public ClientThread(Socket s, SocketManager sm)	// Socket is given by SocketManager
	{
		try	
		{
			_socket = s;
			_sockManager = sm;
			_in = new BufferedInputStream(_socket.getInputStream());			// In Stream
			_out = new BufferedOutputStream(_socket.getOutputStream());		// Out Stream
			_numClient = _sockManager.addClient(_out);
			System.out.println("In/Out stream established.");
			System.out.println("client number = " + _numClient);
			_t = new Thread(this);
			_t.start();
		}
		catch (IOException ex){
			Logger.getLogger(ClientThread.class.getName()).log(Level.SEVERE, null, ex);
			System.out.println("Can't open In/Out stream for client.");
			// TODO new ClientThread(socket) ? => retenter connexion ?
			return;
		}
	}

	@Override
	public void run() {
		System.out.println("Someone connected");
        boolean isAlive = true;
        while (isAlive) {
        	try {
        		byte[]		message = new byte[1000];
        		Integer		receivedBits;
			
        		while ((receivedBits = this._in.read(message)) >= 0) {
        			System.out.println("Size: " + receivedBits.toString() + "Message: " + message);
        		}
        		isAlive = false;
        	} catch (IOException e1) {
        		closeClient();
        	} finally {
        		closeClient();
        	}
        }
	}
	
	private void closeClient(){
		System.out.println("IOException");
		try {
			this._in.close();
			this._out.close();
			this._socket.close(); // fermeture du socket si il ne l'a pas déjà été (à cause de l'exception levée plus haut)
			_sockManager.delClient(_numClient);
			System.out.println("Client disconnected");
		} catch (IOException e) {
			Logger.getLogger(ClientThread.class.getName()).log(Level.SEVERE, null, e);
		}
	}
	
}
