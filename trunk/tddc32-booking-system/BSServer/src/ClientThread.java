
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
	private BookSystem				_bs;
	private ObjectInputStream		_ios;
	private ObjectOutputStream		_oos;

	/**
	 * Constructor
	 * @param s
	 */
	public ClientThread(Socket s, SocketManager sm, BookSystem bs)	// Socket is given by SocketManager
	{
		try	
		{
			_socket = s;
			_bs = bs;

			_ios = new ObjectInputStream(_socket.getInputStream());
			_oos = new ObjectOutputStream(_socket.getOutputStream());
			
			
			System.out.println("In/Out stream established.");
			_t = new Thread(this);
			_t.start();
		} catch (EOFException e1) {

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

        		System.out.println("Waiting for Something");
        		Request req = (Request) _ios.readObject();
        		System.out.println("Something received");
        		_oos.writeObject(this._bs.executeRequest(req));
        		System.out.println("Sending Something");
        		_oos.flush();
        		
        	} catch (EOFException e1) {
        		isAlive = false;
        	} catch (IOException e1) {
        		isAlive = false;
        	} catch (ClassNotFoundException e) {
        		isAlive = false;
        		e.printStackTrace();
        	}
        }
        closeClient();
        System.out.println("Thread ending");
	}
	
	private void closeClient() {
		System.out.println("IOException");
		try {
			this._ios.close();
			this._oos.close();
			this._socket.close(); // fermeture du socket si il ne l'a pas déjà été (à cause de l'exception levée plus haut)
			System.out.println("Client disconnected");
		} catch (IOException e) {
			Logger.getLogger(ClientThread.class.getName()).log(Level.SEVERE, null, e);
		}
	}
	
}
