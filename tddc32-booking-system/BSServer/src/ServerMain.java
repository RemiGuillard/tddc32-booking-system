
public class ServerMain {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BookSystem bs;
		
		try {
			bs = new BookSystem();
		} catch (Exception e) {
			System.out.println("Unable to initialiase connection to DB");
			return;
		}
		
		SocketManager sock = new SocketManager();
		sock.setBs(bs);
		sock.run();
		
	}
	

}
