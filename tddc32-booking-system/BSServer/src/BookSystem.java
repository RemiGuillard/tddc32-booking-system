
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Hashtable;
import java.util.Iterator;

import NetworkPackage.Answer;
import NetworkPackage.Request;
import NetworkPackage.queryType;



public class BookSystem {
	
	private DBManager db;
	private ArrayList<Answer> calendarList;
	
	public BookSystem() throws Exception {
		db = new DBManager();
		calendarList = new ArrayList<Answer>();
		if (!db.dbConnect()) {
			System.out.println("ERROR: Can't connect to database");
			throw new Exception ();
		}
		System.out.println("Connection established");
	}
	
	public void Disconnect() {
		db.dbDisconnect();
	}
	
	public Answer	executeRequest(Request req) {
		Answer	an = new Answer();
		int		val;

		switch (req.type){
			
		case LOGIN:
			val = this.tryLogin(req.login, req.password);
			an.type = req.type;
			if (val <= -1) {
				an.value = false;
				an.errorValue = val;
				an.userid = -1;
			} else {
				an.value = true;
				an.userid = val;
			}
			break;
			
		case BOOKING:
			an.value = this.tryBooking(req.userid, req.bookdate);
			an.type = req.type;
			an.bookdate = req.bookdate;
			break;
			
		case DELAYING:
			//an.value = this.tryDelaying(req.bookid, req.bookdate);
			an.type = req.type;
			break;
			
		case CANCELING:
			an.value = this.tryCanceling(req.bookid);
			an.type = req.type;
			break;
		
		case REGISTER:
			an.value = this.tryRegister(req.login, req.password);
			an.type = req.type;
			break;
			
		case CALENDAR:
			an.value = this.getWeekBooking(req.weekYear);
			an.type = req.type;
			break;
			
		default:
			System.out.println("Error: unknown action type\n");
			an.type = queryType.UNKNOWN;
			an.value = false;
			break;
		
		}
		
		return an;
	}
	
	public ArrayList<Answer> getCalendarList() {
		return calendarList;
	}
	
	private boolean	getWeekBooking(int wkNbr) {
		calendarList.clear();
		System.out.println("GET WEEK " + wkNbr);
		Iterator<Hashtable<String, String>> it = db.selectQuery("SELECT ID, BookDate, WeekNumber, UserID FROM LaundryBooking" +
																" WHERE WeekNumber = "+wkNbr+";").iterator();
		Hashtable<String, String> res;
		Answer an = new Answer();

		an.type = queryType.CALENDAR;
		while (it.hasNext()) {
			res = (Hashtable<String, String>) it.next();
			an.bookdate = Calendar.getInstance();
			an.bookdate.setTime(new Date(Long.parseLong(res.get("BookDate"))));
			an.userid = Integer.parseInt(res.get("UserID"));
			an.bookid = Integer.parseInt(res.get("ID"));
			an.weekYear = Integer.parseInt(res.get("WeekNumber"));
			calendarList.add(an);

		}
		return true;	
	}

	private int	tryLogin(String login, String password) {
		Iterator<Hashtable<String, String>> it = db.selectQuery("SELECT ID, PassWord FROM LaundryUsers WHERE UserName = '"+login+"';").iterator();
		Hashtable<String, String> res;
		System.out.println("LOGIN");
		if (it.hasNext()) {
			res = (Hashtable<String, String>) it.next();
			if (res.get("PassWord").equals(password))
				return Integer.parseInt(res.get("ID"));
		}
		
		return -1;
	}

	private boolean tryBooking(int userid, Calendar d) {
		System.out.println("BOOKING");
		String date = "" + d.getTime().getTime();
		
		int wkNb = d.get(Calendar.WEEK_OF_YEAR);
		
		return db.insertQuery("INSERT INTO LaundryBooking (UserID, BookDate, WeekNumber) VALUES ("+userid+", "+date+", "+wkNb+");");

	}
	
	private boolean tryDelaying(int id, Date d) {
		
		String date = "" + d.getTime();
		Iterator<Hashtable<String, String>> it = db.selectQuery("SELECT ID FROM LaundryBooking WHERE BookDate = '"+date+"';").iterator();
		Hashtable<String, String> res;
		
		if (it.hasNext()) {
			res = (Hashtable<String, String>) it.next();

			return false;
		}

		return db.insertQuery("UPDATE LaundryBooking SET BookDate = '"+date+"' WHERE ID = "+id+";");
	}
	
	private boolean tryCanceling(int bookid) {
		
		return db.insertQuery("DELETE FROM LaundryBooking WHERE ID = "+bookid+";");
	}
	
	private boolean tryRegister(String login, String password) {
		
		return db.insertQuery("INSERT INTO LaundryUsers (UserName, PassWord) VALUES ('"+login+"', '"+password+"');");
		
	}
}
