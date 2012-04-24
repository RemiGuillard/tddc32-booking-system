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
					GuiConnect co = new GuiConnect();
					
					BookSystem	bookMana = new BookSystem(sock, co);
					sock.setBookSys(bookMana);
					co.setBookSys(bookMana);
					co.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
