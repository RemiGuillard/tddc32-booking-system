import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import java.awt.GridBagLayout;
import javax.swing.JPanel;
import java.awt.GridBagConstraints;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


//VS4E -- DO NOT REMOVE THIS LINE!
public class GuiRegister extends JFrame {

	private static final long serialVersionUID = 1L;
	private static final String PREFERRED_LOOK_AND_FEEL = null;
	private JTextField loginField;
	private JTextField passwordField;
	private JTextField confirmField;

	private	BookSystem	_bs;

	public void setBookSys(BookSystem bookMana) {
		_bs = bookMana;
	}
	
	public GuiRegister() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		initComponents();
	}

	private void initComponents() {
		setSize(240, 180);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		JPanel loginPanel = new JPanel();
		GridBagConstraints gbc_loginPanel = new GridBagConstraints();
		gbc_loginPanel.fill = GridBagConstraints.BOTH;
		gbc_loginPanel.gridx = 0;
		gbc_loginPanel.gridy = 0;
		getContentPane().add(loginPanel, gbc_loginPanel);
		
		Box verticalBox = Box.createVerticalBox();
		loginPanel.add(verticalBox);
		
		JLabel lblNewLabel = new JLabel("Register settings");
		verticalBox.add(lblNewLabel);
		
		Box horizontalBox = Box.createHorizontalBox();
		verticalBox.add(horizontalBox);
		
		JLabel lblNewLabel_1 = new JLabel("Login :            ");
		horizontalBox.add(lblNewLabel_1);
		
		loginField = new JTextField();
		horizontalBox.add(loginField);
		loginField.setColumns(10);
		
		Box horizontalBox_1 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password :     ");
		horizontalBox_1.add(lblNewLabel_2);
		
		passwordField = new JTextField();
		horizontalBox_1.add(passwordField);
		passwordField.setColumns(10);
		
		Box horizontalBox_3 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_3);
		
		JLabel lblNewLabel_3 = new JLabel("Confirmation: ");
		horizontalBox_3.add(lblNewLabel_3);
		
		confirmField = new JTextField();
		horizontalBox_3.add(confirmField);
		confirmField.setColumns(10);
		
		Box horizontalBox_2 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_2);
		
		JButton btnLogin = new JButton("Register");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (passwordField.getText().equals(confirmField.getText()))
					_bs.register(loginField.getText(), passwordField.getText());
				else
					displayErrorMessage(confirmField.getText());
			}
		});
		horizontalBox_2.add(btnLogin);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				_bs.cancelResgitration();
			}
		});
		horizontalBox_2.add(btnCancel);
	}

	private void displayErrorMessage(String pwd) {
		if (pwd.isEmpty())
			JOptionPane.showMessageDialog(this, "Please enter the confirmation password", "Error", JOptionPane.ERROR_MESSAGE);
		else
			JOptionPane.showMessageDialog(this, "The confirmation password is different from the password", "Error", JOptionPane.ERROR_MESSAGE);
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
				GuiRegister frame = new GuiRegister();
				frame.setDefaultCloseOperation(GuiRegister.EXIT_ON_CLOSE);
				frame.setTitle("GuiRegister");
				frame.getContentPane().setPreferredSize(frame.getSize());
				frame.pack();
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
			}
		});
	}
	
	public void sayRegistrationFailed() {
		JOptionPane.showMessageDialog(this, "Registration failed", "Registration", JOptionPane.ERROR_MESSAGE);
	}
}
