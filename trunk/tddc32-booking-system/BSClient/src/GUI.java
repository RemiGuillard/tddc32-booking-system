import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.JLayeredPane;
import javax.swing.JDesktopPane;
import javax.swing.Box;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.CardLayout;
import java.awt.Insets;
import javax.swing.SwingConstants;
import javax.swing.JTabbedPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Map;
import java.util.Vector;

import javax.swing.JTextPane;


public class GUI extends JFrame implements ActionListener {
	private JMenuBar menuBar;
	private JMenu mnFile;
	private JMenuItem mntmExit;
	private	JPanel loginPan;
	private JPanel connectionPan;
	private JLabel lblServerInformations;
	private JPanel ipPan;
	private JPanel portPanel;
	private JLabel lblIp;
	private JTextField _IP1;
	private JTextField _IP2;
	private JTextField _IP3;
	private JTextField _IP4;
	private JLabel lblPort;
	private JTextField _Port;
	private JButton btnConnection;
	private Box verticalBox;
	private JPanel panel_1;
	private JLabel lblLogin;
	private JLabel lblPassword;
	private JTextField _login;
	private JTextField _password;
	private JPanel MessagePan;
	private JTextPane _msg;
	private JButton btnEnter;
	private	SocketManager _sock;
	//private Map<String, JTextField> _textFields;
	//private Map<String, JPanel> _panels;

	/**
	 * Create the frame.
	 */
	public GUI(SocketManager sock) {
		
		_sock = sock;
		_sock.linkGUI(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 487, 367);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		mntmExit = new JMenuItem("exit");
		mnFile.add(mntmExit);
		getContentPane().setLayout(new CardLayout(0, 0));
		
		loginPan = new JPanel();
		getContentPane().add(loginPan, "name_113644680099056");
		loginPan.setLayout(new GridLayout(1, 0, 0, 0));
		
		verticalBox = Box.createVerticalBox();
		loginPan.add(verticalBox);
		
		panel_1 = new JPanel();
		verticalBox.add(panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{167, 39, 0, 106, 0};
		gbl_panel_1.rowHeights = new int[]{16, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		lblLogin = new JLabel("Login :");
		GridBagConstraints gbc_lblLogin = new GridBagConstraints();
		gbc_lblLogin.insets = new Insets(0, 0, 5, 5);
		gbc_lblLogin.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblLogin.gridx = 1;
		gbc_lblLogin.gridy = 4;
		panel_1.add(lblLogin, gbc_lblLogin);
		
		_login = new JTextField();
		//_textFields.put("_login", new JTextField());
		GridBagConstraints gbc__login = new GridBagConstraints();
		gbc__login.fill = GridBagConstraints.HORIZONTAL;
		gbc__login.insets = new Insets(0, 0, 5, 0);
		gbc__login.gridx = 3;
		gbc__login.gridy = 4;
		panel_1.add(_login, gbc__login);
		//_textFields.get("_login").setColumns(10);
		_login.setColumns(10);
		
		lblPassword = new JLabel("Password :");
		GridBagConstraints gbc_lblPassword = new GridBagConstraints();
		gbc_lblPassword.insets = new Insets(0, 0, 5, 5);
		gbc_lblPassword.gridx = 1;
		gbc_lblPassword.gridy = 5;
		panel_1.add(lblPassword, gbc_lblPassword);
		
		_password = new JTextField();
		//_textFields.put("_password", new JTextField());
		GridBagConstraints gbc__password = new GridBagConstraints();
		gbc__password.insets = new Insets(0, 0, 5, 0);
		gbc__password.fill = GridBagConstraints.HORIZONTAL;
		gbc__password.gridx = 3;
		gbc__password.gridy = 5;
		panel_1.add(_password, gbc__password);
		//_textFields.get("_password").setColumns(10);
		_password.setColumns(10);
		
		btnEnter = new JButton("Enter");
		GridBagConstraints gbc_btnEnter = new GridBagConstraints();
		gbc_btnEnter.insets = new Insets(0, 0, 0, 5);
		gbc_btnEnter.gridx = 1;
		gbc_btnEnter.gridy = 7;
		panel_1.add(btnEnter, gbc_btnEnter);
		
		connectionPan = new JPanel();
		
		lblServerInformations = new JLabel("Server informations :");
		
		ipPan = new JPanel();
		FlowLayout flowLayout = (FlowLayout) ipPan.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		
		portPanel = new JPanel();
		FlowLayout fl_portPanel = (FlowLayout) portPanel.getLayout();
		fl_portPanel.setAlignment(FlowLayout.LEFT);
		
		btnConnection = new JButton("Connection");
		
		GroupLayout gl_connectionPan = new GroupLayout(connectionPan);
		gl_connectionPan.setHorizontalGroup(
			gl_connectionPan.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_connectionPan.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_connectionPan.createParallelGroup(Alignment.LEADING)
						.addComponent(portPanel, GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
						.addComponent(ipPan, GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
						.addComponent(lblServerInformations)
						.addComponent(btnConnection))
					.addContainerGap())
		);
		gl_connectionPan.setVerticalGroup(
			gl_connectionPan.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_connectionPan.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblServerInformations)
					.addGap(18)
					.addComponent(ipPan, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(portPanel, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnConnection)
					.addContainerGap(109, Short.MAX_VALUE))
		);
		
		lblPort = new JLabel("Port :");
		portPanel.add(lblPort);
		
		_Port = new JTextField();
		_Port.setText("42042");
		portPanel.add(_Port);
		_Port.setColumns(10);
		
		lblIp = new JLabel("IP :");
		ipPan.add(lblIp);
		
		_IP1 = new JTextField();
		_IP1.setText("127");
		ipPan.add(_IP1);
		_IP1.setColumns(3);
		
		_IP2 = new JTextField();
		_IP2.setText("0");
		ipPan.add(_IP2);
		_IP2.setColumns(3);
		
		_IP3 = new JTextField();
		_IP3.setText("0");
		ipPan.add(_IP3);
		_IP3.setColumns(3);
		
		_IP4 = new JTextField();
		_IP4.setText("1");
		ipPan.add(_IP4);
		_IP4.setColumns(3);
		connectionPan.setLayout(gl_connectionPan);
		getContentPane().add(connectionPan, "name_113636549710167");
		
		MessagePan = new JPanel();
		getContentPane().add(MessagePan, "name_67696188355853");
		MessagePan.setLayout(new BoxLayout(MessagePan, BoxLayout.X_AXIS));
		
		_msg = new JTextPane();
		MessagePan.add(_msg);
		
		/* 
		 * Action Lister Part
		 */
		btnConnection.addActionListener(this);
		btnEnter.addActionListener(this);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
        if(arg0.getSource() == btnEnter)
        	actionBtnEnter();
        if(arg0.getSource() == btnConnection)
        	actionBtnConnection();
	}
	
	public	void	actionBtnEnter() {
		boolean	check = false;
		check = _sock.login(_login.getText(), _password.getText());
		if (check) {
			loginPan.hide();
			connectionPan.show();
		}
	}
	
	public	void	actionBtnConnection() {
		boolean check = false;
		byte[]	ip = {
				Byte.valueOf(_IP1.getText()),
				Byte.valueOf(_IP2.getText()),
				Byte.valueOf(_IP3.getText()),
				Byte.valueOf(_IP4.getText()),
		};
		check = _sock.connection(Integer.valueOf(_Port.getText()), ip);
		if (check) {
			connectionPan.hide();
			MessagePan.show();
		}
	}
	
}
