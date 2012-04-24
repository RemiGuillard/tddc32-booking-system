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
	private String		_ipStr;
	private	InetAddress	_addr;
    private ObjectOutputStream	_output;
    private ObjectInputStream	_input;
    private	Request[]	_requestPool;
    private	BookSystem	_bs;
    private Thread		_t;		
    //private	GUI			_gui;
	
	public SocketManager() {}
	
	public	boolean	connection(int port, String ip) {//byte ip[]) {
		//TODO port & IP check
		_ipStr = ip;
		//byte[] b = {(byte) 192,(byte) 168,(byte)1,Byte.parseByte(arg0)(65)};
		try {
			//_ipStr = _ip[0] + _ip[1] + _ip[4] + _ip[3];
			//Integer[] _ip2 = {_ip[0]&0xFF,_ip[1]&0xFF,_ip[2]&0xFF,_ip[3]&0xFF};
			//_addr = InetAddress.get(_ip2);
			//_addr = InetAddress.getByName("192.168.1.65");
			System.out.println(_ipStr);
			_port = port;
			_sock = new Socket(_ipStr, _port);
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
