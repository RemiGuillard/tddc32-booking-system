import java.awt.Color;
import java.io.IOException;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Calendar;

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
		System.out.println(an);
		if (an != null)
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
		case CALENDAR:
			manageCalendar(an);
			break;
		default:
			break;
		}
	}

	private void manageDelaying(Answer an) {
		// TODO Auto-generated method stub
		
	}
	
	private void manageCalendar(Answer an) {
		// TODO Auto-generated method stub
		if (an.value) {
			int row = an.bookdate.get(Calendar.HOUR_OF_DAY) - 8;
			int col = an.bookdate.get(Calendar.DAY_OF_WEEK) - 1;
			if (an.userid == _userID)
				_cal.setBookOnGui(Color.orange, row, col);
			else if (an.userid != _userID)
				_cal.setBookOnGui(Color.red, row, col);
		}
		
	}

	private void manageCanceling(Answer an) {
		if (an.value) {
			int row = an.bookdate.get(Calendar.HOUR_OF_DAY) - 8;
			int col = an.bookdate.get(Calendar.DAY_OF_WEEK) - 1;
			_cal.setBookOnGui(Color.green, row, col);
		}
		
	}

	private void manageBooking(Answer an) {
		if (an.value) {
			int row = an.bookdate.get(Calendar.HOUR_OF_DAY) - 8;
			int col = an.bookdate.get(Calendar.DAY_OF_WEEK) - 1;
			_cal.setBookOnGui(Color.orange, row, col);
		}
	}
	
	private void manageRegister(Answer an) {
		if (an.value) {
			_reg.setVisible(false);
			_log.setVisible(true);
			_log.sayRegistrationSuccesful();
		} else 
			_reg.sayRegistrationFailed();
	}
	
	private void manageLogin(Answer an) {
		if (an.value && an.userid > 0) {
			_userID = an.userid;
			_log.setVisible(false);
			_cal.setVisible(true);
			_cal.setBookSys(this);
			_cal.initComponents();
			askWeek(Calendar.getInstance().get(Calendar.WEEK_OF_YEAR));
		} else 
			_log.sayLoginFailed();
	//	_gui.changeContext(guiContext.LOGIN, an.value);
	}
	
	public 	void	askWeek(int nbWeek) {
		Request	req	= new Request();
		req.type = queryType.CALENDAR;
		req.userid = _userID;
		req.weekYear = nbWeek;
		_socket.sendRequest(req);
	}
	
	public	void	book(Calendar cal) {
		Request	req	= new Request();
		req.type = queryType.BOOKING;
		req.userid = _userID;
		req.bookdate = cal;
		_socket.sendRequest(req);
	}
	
	public void Cancel(Calendar cal) {
		Request	req	= new Request();
		req.type = queryType.CANCELING;
		req.userid = _userID;
		req.bookdate = cal;
		_socket.sendRequest(req);
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
