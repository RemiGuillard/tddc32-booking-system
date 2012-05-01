import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import java.awt.GridBagLayout;
import javax.swing.JTable;
import java.awt.GridBagConstraints;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import java.awt.Insets;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;
import javax.swing.Box;

import org.freixas.jcalendar.DateEvent;
import org.freixas.jcalendar.DateListener;
//VS4E -- DO NOT REMOVE THIS LINE!
public class GuiCalendar extends JFrame {

	private static final long serialVersionUID = 1L;
	private static final String PREFERRED_LOOK_AND_FEEL = null;

	private	BookSystem	_bs;
	private JTable 		_table;
	private	TableModel 	_model;
	//private	 RowEditorModel _rm;
	private	org.freixas.jcalendar.JCalendar	_calendar;
	private	int			_currentWeek;

	private JPanel btnpanel;
	private JButton btnReload;
	private Component horizontalStrut;
	private String  title[] = {"Hour", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
	private Object[][] _data = {	
			{"8h","free","free","free","free","free","free","free"},
			{"9h","free","free","free","free","free","free","free"},
			{"10h","free","free","free","free","free","free","free"},
			{"11h","free","free","free","free","free","free","free"},
			{"12h","free","free","free","free","free","free","free"},
			{"13h","free","free","free","free","free","free","free"},
			{"14h","free","free","free","free","free","free","free"},
			{"15h","free","free","free","free","free","free","free"},
			{"16h","free","free","free","free","free","free","free"},
			{"17h","free","free","free","free","free","free","free"},
			{"18h","free","free","free","free","free","free","free"},
			{"19h","free","free","free","free","free","free","free"},
			{"20h","free","free","free","free","free","free","free"},
			{"21h","free","free","free","free","free","free","free"}
	};

	private boolean _flag;
	
	public boolean isInitialized() {
		return _flag;
	}
	
	public void setBookSys(BookSystem bookMana) {
		_bs = bookMana;
	}
	
	public GuiCalendar() {
		_flag = false;
		//initComponents();
	}
	
	private	void	createJtable() {
	    //JTABLE
		if (_table != null)
			getContentPane().remove(_table);
		_model = new TableModel(_data, title);
		_table = new JTable(_model);
		_table.setDefaultRenderer(Color.class, new ColorCellRenderer());
		_table.setDefaultEditor(Color.class, new ColorCellEditor(this, _calendar, _bs));
		_table.setRowHeight(40);
		_table.setFillsViewportHeight(true);
		_table.setColumnSelectionAllowed(true);
		_table.setCellSelectionEnabled(true);
		_table.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_table = new GridBagConstraints();
		gbc_table.gridwidth = 5;
		gbc_table.gridheight = 2;
		gbc_table.fill = GridBagConstraints.BOTH;
		gbc_table.gridx = 1;
		gbc_table.gridy = 0;
		JScrollPane scrollPane = new JScrollPane(_table);
		getContentPane().add(scrollPane, gbc_table);
	}
	
	private	int	getWeekNumber() {
        Calendar cal;
        Date date;
        int week;
        date = _calendar.getDate();
        cal = Calendar.getInstance();
        cal.setTime(date);
        week = cal.get(Calendar.WEEK_OF_YEAR);
		return week;
	}
	
	public	void	setBookOnGui(Color color, int row, int col) {
		
		_data[row][col] = color;
		_table.setValueAt(color, row, col);
		_model.setData(_data);
		
	}
	
	public void sayBookingFailed() {
		JOptionPane.showMessageDialog(this, "Booking failed", "Booking", JOptionPane.ERROR_MESSAGE);
	}
	
	public void initComponents() {
		_flag = true;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 1.0};
		gridBagLayout.rowWeights = new double[]{Double.MIN_VALUE, 1.0};
		getContentPane().setLayout(gridBagLayout);
		
		
		//add JCalendar
		_calendar = new org.freixas.jcalendar.JCalendar();
		_calendar.addDateListener(new DateListener() {
			@Override
			public void dateChanged(DateEvent arg0) {

				int week = getWeekNumber();
				if (week == _currentWeek)// || week < _todaysWeek)
					return;
				_currentWeek = week;
				_bs.askWeek(week);
			}
		});
		GridBagConstraints gbc_calendar = new GridBagConstraints();
		gbc_calendar.fill = GridBagConstraints.HORIZONTAL;
		gbc_calendar.insets = new Insets(0, 0, 5, 5);
		gbc_calendar.gridx = 0;
		gbc_calendar.gridy = 0;
		getContentPane().add(_calendar, gbc_calendar);
		
		
		createJtable();
		
		
		btnpanel = new JPanel();
		GridBagConstraints gbc_btnpanel = new GridBagConstraints();
		gbc_btnpanel.insets = new Insets(0, 0, 0, 5);
		gbc_btnpanel.fill = GridBagConstraints.BOTH;
		gbc_btnpanel.gridx = 0;
		gbc_btnpanel.gridy = 1;
		getContentPane().add(btnpanel, gbc_btnpanel);
		GridBagLayout gbl_btnpanel = new GridBagLayout();
		gbl_btnpanel.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_btnpanel.rowHeights = new int[]{0, 0, 0, 0};
		gbl_btnpanel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_btnpanel.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		btnpanel.setLayout(gbl_btnpanel);
		
		btnReload = new JButton("Reload");
		btnReload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				_bs.askWeek(getWeekNumber());
			}
		});
		GridBagConstraints gbc_btnReload = new GridBagConstraints();
		gbc_btnReload.insets = new Insets(0, 0, 5, 5);
		gbc_btnReload.gridx = 1;
		gbc_btnReload.gridy = 0;
		btnpanel.add(btnReload, gbc_btnReload);
		
		horizontalStrut = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut = new GridBagConstraints();
		gbc_horizontalStrut.insets = new Insets(0, 0, 0, 5);
		gbc_horizontalStrut.gridx = 0;
		gbc_horizontalStrut.gridy = 2;
		btnpanel.add(horizontalStrut, gbc_horizontalStrut);
		setSize(925, 516);
		_currentWeek = getWeekNumber();

		initWeek();
	}

	public	void	initWeek() {
		int	row = _table.getRowCount();
		int	col = _table.getColumnCount();
		int	i = 1;
		int j = 1;
		while (i < col) {
			j = 0;
			while(j < row) {
				_table.setValueAt(Color.green, j, i);
				++j;
			}
			++i;
		}
		_model.setData(_data);
		//createJtable();
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
