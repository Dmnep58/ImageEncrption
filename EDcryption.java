package main;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class EDcryption extends JFrame {

	private JPanel contentPane;
	public static JLabel txtfield;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EDcryption frame = new EDcryption();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	/**
	 * Create the frame.
	 */
	public EDcryption() {
		setResizable(false);
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 836, 614);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Images");
		lblNewLabel_3_1_1.setForeground(Color.BLACK);
		lblNewLabel_3_1_1.setFont(new Font("Yu Gothic UI", Font.BOLD, 21));
		lblNewLabel_3_1_1.setBackground(new Color(240, 248, 255));
		lblNewLabel_3_1_1.setBounds(314, 213, 167, 50);
		contentPane.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("Decryption of\r\n");
		lblNewLabel_3_1.setForeground(Color.BLACK);
		lblNewLabel_3_1.setFont(new Font("Yu Gothic UI", Font.BOLD, 21));
		lblNewLabel_3_1.setBackground(new Color(240, 248, 255));
		lblNewLabel_3_1.setBounds(314, 177, 167, 50);
		contentPane.add(lblNewLabel_3_1);
		
		
		
		 txtfield = new JLabel("");
		txtfield.setFont(new Font("Vivaldi", Font.BOLD, 23));
		txtfield.setBounds(302, 306, 194, 35);
		contentPane.add(txtfield);
		
		
		
		JButton btnNewButton = new JButton("Encrypt\r\n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtfield.setText("Encryption started..");
//				setVisible(false);
				new encryption().setVisible(true);
				
				
			}
		});
		btnNewButton.setFocusable(false);
		btnNewButton.setFocusTraversalKeysEnabled(false);
		btnNewButton.setFocusPainted(false);
		btnNewButton.setRolloverEnabled(false);
		btnNewButton.setRequestFocusEnabled(false);
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Ubuntu", Font.BOLD, 18));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBounds(242, 414, 109, 29);
		contentPane.add(btnNewButton);
		

		JButton btnDcrypt = new JButton("Dcrypt\r\n");
		btnDcrypt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtfield.setText("Decryption started..");
				new decryption().setVisible(true);
			}
		});
		
		btnDcrypt.setRolloverEnabled(false);
		btnDcrypt.setRequestFocusEnabled(false);
		btnDcrypt.setForeground(Color.BLACK);
		btnDcrypt.setFont(new Font("Ubuntu", Font.BOLD, 18));
		btnDcrypt.setFocusable(false);
		btnDcrypt.setFocusTraversalKeysEnabled(false);
		btnDcrypt.setFocusPainted(false);
		btnDcrypt.setBackground(new Color(255, 255, 255));
		btnDcrypt.setBounds(480, 414, 109, 29);
		contentPane.add(btnDcrypt);
		
		JLabel lblNewLabel_3 = new JLabel("Encryption\r\n and \r\n");
		lblNewLabel_3.setForeground(new Color(0, 0, 0));
		lblNewLabel_3.setBackground(new Color(240, 248, 255));
		lblNewLabel_3.setFont(new Font("Yu Gothic UI", Font.BOLD, 21));
		lblNewLabel_3.setBounds(314, 147, 167, 35);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("Welcome to my project");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\pm429\\eclipse-workspace\\student_Registration_System\\src\\AddNewBookIcons\\icons8_Books_52px_1.png"));
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Ubuntu", Font.BOLD, 30));
		lblNewLabel.setBounds(20, 0, 400, 57);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("RIshab Innani");
		lblNewLabel_2.setForeground(new Color(255, 102, 0));
		lblNewLabel_2.setBackground(new Color(240, 240, 240));
		lblNewLabel_2.setFont(new Font("Ubuntu", Font.BOLD, 22));
		lblNewLabel_2.setBounds(611, 3, 201, 57);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\pm429\\eclipse-workspace\\student_Registration_System\\src\\icons\\signup-library-icon.png"));
		lblNewLabel_1.setBounds(10, 11, 812, 555);
		contentPane.add(lblNewLabel_1);
		
		
		JButton btnNewButton_1 = new JButton("Exit\r\n");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				
				
			}
		});
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setFocusPainted(false);
		btnNewButton_1.setFocusable(false);
		btnNewButton_1.setFont(new Font("Ubuntu", Font.BOLD, 18));
		btnNewButton_1.setBounds(369, 508, 89, 29);
		contentPane.add(btnNewButton_1);
		
	}
}
