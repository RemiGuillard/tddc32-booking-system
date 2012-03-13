import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;



/**
 *  Classe associ�e � chaque client 
 * 	Il y aura autant d'instances de cette classe que de clients connect�s 
 **/
//impl�mentation de l'interface Runnable (une des 2 m�thodes pour cr�er un thread)
public class ClientThread implements Runnable {

	private Thread _t; // contiendra le thread du client
	private Socket _s; // recevra le socket liant au client
	private ObjectOutputStream _out; // pour gestion du flux de sortie
	private ObjectInputStream _in; // pour gestion du flux d'entr�e
	private Network _network; // pour utilisation des m�thodes de la classe principale
	private int _numClient = 0; // contiendra le num�ro de client g�r� par ce thread

	/** 
	 * Constructor 
	 **/
	ClientThread(Socket s, Network network) // le param s est donn�e dans BlablaServ par ss.accept()
	{
		_network = network;
		_s = s;
		try	
		{
			_out = new ObjectOutputStream(_s.getOutputStream()); // flux de sortie
			_in = new ObjectInputStream(_s.getInputStream());// flux d'entr�e
			_numClient = _network.addClient(_out); // ajoute le flux de sortie dans la liste et r�cup�ration de son numero
		}
		catch (IOException e){
			// TODO: handle exception 
		}

		_t = new Thread(this); // instanciation du thread
		_t.start(); // demarrage du thread, la fonction run() est lanc�e
	}

	/** 
	 * Methode :  ex�cut�e au lancement du thread par t.start()
	 * Elle attend les messages en provenance du serveur et les redirige 
	 * @Override
	 **/
	// cette m�thode doit obligatoirement �tre impl�ment�e � cause de l'interface Runnable
	public void run() {
		String message = ""; // d�claration de la variable qui recevra les messages du client
		// on indique dans la console la connection d'un nouveau client
		System.out.println("Un nouveau client s'est connecte, no "+_numClient);
		try
		{
			//TODO action du thread client : listen sur la socket 
		}
		catch (Exception e){
			// TODO: handle exception
		}
		finally // finally se produira le plus souvent lors de la deconnexion du client
		{
			try
			{
				// on indique � la console la deconnexion du client
				System.out.println("Le client no "+_numClient+" s'est deconnecte");
				_network.delClient(_numClient); // on supprime le client de la liste
				_s.close(); // fermeture du socket si il ne l'a pas d�j� �t� (� cause de l'exception lev�e plus haut)
			}
			catch (IOException e) {
				// TODO: handle exception
			}
		}

	}
}
