import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;

//import org.dyno.visual.swing.layouts.GroupLayout;
import java.awt.GridBagLayout;
import javax.swing.JTable;
import java.awt.GridBagConstraints;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import java.awt.Color;
import javax.swing.border.TitledBorder;
import java.awt.Insets;
import java.util.Calendar;


//VS4E -- DO NOT REMOVE THIS LINE!
public class GuiCalendar extends JFrame {

	private static final long serialVersionUID = 1L;
	private static final String PREFERRED_LOOK_AND_FEEL = null;

	private	BookSystem	_bs;
	private JTable table;
	private	DefaultTableModel model;
	private	JCalendar	calendar;

	public void setBookSys(BookSystem bookMana) {
		_bs = bookMana;
	}
	
	public GuiCalendar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0};
		gridBagLayout.columnWeights = new double[]{Double.MIN_VALUE, 0.0, 0.0, 0.0, 0.0, 1.0};
		gridBagLayout.rowWeights = new double[]{Double.MIN_VALUE, 1.0};
		getContentPane().setLayout(gridBagLayout);
		
		//add JCalendar
		calendar = new JCalendar();
		GridBagConstraints gbc_calendar = new GridBagConstraints();
		gbc_calendar.insets = new Insets(0, 0, 5, 5);
		gbc_calendar.gridx = 0;
		gbc_calendar.gridy = 0;
		getContentPane().add(calendar, gbc_calendar);
		
		//model = new DefaultTableModel();
		Object[][] data = {	
				{"8h","","","","","","",""},
				{"9h","","","","","","",""},
				{"10h","","","","","","",""},
				{"11h","","","","","","",""},
				{"12h","","","","","","",""},
				{"13h","","","","","","",""},
				{"14h","","","","","","",""},
				{"15h","","","","","","",""},
				{"16h","","","","","","",""},
				{"17h","","","","","","",""},
				{"18h","","","","","","",""},
				{"19h","","","","","","",""},
				{"20h","","","","","","",""},
				{"21h","","","","","","",""}
		};
	        //Columns title
		String  title[] = {"Hour", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		
		table = new JTable(data, title);
		table.setRowHeight(40);
		table.setFillsViewportHeight(true);
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		table.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_table = new GridBagConstraints();
		gbc_table.gridheight = 2;
		gbc_table.fill = GridBagConstraints.BOTH;
		gbc_table.gridx = 5;
		gbc_table.gridy = 0;
		JScrollPane scrollPane = new JScrollPane(table);
		getContentPane().add(scrollPane, gbc_table);
		initComponents();
	}

	private void initComponents() {

		setSize(925, 516);
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
