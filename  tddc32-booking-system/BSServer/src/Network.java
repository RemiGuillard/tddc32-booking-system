import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.util.Vector;


public class Network {

	private Vector<ObjectOutputStream> _tabClients = new Vector<ObjectOutputStream>(); // contiendra tous les flux de sortie vers les clients
	private int _nbClients=0; // nombre total de clients connect�s
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Network	network = new Network();
		try {
			Integer port;
			if(args.length<=0) 
				port = new Integer("18000"); // si pas d'argument : port 18000 par d�faut
			else 
				port = new Integer(args[0]); // port pass� en argument
			//new Commandes(network); // lance le thread de gestion des commandes

			ServerSocket ss = new ServerSocket(port.intValue()); // ouverture d'un socket serveur sur port
			printWelcome(port);
			while (true) { // attente en boucle de connexion (bloquant sur ss.accept)
				new ClientThread(ss.accept(),network); // un client se connecte, un nouveau thread client est lanc�
			}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}

	/** Methode : affiche le message d'accueil **/
	static private void printWelcome(Integer port)
	{
		System.out.println("--------");
		System.out.println("BSServer : Welcome");
		System.out.println("--------");
		System.out.println("Demarre sur le port : "+port.toString());
		System.out.println("--------");
		System.out.println("Quitter : tapez \"quit\"");
		System.out.println("Nombre de connectes : tapez \"total\"");
		System.out.println("--------");
	}

	/** Methode : envoie le message � tous les clients 
	 * @throws IOException 
	 **/
	synchronized public void sendAll(String message,String sLast) throws IOException
	{
		ObjectOutputStream out; // declaration d'une variable permettant l'envoi de texte vers le client
		for (int i = 0; i < _tabClients.size(); i++) { // parcours de la table des connect�s
			out = _tabClients.elementAt(i); // extraction de l'�l�ment courant (type PrintWriter)
			if (out != null) { // s�curit�, l'�l�ment ne doit pas �tre vide
				// ecriture du texte pass� en param�tre (et concat�nation d'une string de fin de chaine si besoin)
				//out.print(message+sLast);

				//TODO add message to output stream
				out.flush(); // envoi dans le flux de sortie
			}
		} 
	}

	/** Methode : d�truit le client no i **/
	synchronized public void delClient(int i)
	{
		_nbClients--; // un client en moins ! snif
		if (_tabClients.elementAt(i) != null) {// l'�l�ment existe ...
			_tabClients.removeElementAt(i); // ... on le supprime
		}
	}

	/** Methode : ajoute un nouveau client dans la liste **/
	synchronized public int addClient(ObjectOutputStream _out)
	{
		_nbClients++; // un client en plus ! ouaaaih
		_tabClients.addElement(_out); // on ajoute le nouveau flux de sortie au tableau
		return _tabClients.size()-1; // on retourne le num�ro du client ajout� (size-1)
	}

	/** Methode : retourne le nombre de clients connect�s **/
	synchronized public int getNbClients()
	{
		return _nbClients; // retourne le nombre de clients connect�s
	}

}
