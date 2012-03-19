
public class BookSystem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//SocketManager sock = new SocketManager(/* BOOK SYS */);
		//sock.run();
		DBManager db = new DBManager();
		if (!db.dbConnect()) {
			System.out.println("ERROR: Can't connect to database");
		}
		System.out.println("Connection established");
		System.out.println(db.executeQuery("SELECT * FROM LaundryUsers;"));
		db.dbDisconnect();
	}

}
