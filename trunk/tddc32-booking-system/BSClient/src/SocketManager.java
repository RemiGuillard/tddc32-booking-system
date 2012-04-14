import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

import NetworkPackage.Answer;
import NetworkPackage.Request;
import NetworkPackage.queryType;


public class SocketManager implements Runnable {
	private	int			_port = 42042;
	private	String		_password;
	private	String		_login;
	private	Socket		_sock = null;
	private	byte[]		_ip = {127,0,0,1};
	private	InetAddress	_addr;
    private ObjectOutputStream	_output;
    private ObjectInputStream	_input;
    private	Request[]	_requestPool;
    private	BookSystem	_bs;
    private Thread		_t;		
    //private	GUI			_gui;
	
	public SocketManager() {}
	
	public	boolean	connection(int port, byte ip[]) {
		//TODO port & IP check
		_ip = ip;
		try {
			_addr = InetAddress.getByAddress(_ip);
			_port = port;
			_sock = new Socket(_addr, _port);
			_output = new ObjectOutputStream(_sock.getOutputStream());
	        _input = new ObjectInputStream(_sock.getInputStream());
	        _t = new Thread(this);
	        _t.start();

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
	
	@Override
	public void run() {
		Answer an;
		while (true) {
			try {
				an = (Answer) _input.readObject();
				_bs.manageAnswer(an);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void setBookSys(BookSystem bookMana) {
		_bs = bookMana;
	}

	public void sendRequest(Request req) {
		// TODO Auto-generated method stub
        try {
        	_output.writeObject(req);
			_output.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
