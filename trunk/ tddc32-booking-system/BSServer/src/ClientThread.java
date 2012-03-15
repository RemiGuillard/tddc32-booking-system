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
	//private SocketManager _network;		//*pour utilisation des m�thodes de la classe principale
	private int _numClient = 0; 		//*contiendra le num�ro de client g�r� par ce thread
	
	/**
	 * Constructor
	 * @param s
	 */
	public ClientThread(Socket s)	// Socket is given by SocketManager
	{
		try	
		{
			_socket = s;
			_in = new BufferedInputStream(_socket.getInputStream());			// In Stream
			_out = new BufferedOutputStream(_socket.getOutputStream());		// Out Stream
			++_numClient;
			System.out.println("In/Out stream established.");
			_t = new Thread(this);
			_t.start();
		}
		catch (IOException ex){
			Logger.getLogger(ClientThread.class.getName()).log(Level.SEVERE, null, ex);
			System.out.println("Can't open In/Out stream for client.");
			// TODO new ClientThread(socket) ?
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
        		closeIOStream();
        	} finally {
        		closeIOStream();
        	}
        }
	}
	
	private void closeIOStream(){
		System.out.println("IOException");
		try {
			this._in.close();
			this._out.close();
			this._socket.close(); // fermeture du socket si il ne l'a pas d�j� �t� (� cause de l'exception lev�e plus haut)
			System.out.println("Client disconnected");
		} catch (IOException e) {
			Logger.getLogger(ClientThread.class.getName()).log(Level.SEVERE, null, e);
		}
	}
	
}
