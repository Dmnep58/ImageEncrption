package main;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Point;

public class decryption extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;

	encryption enc = new encryption();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					decryption frame = new decryption();
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
	public decryption() {
		setUndecorated(true);
		setBackground(Color.BLACK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 446, 186);
		contentPane = new JPanel();
		contentPane.setLocation(new Point(800, 20));
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Use The same password to decrypt the data");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setFont(new Font("Ubuntu", Font.BOLD, 19));
		lblNewLabel.setBounds(24, 11, 416, 32);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password\r\n");
		lblNewLabel_1.setFont(new Font("Ubuntu", Font.BOLD, 19));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(30, 54, 98, 26);
		contentPane.add(lblNewLabel_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(30, 91, 386, 32);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("Decrypt\r\n");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFocusPainted(false);
		btnNewButton.setFocusable(false);
		btnNewButton.setFont(new Font("Ubuntu", Font.BOLD, 19));
		btnNewButton.setBounds(276, 134, 140, 32);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Exit\r\n");
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
				
			}
		});
		btnNewButton_1.setFont(new Font("Ubuntu", Font.BOLD, 19));
		btnNewButton_1.setFocusPainted(false);
		btnNewButton_1.setFocusable(false);
		btnNewButton_1.setBounds(39, 133, 115, 32);
		contentPane.add(btnNewButton_1);
		btnNewButton.addActionListener(e->{
			String textString = passwordField.getText();
			int temp=Integer.parseInt(textString);
			enc.encrypt(temp);
			JOptionPane.showMessageDialog(null,"Dcryption COmpleted");
			setVisible(false);
			
			
		});
	}
}
