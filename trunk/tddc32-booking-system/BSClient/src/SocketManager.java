import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import NetworkPackage.Answer;
import NetworkPackage.Request;


public class SocketManager implements Runnable {
	private	int			_port = 42042;
	private	Socket		_sock = null;
	private String		_ipStr;
	private ObjectOutputStream	_output;
    private ObjectInputStream	_input;
    private	BookSystem	_bs;
    private Thread		_t;		
    //private	GUI			_gui;
	
	public SocketManager() {}
	
	public	boolean	connection(int port, String ip) {//byte ip[]) {
		//TODO port & IP check
		_ipStr = ip;
		//byte[] b = {(byte) 192,(byte) 168,(byte)1,Byte.parseByte(arg0)(65)};
		try {

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
				try {
					_input.close();
					_output.close();
					_sock.close();
					//e.printStackTrace();
					_bs.resetConnection();
					return;
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					return;
				}
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
