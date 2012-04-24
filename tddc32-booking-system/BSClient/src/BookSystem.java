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
	private GuiLogin 		_log;
	private GuiConnect 		_co;
	private GuiRegister 	_reg;
	private GuiCalendar 	_cal;
	
	//private	Answer			_an;
	private	int			_userID;
	
	public	BookSystem (SocketManager sock, GuiConnect co) {
		_socket = sock;
		_co = co;
		_log = new GuiLogin();
		_reg = new GuiRegister();
		_cal = new GuiCalendar();
		_log.setBookSys(this);
		_reg.setBookSys(this);
		_cal.setBookSys(this);
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
		if (an.value) {
			_reg.setVisible(false);
			_log.setVisible(true);
			_log.sayRegistrationSuccesful();
		} else 
			_reg.sayRegistrationFailed();
			
		//		_gui.changeContext(guiContext.REGISTER, an.value);
	}
	
	private void manageLogin(Answer an) {
		if (an.value && an.userid > 0) {
			_userID = an.userid;
			_log.setVisible(false);
			_cal.setVisible(true);
		} else 
			_log.sayLoginFailed();
	//	_gui.changeContext(guiContext.LOGIN, an.value);
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

	public void cancelResgitration() {
		_reg.setVisible(false);
		_log.setVisible(true);
	}
	
	public void registerScreen() {
		_log.setVisible(false);
		_reg.setVisible(true);
	}

	public void connection(Integer port, String ip){//byte[] ip) {
		if (_socket.connection(port, ip)) {
			_co.setVisible(false);
			_log.setVisible(true);
		} else {
		_co.displayErrorMessage();
		}
	}
	
	public void resetConnection() {
		if (_log.isVisible())
			_log.setVisible(false);
		if (_cal.isVisible())
			_cal.setVisible(false);
		if (_reg.isVisible())
			_reg.setVisible(false);
		_co.setVisible(true);
		_co.displayDiscoMsg();
	}

}
