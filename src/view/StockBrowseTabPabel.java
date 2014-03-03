package view;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.border.TitledBorder;
import javax.swing.JTable;

public class StockBrowseTabPabel extends JPanel {
	private JTextField searchTF;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public StockBrowseTabPabel() {
		setLayout(new MigLayout("", "[grow]", "[][51.00][grow]"));
		
		searchTF = new JTextField();
		add(searchTF, "flowx,cell 0 0,alignx left");
		searchTF.setColumns(15);
		
		JButton btnSearch = new JButton("Search");
		add(btnSearch, "cell 0 0");
		
		JPanel filterByPanel = new JPanel();
		filterByPanel.setBorder(new TitledBorder(null, "Filter Results By:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		add(filterByPanel, "cell 0 1,grow");
		filterByPanel.setLayout(new MigLayout("", "[grow]", "[][]"));
		
		JComboBox priceCB = new JComboBox();
		filterByPanel.add(priceCB, "flowx,cell 0 0");
		
		JComboBox inStockCB = new JComboBox();
		filterByPanel.add(inStockCB, "cell 0 0");
		
		JComboBox categoryCB = new JComboBox();
		filterByPanel.add(categoryCB, "cell 0 0,alignx left");
		
		table = new JTable();
		add(table, "cell 0 2,grow");

	}

}
