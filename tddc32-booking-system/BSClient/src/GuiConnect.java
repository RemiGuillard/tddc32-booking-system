import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.BoxLayout;
import javax.swing.Box;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


//VS4E -- DO NOT REMOVE THIS LINE!
public class GuiConnect extends JFrame {

	private static final long serialVersionUID = 1L;
	private static final String PREFERRED_LOOK_AND_FEEL = null;
	private JTextField ipField1;
	private JTextField ipField2;
	private JTextField ipField3;
	private JTextField ipField4;
	private JTextField portField;
	
	private	BookSystem	_bs;

	public void setBookSys(BookSystem bookMana) {
		_bs = bookMana;
	}
	
	public GuiConnect() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		initComponents();
	}

	private void initComponents() {
		setSize(291, 185);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		JPanel connectionPanel = new JPanel();
		GridBagConstraints gbc_connectionPanel = new GridBagConstraints();
		gbc_connectionPanel.fill = GridBagConstraints.BOTH;
		gbc_connectionPanel.gridx = 0;
		gbc_connectionPanel.gridy = 0;
		getContentPane().add(connectionPanel, gbc_connectionPanel);
		connectionPanel.setLayout(new BoxLayout(connectionPanel, BoxLayout.X_AXIS));
		
		Box verticalBox = Box.createVerticalBox();
		connectionPanel.add(verticalBox);
		
		JLabel lblConnectionSettings = new JLabel("Connection settings");
		verticalBox.add(lblConnectionSettings);
		
		JPanel ipFieldPanel = new JPanel();
		verticalBox.add(ipFieldPanel);
		
		Box horizontalBox = Box.createHorizontalBox();
		ipFieldPanel.add(horizontalBox);
		
		JLabel lblServerIp = new JLabel("Server ip: ");
		horizontalBox.add(lblServerIp);
		
		ipField1 = new JTextField();
		ipField1.setText("127");
		horizontalBox.add(ipField1);
		ipField1.setColumns(4);
		
		JLabel lblPt1 = new JLabel(".");
		horizontalBox.add(lblPt1);
		
		ipField2 = new JTextField();
		ipField2.setText("0");
		horizontalBox.add(ipField2);
		ipField2.setColumns(4);
		
		JLabel lblPt2 = new JLabel(".");
		horizontalBox.add(lblPt2);
		
		ipField3 = new JTextField();
		ipField3.setText("0");
		horizontalBox.add(ipField3);
		ipField3.setColumns(4);
		
		JLabel lblPt3 = new JLabel(".");
		horizontalBox.add(lblPt3);
		
		ipField4 = new JTextField();
		ipField4.setText("1");
		horizontalBox.add(ipField4);
		ipField4.setColumns(4);
		
		JPanel portFieldPanel = new JPanel();
		verticalBox.add(portFieldPanel);
		
		Box verticalBox_1 = Box.createVerticalBox();
		portFieldPanel.add(verticalBox_1);
		
		JLabel lblServerPort = new JLabel("Server port");
		verticalBox_1.add(lblServerPort);
		
		portField = new JTextField();
		portField.setText("42042");
		verticalBox_1.add(portField);
		portField.setColumns(10);
		
		JPanel connectButtonPanel = new JPanel();
		verticalBox.add(connectButtonPanel);
		
		JButton btnConnection = new JButton("Connection");
		btnConnection.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent btn) {
				String ipStr = ipField1.getText() + "." + ipField2.getText() + "." + ipField3.getText() + "." + ipField4.getText();
				
				_bs.connection(Integer.valueOf(portField.getText()), ipStr);
			}
		});
		connectButtonPanel.add(btnConnection);
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
				GuiConnect frame = new GuiConnect();
				frame.setDefaultCloseOperation(GuiConnect.EXIT_ON_CLOSE);
				frame.setTitle("GuiConnect");
				frame.getContentPane().setPreferredSize(frame.getSize());
				frame.pack();
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
			}
		});
	}
	
	public void displayErrorMessage() {
		JOptionPane.showMessageDialog(this, "Connection impossible please try again later", "Error", JOptionPane.ERROR_MESSAGE);
	}
	
	public void displayDiscoMsg() {
		JOptionPane.showMessageDialog(this, "Connection has been lost", "Error", JOptionPane.ERROR_MESSAGE);
	}
}
