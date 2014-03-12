import java.awt.EventQueue;

import com.group8.controller.*;
import com.group8.model.*;
import com.group8.view.*;




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
