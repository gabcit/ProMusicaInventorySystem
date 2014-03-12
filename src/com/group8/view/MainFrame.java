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
	private JMenu mnHelp;
	private TabsPane tabbedPane;
	private StockBrowseTabPabel stockBrowsingPanel;
	private JMenu mnManageItem;
	private JMenuItem mntmLogOut;
	private JMenuItem mntmExit;
	private JMenuItem mntmCorrectStockLevel;
	private JMenuItem mntmMarkIncorrectItem;
	private JMenu mnManageAccount;
	private JMenuItem mntmAddNewAccount;
	private JMenuItem mntmChangeUsername;
	private JMenuItem mntmChangePassword;
	private JMenuItem mntmHelp;
	private JMenuItem mntmAbout;


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
		
		mntmLogOut = new JMenuItem("Log Out...");
		mnFile.add(mntmLogOut);
		
		mntmExit = new JMenuItem("Exit");
		mnFile.add(mntmExit);
		
		mnManageItem = new JMenu("Manage Item\r\n");
		menuBar.add(mnManageItem);
		
		mntmCorrectStockLevel = new JMenuItem("Correct Stock Level");
		mnManageItem.add(mntmCorrectStockLevel);
		
		mntmMarkIncorrectItem = new JMenuItem("Mark Incorrect Item");
		mnManageItem.add(mntmMarkIncorrectItem);
		
		mnManageAccount = new JMenu("Manage Account");
		menuBar.add(mnManageAccount);
		
		mntmAddNewAccount = new JMenuItem("Add New Account");
		mnManageAccount.add(mntmAddNewAccount);
		
		mntmChangeUsername = new JMenuItem("Change Username");
		mnManageAccount.add(mntmChangeUsername);
		
		mntmChangePassword = new JMenuItem("Change Password");
		mnManageAccount.add(mntmChangePassword);
		
		mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		mntmHelp = new JMenuItem("Help");
		mnHelp.add(mntmHelp);
		
		mntmAbout = new JMenuItem("About");
		mnHelp.add(mntmAbout);
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
