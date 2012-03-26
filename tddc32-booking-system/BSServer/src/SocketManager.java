
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Handle the Socket server
 * When new clients are connecting, create a new thread
 */
public class SocketManager implements Runnable {

	// OBSOLETE
	//private Vector<BufferedOutputStream> _tabClients = new Vector<BufferedOutputStream>(); // contiendra tous les flux de sortie vers les clients
	//private int _nbClients = 0; // nombre total de clients connectés
	///

	private ServerSocket	_ss;	// server socket listening on port
	private BookSystem		_bs;	// bookingSystem, to synchronize
	private int				_port;	// Listening on port
	private int				_nbMax;	// Number of maximum simultaneous client
	

	public SocketManager() {
		this._port = 42042;		// Default port if not specified
		this._nbMax = 5;		// Default number max of client
	}

	public SocketManager(int port, int nbMaxClient) {
		this._port = port;			// Specified port
		this._nbMax = nbMaxClient;	// Specified max nb Client
	}

	@Override
	public void run() {
		try {
			this._ss = new ServerSocket(this._port, this._nbMax);	// Socket created listening on _port
			this._ss.setSoTimeout(10000);							// Setting timeout to 10 sec - "I'm not dead"
			printWelcome(this._port);

		} catch (IOException ex) {
			Logger.getLogger(SocketManager.class.getName()).log(Level.SEVERE, null, ex);
			System.out.println("Port already taken. Please change it.");
			return;		// If can't launch server socket, exit 
		}

		while(true){

			try {
				Socket  socket;
				//Thread  newClient;

				socket = this._ss.accept();								// Wait for a new client
				System.out.println("New client connecting");
				new ClientThread(socket, this, _bs);
				//newClient = new Thread(new ClientThread(socket));		// New thread created for client
				//newClient.start();										// Run the new thread

			} catch (SocketTimeoutException e) {
				System.out.println("Not dead - Waiting for Client");	// Not dead message
			} catch (IOException e) {		
				System.err.println("Server Error");						// To handle correctly
			}

		}
	}


	/** Method : display Hello message **/
	static private void printWelcome(Integer port)
	{
		System.out.println("--------");
		System.out.println("BSServer : Welcome");
		System.out.println("--------");
		System.out.println("Start on port : "+port.toString());
		System.out.println("--------");
		System.out.println("Quit : enter \"quit\"");
		System.out.println("--------");
	}

}
