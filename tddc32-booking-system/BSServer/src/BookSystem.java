
import java.util.Hashtable;
import java.util.Iterator;

import NetworkPackage.Answer;
import NetworkPackage.Request;
import NetworkPackage.queryType;



public class BookSystem {
	
	private DBManager db;
	
	public BookSystem() throws Exception {
		db = new DBManager();
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
			this.tryBooking();
			break;
			
		case DELAYING:
			this.tryDelaying();
			break;
			
		case CANCELING:
			this.tryCanceling();
			break;
		
		case REGISTER:
			this.tryRegister();
			break;
			
		default:
			System.out.println("Error: unknown action type\n");
			an.type = queryType.UNKNOWN;
			an.value = false;
			break;
		
		}
		
		return an;
	}
	
	private int	tryLogin(String login, String password) {
		Iterator<Hashtable<String, String>> it = db.executeQuery("SELECT ID, PassWord FROM LaundryUsers WHERE UserName = '"+login+"';").iterator();
		Hashtable<String, String> res;
		
		if (it.hasNext()) {
			res = (Hashtable<String, String>) it.next();
			if (res.get("PassWord").equals(password))
				return Integer.parseInt(res.get("ID"));
		}
		
		return -1;
	}

	private boolean tryBooking() {
		
		return true;
	}
	
	private boolean tryDelaying() {
		
		return true;
	}
	
	private boolean tryCanceling() {
		
		return true;
	}
	
	private boolean tryRegister() {
		
		return true;
	}
}
