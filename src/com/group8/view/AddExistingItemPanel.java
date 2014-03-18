package com.group8.view;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;

public class AddExistingItemPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public AddExistingItemPanel() {
		setLayout(new MigLayout("", "[grow][]", "[grow][]"));
		
		StockBrowsePanel panel = new StockBrowsePanel();
		add(panel, "cell 0 0,grow");
		
		JButton btnAddThisItem = new JButton("Add This Item");
		add(btnAddThisItem, "flowy,cell 1 1");
		
		JButton btnCancel = new JButton("Cancel");
		add(btnCancel, "cell 1 1,growx");

	}

}
