import java.awt.EventQueue;

import view.*;
import model.*;
import controller.*;




public class mainClass {
	private static MainFrame view = new MainFrame();
	private static MainModel model = new MainModel();
	
	public static void main(String[] args) {
		
		System.out.println("Running...");
		
		 EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					view.setVisible(true);
					new MainController(view, model);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
