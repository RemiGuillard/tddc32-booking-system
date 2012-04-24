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

import javax.swing.JDialog;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.JLayeredPane;
import javax.swing.JDesktopPane;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.Popup;

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
import javax.swing.JPasswordField;

import NetworkPackage.queryType;


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
	private JPanel MessagePan;
	private JTextPane _msg;
	private JButton btnEnter;
	private JPasswordField _password;
	private JButton btnRegister;
	private JPanel registerPan;
	private JLabel lbllogin;
	private JLabel lblPassword_1;
	private JLabel lblPasswordVerification;
	private JPasswordField RpasswordV;
	private JPasswordField Rpassword;
	private JTextField Rlogin;
	private JButton btnRegister_1;
	private	BookSystem	_bs;

	//private Map<String, JTextField> _textFields;
	//private Map<String, JPanel> _panels;
	//private	SocketManager _sock;

	/**
	 * Create the frame.
	 */
	public GUI() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 487, 367);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		mntmExit = new JMenuItem("exit");
		mnFile.add(mntmExit);
		getContentPane().setLayout(new CardLayout(0, 0));
		
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
		
		loginPan = new JPanel();
		getContentPane().add(loginPan, "name_113644680099056");
		loginPan.setLayout(new GridLayout(1, 0, 0, 0));
		
		verticalBox = Box.createVerticalBox();
		loginPan.add(verticalBox);
		
		panel_1 = new JPanel();
		verticalBox.add(panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{167, 39, 0, 102, 0, 0};
		gbl_panel_1.rowHeights = new int[]{16, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
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
		gbc__login.insets = new Insets(0, 0, 5, 5);
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
		
		_password = new JPasswordField();
		GridBagConstraints gbc__password = new GridBagConstraints();
		gbc__password.insets = new Insets(0, 0, 5, 5);
		gbc__password.fill = GridBagConstraints.HORIZONTAL;
		gbc__password.gridx = 3;
		gbc__password.gridy = 5;
		panel_1.add(_password, gbc__password);
		
		btnEnter = new JButton("Enter");
		GridBagConstraints gbc_btnEnter = new GridBagConstraints();
		gbc_btnEnter.insets = new Insets(0, 0, 0, 5);
		gbc_btnEnter.gridx = 1;
		gbc_btnEnter.gridy = 7;
		panel_1.add(btnEnter, gbc_btnEnter);
		
		btnRegister = new JButton("register");
		GridBagConstraints gbc_btnRegister = new GridBagConstraints();
		gbc_btnRegister.insets = new Insets(0, 0, 0, 5);
		gbc_btnRegister.gridx = 3;
		gbc_btnRegister.gridy = 7;
		panel_1.add(btnRegister, gbc_btnRegister);
		btnEnter.addActionListener(this);
		btnRegister.addActionListener(this);
		
		MessagePan = new JPanel();
		getContentPane().add(MessagePan, "name_67696188355853");
		MessagePan.setLayout(new BoxLayout(MessagePan, BoxLayout.X_AXIS));
		
		_msg = new JTextPane();
		MessagePan.add(_msg);
		
		registerPan = new JPanel();
		getContentPane().add(registerPan, "name_28334384569391");
		GridBagLayout gbl_registerPan = new GridBagLayout();
		gbl_registerPan.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_registerPan.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_registerPan.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_registerPan.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		registerPan.setLayout(gbl_registerPan);
		
		lbllogin = new JLabel("Login :");
		lbllogin.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_lbllogin = new GridBagConstraints();
		gbc_lbllogin.anchor = GridBagConstraints.WEST;
		gbc_lbllogin.insets = new Insets(0, 0, 5, 5);
		gbc_lbllogin.gridx = 4;
		gbc_lbllogin.gridy = 4;
		registerPan.add(lbllogin, gbc_lbllogin);
		
		Rlogin = new JTextField();
		GridBagConstraints gbc_Rlogin = new GridBagConstraints();
		gbc_Rlogin.insets = new Insets(0, 0, 5, 5);
		gbc_Rlogin.fill = GridBagConstraints.HORIZONTAL;
		gbc_Rlogin.gridx = 6;
		gbc_Rlogin.gridy = 4;
		registerPan.add(Rlogin, gbc_Rlogin);
		Rlogin.setColumns(10);
		
		lblPassword_1 = new JLabel("Password :");
		GridBagConstraints gbc_lblPassword_1 = new GridBagConstraints();
		gbc_lblPassword_1.anchor = GridBagConstraints.WEST;
		gbc_lblPassword_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblPassword_1.gridx = 4;
		gbc_lblPassword_1.gridy = 5;
		registerPan.add(lblPassword_1, gbc_lblPassword_1);
		
		Rpassword = new JPasswordField();
		GridBagConstraints gbc_Rpassword = new GridBagConstraints();
		gbc_Rpassword.insets = new Insets(0, 0, 5, 5);
		gbc_Rpassword.fill = GridBagConstraints.HORIZONTAL;
		gbc_Rpassword.gridx = 6;
		gbc_Rpassword.gridy = 5;
		registerPan.add(Rpassword, gbc_Rpassword);
		
		lblPasswordVerification = new JLabel("Password verification :");
		GridBagConstraints gbc_lblPasswordVerification = new GridBagConstraints();
		gbc_lblPasswordVerification.insets = new Insets(0, 0, 5, 5);
		gbc_lblPasswordVerification.anchor = GridBagConstraints.WEST;
		gbc_lblPasswordVerification.gridx = 4;
		gbc_lblPasswordVerification.gridy = 6;
		registerPan.add(lblPasswordVerification, gbc_lblPasswordVerification);
		
		RpasswordV = new JPasswordField();
		GridBagConstraints gbc_RpasswordV = new GridBagConstraints();
		gbc_RpasswordV.insets = new Insets(0, 0, 5, 5);
		gbc_RpasswordV.fill = GridBagConstraints.HORIZONTAL;
		gbc_RpasswordV.gridx = 6;
		gbc_RpasswordV.gridy = 6;
		registerPan.add(RpasswordV, gbc_RpasswordV);
		
		btnRegister_1 = new JButton("Register");
		GridBagConstraints gbc_btnRegister_1 = new GridBagConstraints();
		gbc_btnRegister_1.insets = new Insets(0, 0, 0, 5);
		gbc_btnRegister_1.gridx = 4;
		gbc_btnRegister_1.gridy = 7;
		registerPan.add(btnRegister_1, gbc_btnRegister_1);
		
		/* 
		 * Action Lister Part
		 */
		btnConnection.addActionListener(this);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
        if(arg0.getSource() == btnEnter)
        	actionBtnLogin();
        else if(arg0.getSource() == btnConnection)
        	actionBtnConnection();
        else if (arg0.getSource() == btnRegister)
        	changeContext(guiContext.REGISTRATION, true);
        else if (arg0.getSource() == btnRegister_1)
        	actionBtnRegister();
	}

	@SuppressWarnings("deprecation")
	public	void	changeContext(guiContext context, Boolean action) {
		Component obj = getFocusOwner();
		if (action) {
			obj.hide();
			switch (context) {
			case	LOGIN:
				MessagePan.show();
				break;
			case	REGISTRATION:
	    		registerPan.show();
				break;
			case	REGISTER:
				loginPan.show();
				break;
			case	CONNECTION:
				loginPan.show();
				break;
			default:
				obj.show();
				errorManagement(guiContext.NOTFOUND);
				break;
			}
		}
		else
			errorManagement(context);
	}
	
	private void errorManagement(guiContext context) {
		String msg;
		switch (context) {
		case LOGIN:
			msg = "Login could not be performed please try again later";
			break;
		case REGISTRATION:
			msg = "Registration impossible";
			break;
		case REGISTER:
			msg = "Impossible to register please try again later";
			break;
		case CONNECTION:
			msg = "Connection impossible please try again later";
			break;
		case NOTFOUND:
			msg = "Page not found";
			break;
		default:
			msg = "Unknowed error appeared";
			break;
		}
		JOptionPane.showMessageDialog(this, msg, "Error",JOptionPane.ERROR_MESSAGE);
	}

	public	void	actionBtnRegister() {
		// TODO verif password
		_bs.register(Rlogin.getText(), Rpassword.getText());
	}
	
	public	void	actionBtnLogin() {
		_bs.login(_login.getText(), _password.getText());
	}
	
	public	void	actionBtnConnection() {
		String ipStr = _IP1.getText() + "." + _IP2.getText() + "." + _IP3.getText() + "." + _IP4.getText();
		/*byte[]	ip = {
				Byte.parseByte(_IP1.getText()),
				Byte.parseByte(_IP2.getText()),
				Byte.parseByte(_IP3.getText()),
				Byte.parseByte(_IP4.getText()),
		};*/
		_bs.connection(Integer.valueOf(_Port.getText()), ipStr);
	}

	public void setBookSys(BookSystem bookMana) {
		_bs = bookMana;
	}
}
