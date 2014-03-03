package Controller;

import view.*;
import Model.*;

public class MainController {

	private MainFrame view;
	private MainModel model;
	public MainController(MainFrame view, MainModel model)
	{
		this.view = view;
		this.model = model;
		view.setLocationRelativeTo(null);
		view.getLoginPanel().getUsernameField().grabFocus();
		view.getLoginPanel().addLoginButtonListener(new LoginListener(view));
		view.getLoginPanel().getRootPane().setDefaultButton(view.getLoginPanel().getLoginBtn());
	}
}
