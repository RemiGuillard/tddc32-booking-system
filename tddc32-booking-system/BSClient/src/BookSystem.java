import java.io.IOException;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

import NetworkPackage.Answer;
import NetworkPackage.Request;
import NetworkPackage.queryType;


public class BookSystem {
	private	SocketManager	_socket;
	private	GUI				_gui;
	//private	Answer			_an;
	private	int			_userID;
	
	public	BookSystem (SocketManager sock, GUI g) {
		_socket = sock;
		_gui = g;
	}
	
	public	void	manageAnswer(Answer an) {
		switch (an.type) {
		case LOGIN:
			manageLogin(an);
			break;
		case REGISTER:
			manageRegister(an);
			break;
		case BOOKING:
			manageBooking(an);
			break;
		case CANCELING:
			manageCanceling(an);
			break;
		case DELAYING:
			manageDelaying(an);
			break;
		default:
			break;
		}
	}

	private void manageDelaying(Answer an) {
		// TODO Auto-generated method stub
		
	}

	private void manageCanceling(Answer an) {
		// TODO Auto-generated method stub
		
	}

	private void manageBooking(Answer an) {
		// TODO Auto-generated method stub
		
	}

	private void manageRegister(Answer an) {
		_gui.changeContext(guiContext.REGISTER, an.value);
	}
	
	private void manageLogin(Answer an) {
		if (an.value && an.userid > 0)
			_userID = an.userid;
		_gui.changeContext(guiContext.LOGIN, an.value);
	}

	public void register(String login, String pass) {
		Request	req = new Request();
		req.type = queryType.REGISTER;
        req.login = login;
        req.password = pass;
		_socket.sendRequest(req);
	}

	public void login(String login, String pass) {
		Request	req = new Request();
		req.type = queryType.LOGIN;
        req.login = login;
        req.password = pass;
		_socket.sendRequest(req);
	}

	public void connection(Integer port, String ip){//byte[] ip) {
		boolean res = _socket.connection(port, ip);
		_gui.changeContext(guiContext.CONNECTION, res);
	}
}
