package View;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import Controller.MainController;
import Model.MainModel;

public class MainFrame extends JFrame {
	private static final long serialVersionUID = -7100419815175830650L;
	private JPanel contentPane;
	private MainModel model;
	private MainController controll;
	private LoginPanel loginTab;


	/**
	 * Create the frame.
	 */
	public MainFrame(MainModel model, MainController controll) {
		this.model=model;
		this.controll=controll;
		loginTab = new LoginPanel();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 460);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenu mnEdit = new JMenu("Edit");
		menuBar.add(mnEdit);
		
		JMenu mnView = new JMenu("View");
		menuBar.add(mnView);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		TabsPane tabbedPane = new TabsPane();
		tabbedPane.addTab("Login", loginTab);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
	}



}
