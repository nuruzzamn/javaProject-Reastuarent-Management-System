package rms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import javax.swing.*;
import javax.swing.JOptionPane;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;

import rms.Shut_Down;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.DefaultKeyboardFocusManager;

import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Toolkit;

public class Login_System {

	private JFrame LoginSystem;
	private JTextField tf1;
	private JPasswordField tf2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_System window = new Login_System();
					window.LoginSystem.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * 
	 *
	 */
	Connection con=DBconnection.db();   // con is connection object.
	private JTextField textField;
	public Login_System() {
		initialize();
		 
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		LoginSystem = new JFrame();
		LoginSystem.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\SHUVO\\Desktop\\coffee-cup.png"));
		LoginSystem.getContentPane().setBackground(new Color(152, 251, 152));
		LoginSystem.getContentPane().setForeground(new Color(255, 240, 245));
		LoginSystem.setResizable(false);
		LoginSystem.setTitle("                                   Login System");
		LoginSystem.setBounds(500,250, 407, 267);
		LoginSystem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		LoginSystem.getContentPane().setLayout(null);
		
		JLabel lblLoginSystemFor = new JLabel("Login System for Cafe Selfie");
		lblLoginSystemFor.setForeground(new Color(0, 0, 205));
		lblLoginSystemFor.setFont(new Font("Arial", Font.BOLD, 22));
		lblLoginSystemFor.setBounds(30, 11, 320, 28);
		LoginSystem.getContentPane().add(lblLoginSystemFor);
		
		JLabel lblNewLabel = new JLabel("User Name");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel.setBounds(47, 68, 109, 17);
		LoginSystem.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1.setBounds(53, 111, 92, 28);
		LoginSystem.getContentPane().add(lblNewLabel_1);
		
		tf1 = new JTextField();
		tf1.setFont(new Font("Arial", Font.BOLD, 14));
		tf1.setBounds(166, 68, 204, 22);
		LoginSystem.getContentPane().add(tf1);
		tf1.setColumns(10);
		
		 
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				PreparedStatement pst=null;
				ResultSet rs=null;
				int count=0;
				
				
				try {
					String a=tf1.getText();
					String b=tf2.getText();
					if(a.contentEquals("")&&b.contentEquals(""))
					{
						JOptionPane.showMessageDialog(null,"Please Enter the User Name & Password");
					}
					else
					{
					String query="select * from admin where username=? and password=?";
					pst=con.prepareStatement(query);   // con is connection variable
					
					pst.setString(1,tf1.getText());
					pst.setString(2,tf2.getText());
					
					rs=pst.executeQuery();
					while(rs.next())
					{
					count++;
					}
					if(count==1)
					{
						JOptionPane.showMessageDialog(null,"User and Password is Correct");
						 Shut_Down.main(null);
						
						
					}
					
					else
						JOptionPane.showMessageDialog(null,"Wrong Password");
						
					pst.close();
					rs.close();
					
				}
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, e2);
					
				}
				
			
		}
			
				  
			
	 
			
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(30, 182, 84, 31);
		LoginSystem.getContentPane().add(btnNewButton);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tf1.setText(null);
				tf2.setText(null);
			}
		});
		btnReset.setBounds(142, 182, 92, 31);
		LoginSystem.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnExit.setBounds(272, 182, 71, 31);
		LoginSystem.getContentPane().add(btnExit);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 38, 330, 7);
		LoginSystem.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 170, 347, 1);
		LoginSystem.getContentPane().add(separator_1);
		
		tf2 = new JPasswordField();
		tf2.setEchoChar('*');
		tf2.setFont(new Font("Arial", Font.BOLD, 14));
		tf2.setBounds(166, 117, 204, 22);
		LoginSystem.getContentPane().add(tf2);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Show Password");
		rdbtnNewRadioButton.setBackground(new Color(0, 255, 127));
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rdbtnNewRadioButton.isSelected())
					textField.setText(tf2.getText());
				else
					textField.setText("");
			}
		});
		rdbtnNewRadioButton.setBounds(262, 146, 108, 23);
		LoginSystem.getContentPane().add(rdbtnNewRadioButton);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField.setBackground(new Color(0, 255, 127));
		textField.setBounds(166, 150, 90, 17);
		LoginSystem.getContentPane().add(textField);
		textField.setColumns(10);
	}
}



