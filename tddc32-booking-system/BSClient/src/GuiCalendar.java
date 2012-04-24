import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import org.dyno.visual.swing.layouts.GroupLayout;
import java.awt.GridBagLayout;


//VS4E -- DO NOT REMOVE THIS LINE!
public class GuiCalendar extends JFrame {

	private static final long serialVersionUID = 1L;
	private static final String PREFERRED_LOOK_AND_FEEL = null;

	private	BookSystem	_bs;

	public void setBookSys(BookSystem bookMana) {
		_bs = bookMana;
	}
	
	public GuiCalendar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0};
		gridBagLayout.rowHeights = new int[]{0};
		gridBagLayout.columnWeights = new double[]{Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		initComponents();
	}

	private void initComponents() {
		setSize(320, 240);
	}

	private static void installLnF() {
		try {
			String lnfClassname = PREFERRED_LOOK_AND_FEEL;
			if (lnfClassname == null)
				lnfClassname = UIManager.getCrossPlatformLookAndFeelClassName();
			UIManager.setLookAndFeel(lnfClassname);
		} catch (Exception e) {
			System.err.println("Cannot install " + PREFERRED_LOOK_AND_FEEL
					+ " on this platform:" + e.getMessage());
		}
	}

	/**
	 * Main entry of the class.
	 * Note: This class is only created so that you can easily preview the result at runtime.
	 * It is not expected to be managed by the designer.
	 * You can modify it as you like.
	 */
	public static void main(String[] args) {
		installLnF();
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				GuiCalendar frame = new GuiCalendar();
				frame.setDefaultCloseOperation(GuiCalendar.EXIT_ON_CLOSE);
				frame.setTitle("GuiCalendar");
				frame.getContentPane().setPreferredSize(frame.getSize());
				frame.pack();
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
			}
		});
	}

}
