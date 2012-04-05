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
	private	Answer			_an;
	
	public	BookSystem (SocketManager sock, GUI g) {
		_socket = sock;
		_gui = g;
	}
	
	public	void	manageAnswer(Answer an) {
		
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

	public void connection(Integer port, byte[] ip) {
		_socket.connection(port, ip);
	}
}
