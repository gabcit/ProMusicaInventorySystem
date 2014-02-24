package View;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginPanel extends JPanel {
	private JTextField usrNameTF;
	private JPasswordField usrPassPF;

	/**
	 * Create the panel.
	 */
	public LoginPanel() {
		setLayout(new MigLayout("", "[150px][][][grow][]", "[100px][][][][][]"));
		
		usrNameTF = new JTextField();
		add(usrNameTF, "cell 2 1,alignx left");
		usrNameTF.setColumns(15);
		
		usrPassPF = new JPasswordField();
		usrPassPF.setColumns(15);
		add(usrPassPF, "cell 2 2,alignx left");
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		add(btnLogin, "cell 2 5,growx");

	}

}
