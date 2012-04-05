import java.awt.EventQueue;


public class Main {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SocketManager	sock = new SocketManager();
					GUI frame = new GUI();
					BookSystem	bookMana = new BookSystem(sock, frame);
					sock.setBookSys(bookMana);
					frame.setBookSys(bookMana);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
