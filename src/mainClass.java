import java.awt.EventQueue;

import View.*;
import Model.*;
import Controller.*;




public class mainClass {
	private static MainController controll = new MainController();
	private static MainModel model = new MainModel();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame(model, controll);
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
