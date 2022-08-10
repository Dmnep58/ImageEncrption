package main;


import java.awt.EventQueue;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.renderable.RenderableImageOp;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.imageio.stream.ImageInputStream;
import javax.swing.ImageIcon;

public class encryption extends JFrame {

	private JPanel contentPane;
	private JPasswordField password;
	private JPasswordField password_1;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					encryption frame = new encryption();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public static void encrypt(int key) {
		JFileChooser fileChooser=new JFileChooser();
		fileChooser.showOpenDialog(null);
		
		File file= fileChooser.getSelectedFile();
		
		try {
			FileInputStream fis = new FileInputStream(file);
			
			
//			FileInputStream fis - ImageOperation.encrypt(int);
			
			byte[] dataArray = new byte[fis.available()];
			fis.read(dataArray);
			int i=0;
			
			for(byte b:dataArray) {
				
				
				dataArray[i]=(byte) (b^key);
				i++;
			}
			
			FileOutputStream fileOutputStream = new FileOutputStream(file);
			fileOutputStream.write(dataArray);
			fis.close();
			fileOutputStream.close();
			
		}
		catch (Exception e) {
			  // TODO: handle exception
		}
			
		
	}
	/**
	 * Create the frame.
	 */
	public encryption() {
		setUndecorated(true);
		setResizable(false);
		setBackground(new Color(0, 0, 0));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 634, 308);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JLabel lblNewLabel = new JLabel("Password\r\n");
		lblNewLabel.setFont(new Font("Ubuntu", Font.BOLD, 19));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(27, 55, 140, 36);
		contentPane.add(lblNewLabel);
		
		 password= new JPasswordField();
		 password.setFont(new Font("Tahoma", Font.BOLD, 17));
		 password.setBounds(27, 96, 542, 31);
		contentPane.add(password);
		password.setColumns(10);
		password.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char caracter = e.getKeyChar();
				if (((caracter < '0') || (caracter > '9')) && (caracter !='\b')) {
					e.consume();
				}
				 
	                }
		});
		
		JLabel lblConfirmPassword = new JLabel("Confirm password\r\n\r\n");
		lblConfirmPassword.setForeground(Color.WHITE);
		lblConfirmPassword.setFont(new Font("Ubuntu", Font.BOLD, 19));
		lblConfirmPassword.setBounds(27, 138, 172, 36);
		contentPane.add(lblConfirmPassword);
		
		password_1 = new JPasswordField();
		password_1.setFont(new Font("Tahoma", Font.BOLD, 19));
		password_1.setColumns(10);
		password_1.setBounds(27, 172, 542, 31);
		contentPane.add(password_1);
		password_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char caracter = e.getKeyChar();
				if (((caracter < '0') || (caracter > '9')) && (caracter !='\b')) {
					e.consume();
				}
				 
	                }
		});
		
		JLabel lblNewLabel_1 = new JLabel("The longer the password the SECURE the FILE");
		lblNewLabel_1.setFont(new Font("Ubuntu", Font.BOLD, 19));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(65, 13, 466, 31);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Exit");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\pm429\\eclipse-workspace\\student_Registration_System\\src\\adminIcons\\icons8_Read_Online_26px.png"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(ABORT);
			}
		});
		
		btnNewButton.setFocusable(false);
		btnNewButton.setFocusPainted(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(new Color(255, 204, 153));
		btnNewButton.setFont(new Font("Ubuntu", Font.BOLD, 19));
		btnNewButton.setBounds(424, 218, 147, 42);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Encrypt\r\n");
		
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\pm429\\eclipse-workspace\\student_Registration_System\\src\\adminIcons\\icons8_Read_Online_26px.png"));
		btnNewButton_1.addActionListener(e->{
			
			String textString1 = password.getText();
			 String textString = password_1.getText();
			 
			if(textString1.equals(textString)) {
				
			int temp = Integer.parseInt(textString1);
			
			encrypt(temp);
			
			JOptionPane.showMessageDialog(null,"Encryption Completed");
			setVisible(false);
			
			
			}
			else {
				JOptionPane.showMessageDialog(null,"Password Didn't Match");
				setVisible(false);
				
			}
			
		});
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\pm429\\eclipse-workspace\\student_Registration_System\\src\\adminIcons\\icons8_Read_Online_26px.png"));
		btnNewButton_1.setFont(new Font("Ubuntu", Font.BOLD, 19));
		btnNewButton_1.setFocusable(false);
		btnNewButton_1.setFocusPainted(false);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBackground(new Color(255, 204, 153));
		btnNewButton_1.setBounds(27, 218, 147, 42);
		contentPane.add(btnNewButton_1);
	}


	

}
