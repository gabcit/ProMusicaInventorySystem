package view;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import Model.MainModel;
import Controller.MainController;

public class MainFrame extends JFrame {
	private static final long serialVersionUID = -7100419815175830650L;
	private JPanel contentPane;
	private LoginPanel loginTab;
	private JMenuBar menuBar;
	private JMenu mnFile;
	private JMenu mnEdit;
	private JMenu mnView;
	private JMenu mnHelp;
	private TabsPane tabbedPane;
	private StockBrowseTabPabel stockBrowsingPanel;


	/**
	 * Create the frame.
	 */
	public MainFrame() {
		
		loginTab = new LoginPanel();
		setDefaultCloseOperation(JOptionPane.CANCEL_OPTION);
		setBounds(100, 100, 650, 460);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		mnEdit = new JMenu("Edit");
		menuBar.add(mnEdit);
		
		mnView = new JMenu("View");
		menuBar.add(mnView);
		
		mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new CardLayout());
		setContentPane(contentPane);
		
		tabbedPane = new TabsPane();
		stockBrowsingPanel = new StockBrowseTabPabel();
		tabbedPane.add("Browse Stock", stockBrowsingPanel);
		contentPane.add(loginTab);
		contentPane.add(tabbedPane);
		tabbedPane.setVisible(false);
		
	
	}
	public LoginPanel getLoginPanel()
	{
		return loginTab;
	}
	public StockBrowseTabPabel getStockBrowsingPanel()
	{
		return stockBrowsingPanel;
	}
	public TabsPane getTabsPane()
	{
		return tabbedPane;
	}


}
