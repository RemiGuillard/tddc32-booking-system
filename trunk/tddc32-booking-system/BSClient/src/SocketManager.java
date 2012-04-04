import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;


public class SocketManager implements Runnable {
	private	int			_port = 42042;
	private	String		_password;
	private	String		_login;
	private	Socket		_sock = null;
	private	byte[]		_ip = {127,0,0,1};
	private	InetAddress	_addr;
    private ObjectOutputStream	_output;
    private ObjectInputStream	_input;
    private	GUI			_gui;
	
	public SocketManager() {}
	
	public	boolean	login(String login, String pass) {
		if (login.isEmpty() || pass.isEmpty())
			return false;
		_login = login;
		_password = pass;
		return true;
	}
	
	public	boolean	connection(int port, byte ip[]) {
		//TODO port & IP check
		_ip = ip;
		try {
			_addr = InetAddress.getByAddress(_ip);
			_port = port;
			_sock = new Socket(_addr, _port);
			run();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		catch (IOException e) {
			return false;
		}
		return true;
	}
	
	public	void	linkGUI(GUI g) {
		_gui = g;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}
