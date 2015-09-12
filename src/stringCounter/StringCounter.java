package stringCounter;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class StringCounter {

	private JFrame frame;
	private JScrollPane scrollPane;
	private JTextField textArea;
	private JLabel lblSearchString;
	private JTextField textSearchString;
	private JButton btnCount;
	private JLabel lblCount;
	private JTextField textCount;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StringCounter window = new StringCounter();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StringCounter() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(31, 24, 211, 66);
		frame.getContentPane().add(scrollPane);
		
		textArea = new JTextField();
		scrollPane.setViewportView(textArea);
		textArea.setColumns(10);
		
		lblSearchString = new JLabel("Search String");
		lblSearchString.setBounds(31, 118, 74, 14);
		frame.getContentPane().add(lblSearchString);
		
		textSearchString = new JTextField();
		textSearchString.setBounds(115, 115, 73, 20);
		frame.getContentPane().add(textSearchString);
		textSearchString.setColumns(10);
		
		btnCount = new JButton("Count");
		btnCount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String strarea = textArea.getText();
				
				String strsearch = textSearchString.getText();
				
				int countWord=0 ;
				
				while (strarea.length() > 0) {
					int index = strarea.indexOf(strsearch);
					if (index == -1) break;
					strarea = strarea.substring(index + strsearch.length(), strarea.length());
					countWord++;
					}
				
				
				int result = countWord;
				
				String strResult=Integer.toString(result);
				
				textCount.setText(strResult);
				
			}
		});
		btnCount.setBounds(198, 114, 89, 23);
		frame.getContentPane().add(btnCount);
		
		lblCount = new JLabel("Count");
		lblCount.setBounds(31, 165, 46, 14);
		frame.getContentPane().add(lblCount);
		
		textCount = new JTextField();
		textCount.setBounds(116, 162, 72, 20);
		frame.getContentPane().add(textCount);
		textCount.setColumns(10);
	}
}
