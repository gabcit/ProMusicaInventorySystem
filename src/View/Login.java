package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class Login {

	private JFrame frame;
	private JTextField usrNameTF;
	private JPasswordField usrPassPF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.getFrame().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setFrame(new JFrame());
		getFrame().setBounds(100, 100, 271, 164);
		getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getFrame().getContentPane().setLayout(new MigLayout("", "[223.00,grow][]", "[][][][][]"));
		
		usrNameTF = new JTextField();
		getFrame().getContentPane().add(usrNameTF, "cell 0 0,alignx center");
		usrNameTF.setColumns(15);
		
		usrPassPF = new JPasswordField();
		usrPassPF.setColumns(15);
		usrPassPF.setEchoChar('*');
		usrPassPF.setText("usrPassPF");
		getFrame().getContentPane().add(usrPassPF, "cell 0 1,alignx center");
		
		JButton btnLogin = new JButton("Login");
		getFrame().getContentPane().add(btnLogin, "cell 0 3,alignx right");
		
		JButton btnExit = new JButton("Exit");
		getFrame().getContentPane().add(btnExit, "cell 1 3,alignx center");
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

}
