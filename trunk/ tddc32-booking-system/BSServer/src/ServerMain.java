
public class ServerMain {

	private BookSystem bs;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SocketManager sock = new SocketManager(/* BOOK SYS */);
		sock.run();
		
	}
	

}
