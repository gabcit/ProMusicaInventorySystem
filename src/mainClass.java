import java.awt.EventQueue;

import View.*;
//import Model.*;
//import Controller.*;




public class mainClass {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.getFrame().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
