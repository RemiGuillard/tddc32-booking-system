import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Handle the Socket server
 * When new clients are connecting, create a new thread
 */
public class SocketManager implements Runnable {

	// OBSOLETE
	private Vector<ObjectOutputStream> _tabClients = new Vector<ObjectOutputStream>(); // contiendra tous les flux de sortie vers les clients
	private int _nbClients=0; // nombre total de clients connectés
	///
	
	private ServerSocket ss;	// server socket listening on port
	private int _port;			// Listening on port
	private int	_nbMax;			// Number of maximum simultaneous client
	
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
            this.ss = new ServerSocket(this._port, this._nbMax);	// Socket created listening on _port
            this.ss.setSoTimeout(10000);							// Setting timeout to 10 sec - "I'm not dead"
            printWelcome(this._port);
            
        } catch (IOException ex) {
            Logger.getLogger(SocketManager.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Port already taken. Please change it.");
            return;		// If can't launch server socket, exit 
        }
		
		while(true){
			
			try {
				Socket  socket;
				Thread  newClient;
				
				socket = this.ss.accept();								// Wait for a new client
				System.out.println("New client connecting");

				newClient = new Thread(new ClientThread(socket));		// New thread created for client
				newClient.start();										// Run the new thread

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

	/** Methode : envoie le message à tous les clients 
	 * @throws IOException 
	 **/
	synchronized public void sendAll(String message,String sLast) throws IOException
	{
		ObjectOutputStream out; // declaration d'une variable permettant l'envoi de texte vers le client
		for (int i = 0; i < _tabClients.size(); i++) { // parcours de la table des connectés
			out = _tabClients.elementAt(i); // extraction de l'élément courant (type PrintWriter)
			if (out != null) { // sécurité, l'élément ne doit pas être vide
				// ecriture du texte passé en paramètre (et concaténation d'une string de fin de chaine si besoin)
				//out.print(message+sLast);

				//TODO add message to output stream
				out.flush(); // envoi dans le flux de sortie
			}
		} 
	}

	/** Methode : détruit le client no i **/
	synchronized public void delClient(int i)
	{
		_nbClients--; // un client en moins ! snif
		if (_tabClients.elementAt(i) != null) {// l'élément existe ...
			_tabClients.removeElementAt(i); // ... on le supprime
		}
	}

	/** Methode : ajoute un nouveau client dans la liste **/
	synchronized public int addClient(ObjectOutputStream _out)
	{
		_nbClients++; // un client en plus ! ouaaaih
		_tabClients.addElement(_out); // on ajoute le nouveau flux de sortie au tableau
		return _tabClients.size()-1; // on retourne le numéro du client ajouté (size-1)
	}

	/** Methode : retourne le nombre de clients connectés **/
	synchronized public int getNbClients()
	{
		return _nbClients; // retourne le nombre de clients connectés
	}



}
