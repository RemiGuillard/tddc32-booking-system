
import java.util.Hashtable;
import java.util.Iterator;

import NetworkPackage.Answer;
import NetworkPackage.Request;



public class BookSystem {
	
	private DBManager db;
	
	public BookSystem() {
		db = new DBManager();
		if (!db.dbConnect()) {
			System.out.println("ERROR: Can't connect to database");
			// TODO Throw exception
		}
		System.out.println("Connection established");
	}
	
	public void Disconnect() {
		db.dbDisconnect();
	}

	public Answer	executeRequest(Request req) {
		Answer an = new Answer();
		
		switch (req.type){
			
		case 1:
			this.tryLogin(req.login, req.password);
			
		case 2:
			this.tryBooking();
			
		case 3:
			this.tryDelaying();
			
		case 4:
			this.tryCanceling();
			
		default:
			System.out.println("Error: unknown action type\n");
		
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
}
