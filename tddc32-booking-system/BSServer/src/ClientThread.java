
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

import NetworkPackage.Request;




/**
 *	Handle the client
 *	Client can access to synchronized value BookSystem and DB
 **/
public class ClientThread implements Runnable {

	private Thread					_t;					//*Will contain client thread
	private Socket					_socket;				// Client socket
	private BufferedInputStream		_in;	// In stream
	private BufferedOutputStream	_out;	// Out stream
	private BookSystem				_bs;
	private ObjectInputStream		_ios;
	private ObjectOutputStream		_oos;
//	private SocketManager _sockManager;		//*pour utilisation des m�thodes de la classe principale
//	private int _numClient = 0; 		//*contiendra le num�ro de client g�r� par ce thread
	
	/**
	 * Constructor
	 * @param s
	 */
	public ClientThread(Socket s, SocketManager sm, BookSystem bs)	// Socket is given by SocketManager
	{
		try	
		{
			_socket = s;
			//_sockManager = sm;
			_bs = bs;
			//_in = new BufferedInputStream(_socket.getInputStream());// In Stream
			//_ios = new ObjectInputStream(_in);
			//_out = new BufferedOutputStream(_socket.getOutputStream());		// Out Stream
			//_oos = new ObjectOutputStream(_out);
			
			_ios = new ObjectInputStream(_socket.getInputStream());
			_oos = new ObjectOutputStream(_socket.getOutputStream());
			
			
			System.out.println("In/Out stream established.");
			_t = new Thread(this);
			_t.start();
		} catch (EOFException e1) {
			System.out.println("Chier.");
    		//closeClient();
			return;
		} catch (IOException ex){
			Logger.getLogger(ClientThread.class.getName()).log(Level.SEVERE, null, ex);
			System.out.println("Can't open In/Out stream for client.");

			return;
		}
	}

	@Override
	public void run() {
		System.out.println("Someone connected");
        boolean isAlive = true;
        while (isAlive) {
        	try {
        		/*byte[]		message = new byte[1000];
        		Integer		receivedBits;
			
        		while ((receivedBits = this._in.read(message)) >= 0) {
        			System.out.println("Size: " + receivedBits.toString() + "Message: " + message);
        		}*/
        		System.out.println("Waiting for Something");
        		Request req = (Request) _ios.readObject();
        		if (req != null)
        			System.out.println("Received: "+ req.login + "type="+req.type);
        		else
        			System.out.println("Something received");
        		//isAlive = false;
        	} catch (EOFException e1) {
        		isAlive = false;
        		//closeClient();
        	} catch (IOException e1) {
        		isAlive = false;
        		//closeClient();
        	} catch (ClassNotFoundException e) {
        		isAlive = false;
        		e.printStackTrace();
        	} /*finally {
        		isAlive = false;
        		closeClient();
        	}*/
        }
        closeClient();
        System.out.println("Thread ending");
	}
	
	private void closeClient(){
		System.out.println("IOException");
		try {
			//this._in.close();
			//this._out.close();
			this._ios.close();
			this._oos.close();
			this._socket.close(); // fermeture du socket si il ne l'a pas d�j� �t� (� cause de l'exception lev�e plus haut)
			System.out.println("Client disconnected");
		} catch (IOException e) {
			Logger.getLogger(ClientThread.class.getName()).log(Level.SEVERE, null, e);
		}
	}
	
}