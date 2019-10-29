package rms;

import java.sql.*;
import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.EventQueue;

import javax.swing.JFrame;import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.io.Closeable;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import javax.swing.JTextPane;
import java.awt.Panel;
import java.awt.Toolkit;

import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.Button;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.CloseAction;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import rms.Login_System;
import rms.DBconnection;
import java.awt.SystemColor;

public class Shut_Down {

	private JFrame frame;
	private JTable table;
	
	private JTextField f1;
	private JTextField f2;
	private JTextField f3;
	private JTextField f4;
	private JTextField f5;
	private JTextField f6;
	private JTextField f7;
	private JTextField tfc;
	private JTextField discount;
	private JTextField total;
	private JTextField d1;
	private JTextField d2;
	private JTextField d3;
	private JTextField d4;
	private JTextField d5;
	private JTextField d6;
	private JTextField d7;
	private JTextField tdc;
	private JTextArea TA;
	private JTextField oun;
	private JTextField NUN;
	private JTextField clock2;
	private JButton button_3;

	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Shut_Down window = new Shut_Down();
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
public void clock(){
		
		Thread clock = new Thread(){
			public void run(){
				try {
					for(;;){
					Calendar cal = new GregorianCalendar();
					int day = cal.get(Calendar.DAY_OF_MONTH);
					int month = cal.get(Calendar.MONTH);
					int year = cal.get(Calendar.YEAR);
					month = month+1;
					
					int second = cal.get(Calendar.SECOND);
					int minute = cal.get(Calendar.MINUTE);
					int hour = cal.get(Calendar.HOUR);
					
					textField.setText("Time: "+hour+":"+minute+": "+second+"      Date: "+day+"-"+month+"-"+year);
					clock2.setText("Time:   "+hour+":"+minute+": "+second+"       Date: "+day+"-"+month+"-"+year);
					
					sleep(1000);
					}
				} catch (InterruptedException e) {
				
					e.printStackTrace();
				}
			}
		};
		clock.start();
		
	}
	
	Connection con=DBconnection.db();   // con is connection object.
	private JPasswordField op;
	private JPasswordField np;
	private JTextField df1;
	private JTextField df2;
	private JTextField df3;
	private JTextField df4;
	private JTextField df5;
	private JTextField df6;
	private JTextField df7;
	private JTextField dhdc;
	private JTextField dd1;
	private JTextField dd2;
	private JTextField dd3;
	private JTextField dd4;
	private JTextField dd5;
	private JTextField dd6;
	private JTextField dd7;
	private JTextField dvat;
	private JTextField hdc;
	private JTextField Vat;
	private JTextField textField;
	

	public Shut_Down() {
		initialize();
		clock();
		clock();
	}

	/**
	 * Initialize the contents of the frame.
	 * 
	 * 
	 */


	
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\SHUVO\\Desktop\\coffee-cup.png"));
		frame.setBackground(new Color(220, 20, 60));
		frame.getContentPane().setBackground(new Color(127, 255, 212));
		frame.setTitle("                                                                                                                                                                                             Reastaurent Management System");
		frame.setFont(new Font("Times New Roman", Font.BOLD, 18));
		frame.setBounds(0,0,1500, 1500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 1352, 741);
		frame.getContentPane().add(tabbedPane);
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(152, 251, 152));
		panel_1.setForeground(new Color(0, 255, 127));
	
		tabbedPane.addTab("Home",null, panel_1, null);
		panel_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		tabbedPane.setEnabledAt(0, true);
		panel_1.setLayout(null);

		
		JPanel panel_8 = new JPanel();
		panel_8.setLayout(null);
		panel_8.setBorder(new LineBorder(new Color(64, 224, 208), 2));
		panel_8.setBackground(new Color(0, 250, 154));
		panel_8.setBounds(10, 56, 407, 399);
		panel_1.add(panel_8);
		
		JLabel label = new JLabel("Foods");
		label.setForeground(Color.RED);
		label.setFont(new Font("Tahoma", Font.BOLD, 24));
		label.setBounds(10, 11, 90, 27);
		panel_8.add(label);
		
		JLabel label_1 = new JLabel("1. Fiery Grilled Chicken");
		label_1.setFont(new Font("Arial", Font.BOLD, 17));
		label_1.setBounds(10, 49, 189, 30);
		panel_8.add(label_1);
		
		JLabel label_2 = new JLabel("2. Chicken Burger");
		label_2.setFont(new Font("Arial", Font.BOLD, 18));
		label_2.setBounds(10, 90, 177, 30);
		panel_8.add(label_2);
		
		JLabel label_3 = new JLabel("3. Chicken Dosa");
		label_3.setFont(new Font("Arial", Font.BOLD, 18));
		label_3.setBounds(10, 131, 177, 30);
		panel_8.add(label_3);
		
		JLabel label_4 = new JLabel("4. Fancy Fry");
		label_4.setFont(new Font("Arial", Font.BOLD, 18));
		label_4.setBounds(10, 172, 177, 30);
		panel_8.add(label_4);
		
		JLabel label_5 = new JLabel("5. Noodles");
		label_5.setFont(new Font("Arial", Font.BOLD, 18));
		label_5.setBounds(10, 213, 177, 30);
		panel_8.add(label_5);
		
		JLabel label_6 = new JLabel("6. Sweet Corn");
		label_6.setFont(new Font("Arial", Font.BOLD, 18));
		label_6.setBounds(10, 246, 177, 30);
		panel_8.add(label_6);
		
		JLabel label_7 = new JLabel("7. Ice-Cream");
		label_7.setFont(new Font("Arial", Font.BOLD, 18));
		label_7.setBounds(10, 287, 177, 30);
		panel_8.add(label_7);
		
		f1 = new JTextField("0");
		f1.setHorizontalAlignment(SwingConstants.TRAILING);
		f1.setForeground(Color.RED);
		f1.setFont(new Font("Felix Titling", Font.BOLD, 20));
		f1.setColumns(10);
		f1.setBackground(new Color(250, 250, 210));
		f1.setBounds(197, 53, 200, 27);
		panel_8.add(f1);
		
		f2 = new JTextField("0");
		f2.setHorizontalAlignment(SwingConstants.TRAILING);
		f2.setForeground(Color.RED);
		f2.setFont(new Font("Felix Titling", Font.BOLD, 20));
		f2.setColumns(10);
		f2.setBackground(new Color(250, 250, 210));
		f2.setBounds(197, 90, 200, 27);
		panel_8.add(f2);
		
		f3 = new JTextField("0");
		f3.setHorizontalAlignment(SwingConstants.TRAILING);
		f3.setForeground(Color.RED);
		f3.setFont(new Font("Felix Titling", Font.BOLD, 20));
		f3.setColumns(10);
		f3.setBackground(new Color(250, 250, 210));
		f3.setBounds(197, 128, 200, 27);
		panel_8.add(f3);
		
		f4 = new JTextField("0");
		f4.setHorizontalAlignment(SwingConstants.TRAILING);
		f4.setForeground(Color.RED);
		f4.setFont(new Font("Felix Titling", Font.BOLD, 20));
		f4.setColumns(10);
		f4.setBackground(new Color(250, 250, 210));
		f4.setBounds(197, 172, 200, 27);
		panel_8.add(f4);
		
		f5 = new JTextField("0");
		f5.setHorizontalAlignment(SwingConstants.TRAILING);
		f5.setForeground(Color.RED);
		f5.setFont(new Font("Felix Titling", Font.BOLD, 20));
		f5.setColumns(10);
		f5.setBackground(new Color(250, 250, 210));
		f5.setBounds(197, 213, 200, 27);
		panel_8.add(f5);
		
		f6 = new JTextField("0");
		f6.setHorizontalAlignment(SwingConstants.TRAILING);
		f6.setForeground(Color.RED);
		f6.setFont(new Font("Felix Titling", Font.BOLD, 20));
		f6.setColumns(10);
		f6.setBackground(new Color(250, 250, 210));
		f6.setBounds(197, 253, 200, 27);
		panel_8.add(f6);
		
		f7 = new JTextField("0");
		f7.setHorizontalAlignment(SwingConstants.TRAILING);
		f7.setForeground(Color.RED);
		f7.setFont(new Font("Felix Titling", Font.BOLD, 20));
		f7.setColumns(10);
		f7.setBackground(new Color(250, 250, 210));
		f7.setBounds(197, 294, 200, 27);
		panel_8.add(f7);
		
		JLabel label_8 = new JLabel("------------------------------------------------------------------------------------------------");
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 11));
		label_8.setBounds(10, 328, 387, 7);
		panel_8.add(label_8);
		
		JLabel label_9 = new JLabel("Total Food Cost");
		label_9.setFont(new Font("Arial", Font.BOLD, 18));
		label_9.setBounds(10, 346, 162, 30);
		panel_8.add(label_9);
		
		tfc = new JTextField("0");
		tfc.setHorizontalAlignment(SwingConstants.TRAILING);
		tfc.setForeground(Color.RED);
		tfc.setFont(new Font("Felix Titling", Font.BOLD, 20));
		tfc.setEditable(false);
		tfc.setColumns(10);
		tfc.setBackground(new Color(250, 250, 210));
		tfc.setBounds(197, 342, 200, 34);
		panel_8.add(tfc);
		
		JLabel label_10 = new JLabel("------------------------------------------------------------------------------------------------");
		label_10.setFont(new Font("Tahoma", Font.PLAIN, 11));
		label_10.setBounds(10, 37, 387, 7);
		panel_8.add(label_10);
		
		JPanel panel_9 = new JPanel();
		panel_9.setLayout(null);
		panel_9.setBorder(new LineBorder(new Color(64, 224, 208), 2));
		panel_9.setBackground(new Color(0, 250, 154));
		panel_9.setBounds(10, 466, 407, 98);
		panel_1.add(panel_9);
		
		hdc = new JTextField("0");
		hdc.setHorizontalAlignment(SwingConstants.TRAILING);
		hdc.setForeground(Color.RED);
		hdc.setFont(new Font("Felix Titling", Font.BOLD, 20));
		hdc.setColumns(10);
		hdc.setBackground(new Color(250, 250, 210));
		hdc.setBounds(197, 11, 200, 34);
		panel_9.add(hdc);
		
		JLabel label_11 = new JLabel("Home Delivery Cost");
		label_11.setFont(new Font("Arial", Font.BOLD, 18));
		label_11.setBounds(10, 15, 189, 30);
		panel_9.add(label_11);
		
		Vat = new JTextField("0");
		Vat.setHorizontalAlignment(SwingConstants.TRAILING);
		Vat.setForeground(Color.RED);
		Vat.setFont(new Font("Felix Titling", Font.BOLD, 20));
		Vat.setColumns(10);
		Vat.setBackground(new Color(250, 250, 210));
		Vat.setBounds(197, 56, 204, 34);
		panel_9.add(Vat);
		
		JLabel label_12 = new JLabel("Vat");
		label_12.setFont(new Font("Arial", Font.BOLD, 18));
		label_12.setBounds(20, 60, 381, 30);
		panel_9.add(label_12);
		
	
		
		JPanel panel_10 = new JPanel();
		panel_10.setLayout(null);
		panel_10.setBorder(new LineBorder(new Color(64, 224, 208), 2));
		panel_10.setBackground(new Color(0, 250, 154));
		panel_10.setBounds(10, 586, 828, 87);
		panel_1.add(panel_10);
		
		JButton button = new JButton("Total");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String query = "select		*from	all_data		 ";
					PreparedStatement pst = con.prepareStatement(query);
					ResultSet rs = pst.executeQuery();
					Double da=Double.parseDouble(rs.getString("fd1"));
					Double db=Double.parseDouble(rs.getString("fd2"));
					Double dc=Double.parseDouble(rs.getString("fd3"));
					Double dd=Double.parseDouble(rs.getString("fd4"));
					Double de=Double.parseDouble(rs.getString("fd5"));
					Double df=Double.parseDouble(rs.getString("fd6"));
					Double dg=Double.parseDouble(rs.getString("fd7"));
					Double dm=Double.parseDouble(rs.getString("dk1"));
					Double dn=Double.parseDouble(rs.getString("dk2"));
					Double do1=Double.parseDouble(rs.getString("dk3"));
					Double dp=Double.parseDouble(rs.getString("dk4"));
					Double dq=Double.parseDouble(rs.getString("dk5"));
					Double dr=Double.parseDouble(rs.getString("dk6"));
					Double ds=Double.parseDouble(rs.getString("dk7"));
					Double dhome=Double.parseDouble(rs.getString("home"));
					Double dvat=Double.parseDouble(rs.getString("vat"));
				
				
				double a,b,c,d,e1,f,g,totalfc;           //   fd=food
				double m,n,o,p,q,r,s,totaldc;                  //   dn=Drink
				double	x,y,z;
			
				// Variable for foods
				//==========================================
				a=Double.parseDouble(f1.getText());
				b=Double.parseDouble(f2.getText());
				c=Double.parseDouble(f3.getText());
				d=Double.parseDouble(f4.getText());
				e1=Double.parseDouble(f5.getText());
				f=Double.parseDouble(f6.getText());
				g=Double.parseDouble(f7.getText());
				x=Double.parseDouble(hdc.getText());
				y=Double.parseDouble(Vat.getText());
				z=Double.parseDouble(discount.getText());
				
		//========================================================
				//  Variable for Drink
				m=Double.parseDouble(d1.getText());
				n=Double.parseDouble(d2.getText());
				o=Double.parseDouble(d3.getText());
				p=Double.parseDouble(d4.getText());
				q=Double.parseDouble(d5.getText());
				r=Double.parseDouble(d6.getText());
				s=Double.parseDouble(d7.getText());
		//  =======================================================
	//	totalfc=((a*250.00)+(b*150.00)+(c*200.00)+(d*120.00)+(e1*100.00)+(f*100.00)+(g*100));
	//	totaldc=(m*50.00)+(n*50.00)+(o*50.00)+(p*50.00)+(q*50.00)+(r*50.00)+(s*50.00);
				
				totalfc=((a*da)+(b*db)+(c*dc)+(d*dd)+(e1*de)+(f*df)+(g*dg));
				totaldc=((m*dm)+(n*dn)+(o*do1)+(p*dp)+(q*dq)+(r*dr)+(s*ds));
				
				double total1=totalfc+totaldc+dhome+dvat;		//		  total Calculation
				double finaltotal=(total1-(0.01*z*total1));
				String stotalfc=String.valueOf(totalfc);  //Calculation of Food Cost
				String stotaldc=String.valueOf(totaldc);       //   Calculation of Drink Cost
				String stotal1=String.valueOf(finaltotal); 
				tfc.setText(stotalfc);
				tdc.setText(stotaldc);
				total.setText(stotal1);
			} catch (Exception e2) {
				JOptionPane.showMessageDialog(null, "Enter Only Integer Number");
				f1.setText("0");
				f2.setText("0");
				f3.setText("0");
				f4.setText("0");
				f5.setText("0");
				f6.setText("0");
				f7.setText("0");
				d1.setText("0");
				d2.setText("0");
				d3.setText("0");
				d4.setText("0");
				d5.setText("0");
				d6.setText("0");
				d7.setText("0");
				discount.setText("0");
		
				tfc.setText("");
				tdc.setText("");
				total.setText("");
				TA.setText("");
			}
			
			}
		});
		button.setForeground(Color.RED);
		button.setFont(new Font("Tahoma", Font.BOLD, 14));
		button.setBackground(Color.PINK);
		button.setBounds(75, 11, 124, 55);
		panel_10.add(button);
		
		JButton button_2 = new JButton(" Exit");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		button_2.setForeground(Color.RED);
		button_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_2.setBackground(Color.PINK);
		button_2.setBounds(610, 11, 95, 55);
		panel_10.add(button_2);
		
		
		JPanel panel_11 = new JPanel();
		panel_11.setLayout(null);
		panel_11.setBorder(new LineBorder(new Color(64, 224, 208), 2));
		panel_11.setBackground(new Color(0, 250, 154));
		panel_11.setBounds(427, 466, 411, 98);
		panel_1.add(panel_11);
		
		JLabel label_13 = new JLabel("Discount");
		label_13.setForeground(Color.RED);
		label_13.setFont(new Font("Arial", Font.BOLD, 18));
		label_13.setBounds(10, 11, 112, 30);
		panel_11.add(label_13);
		
		JLabel label_14 = new JLabel("Total ");
		label_14.setForeground(Color.RED);
		label_14.setFont(new Font("Arial", Font.BOLD, 20));
		label_14.setBounds(10, 52, 119, 30);
		panel_11.add(label_14);
		
		discount = new JTextField("0");
		discount.setHorizontalAlignment(SwingConstants.TRAILING);
		discount.setForeground(Color.RED);
		discount.setFont(new Font("Felix Titling", Font.BOLD, 20));
		discount.setColumns(10);
		discount.setBackground(new Color(250, 250, 210));
		discount.setBounds(139, 11, 262, 34);
		panel_11.add(discount);
		
		total = new JTextField();
		total.setHorizontalAlignment(SwingConstants.TRAILING);
		total.setForeground(Color.RED);
		total.setFont(new Font("Felix Titling", Font.BOLD, 20));
		total.setEditable(false);
		total.setColumns(10);
		total.setBackground(new Color(250, 250, 210));
		total.setBounds(139, 48, 262, 34);
		panel_11.add(total);
		
		JPanel panel_12 = new JPanel();
		panel_12.setLayout(null);
		panel_12.setBorder(new LineBorder(new Color(64, 224, 208), 2));
		panel_12.setBackground(new Color(0, 250, 154));
		panel_12.setBounds(427, 58, 411, 399);
		panel_1.add(panel_12);
		
		JLabel label_15 = new JLabel(" Drinks");
		label_15.setForeground(Color.RED);
		label_15.setFont(new Font("Tahoma", Font.BOLD, 24));
		label_15.setBounds(10, 11, 90, 27);
		panel_12.add(label_15);
		
		JLabel label_16 = new JLabel("1.  Tea");
		label_16.setFont(new Font("Arial", Font.BOLD, 18));
		label_16.setBounds(10, 49, 90, 30);
		panel_12.add(label_16);
		
		d1 = new JTextField("0");
		d1.setHorizontalAlignment(SwingConstants.TRAILING);
		d1.setForeground(Color.RED);
		d1.setFont(new Font("Felix Titling", Font.BOLD, 20));
		d1.setColumns(10);
		d1.setBackground(new Color(250, 250, 210));
		d1.setBounds(184, 49, 217, 27);
		panel_12.add(d1);
		
		JLabel label_17 = new JLabel("2. Hot Coffee");
		label_17.setFont(new Font("Arial", Font.BOLD, 18));
		label_17.setBounds(10, 90, 135, 30);
		panel_12.add(label_17);
		
		JLabel label_18 = new JLabel("3. Cold Coffee");
		label_18.setFont(new Font("Arial", Font.BOLD, 18));
		label_18.setBounds(10, 131, 123, 30);
		panel_12.add(label_18);
		
		JLabel label_19 = new JLabel("4. Cocacola");
		label_19.setFont(new Font("Arial", Font.BOLD, 18));
		label_19.setBounds(10, 172, 123, 30);
		panel_12.add(label_19);
		
		JLabel label_20 = new JLabel("5. Pepsi");
		label_20.setFont(new Font("Arial", Font.BOLD, 18));
		label_20.setBounds(10, 213, 123, 30);
		panel_12.add(label_20);
		
		JLabel label_21 = new JLabel("6. Juice");
		label_21.setFont(new Font("Arial", Font.BOLD, 18));
		label_21.setBounds(10, 254, 90, 30);
		panel_12.add(label_21);
		
		JLabel label_22 = new JLabel("7. Water");
		label_22.setFont(new Font("Arial", Font.BOLD, 18));
		label_22.setBounds(10, 294, 90, 30);
		panel_12.add(label_22);
		
		d2 = new JTextField("0");
		d2.setHorizontalAlignment(SwingConstants.TRAILING);
		d2.setForeground(Color.RED);
		d2.setFont(new Font("Felix Titling", Font.BOLD, 20));
		d2.setColumns(10);
		d2.setBackground(new Color(250, 250, 210));
		d2.setBounds(184, 93, 217, 27);
		panel_12.add(d2);
		
		d3 = new JTextField("0");
		d3.setHorizontalAlignment(SwingConstants.TRAILING);
		d3.setForeground(Color.RED);
		d3.setFont(new Font("Felix Titling", Font.BOLD, 20));
		d3.setColumns(10);
		d3.setBackground(new Color(250, 250, 210));
		d3.setBounds(184, 135, 217, 27);
		panel_12.add(d3);
		
		d4 = new JTextField("0");
		d4.setHorizontalAlignment(SwingConstants.TRAILING);
		d4.setForeground(Color.RED);
		d4.setFont(new Font("Felix Titling", Font.BOLD, 20));
		d4.setColumns(10);
		d4.setBackground(new Color(250, 250, 210));
		d4.setBounds(184, 179, 217, 27);
		panel_12.add(d4);
		
		d5 = new JTextField("0");
		d5.setHorizontalAlignment(SwingConstants.TRAILING);
		d5.setForeground(Color.RED);
		d5.setFont(new Font("Felix Titling", Font.BOLD, 20));
		d5.setColumns(10);
		d5.setBackground(new Color(250, 250, 210));
		d5.setBounds(184, 220, 217, 27);
		panel_12.add(d5);
		
		d6 = new JTextField("0");
		d6.setHorizontalAlignment(SwingConstants.TRAILING);
		d6.setForeground(Color.RED);
		d6.setFont(new Font("Felix Titling", Font.BOLD, 20));
		d6.setColumns(10);
		d6.setBackground(new Color(250, 250, 210));
		d6.setBounds(184, 261, 217, 27);
		panel_12.add(d6);
		
		d7 = new JTextField("0");
		d7.setHorizontalAlignment(SwingConstants.TRAILING);
		d7.setForeground(Color.RED);
		d7.setFont(new Font("Felix Titling", Font.BOLD, 20));
		d7.setColumns(10);
		d7.setBackground(new Color(250, 250, 210));
		d7.setBounds(184, 301, 217, 27);
		panel_12.add(d7);
		
		JLabel label_23 = new JLabel("------------------------------------------------------------------------------------------------");
		label_23.setFont(new Font("Tahoma", Font.PLAIN, 11));
		label_23.setBounds(14, 335, 387, 7);
		panel_12.add(label_23);
		
		JLabel label_24 = new JLabel("Total Drinks Cost");
		label_24.setFont(new Font("Arial", Font.BOLD, 18));
		label_24.setBounds(10, 353, 162, 30);
		panel_12.add(label_24);
		
		tdc = new JTextField("0");
		tdc.setHorizontalAlignment(SwingConstants.TRAILING);
		tdc.setForeground(Color.RED);
		tdc.setFont(new Font("Felix Titling", Font.BOLD, 20));
		tdc.setEditable(false);
		tdc.setColumns(10);
		tdc.setBackground(new Color(250, 250, 210));
		tdc.setBounds(184, 349, 217, 34);
		panel_12.add(tdc);
		
		JLabel label_25 = new JLabel("------------------------------------------------------------------------------------------------");
		label_25.setFont(new Font("Tahoma", Font.PLAIN, 11));
		label_25.setBounds(10, 35, 387, 7);
		panel_12.add(label_25);
		
		JPanel panel_13 = new JPanel();
		panel_13.setLayout(null);
		panel_13.setBorder(new LineBorder(new Color(64, 224, 208), 2));
		panel_13.setBackground(new Color(0, 250, 154));
		panel_13.setBounds(848, 58, 479, 508);
		panel_1.add(panel_13);
		
		JLabel label_26 = new JLabel("Receipt");
		label_26.setForeground(Color.RED);
		label_26.setFont(new Font("Tahoma", Font.BOLD, 24));
		label_26.setBounds(10, 0, 126, 47);
		panel_13.add(label_26);
		
		JTextArea TA = new JTextArea();
		TA.setForeground(Color.BLACK);
		TA.setFont(new Font("Arial", Font.BOLD, 12));
		TA.setEditable(false);
		TA.setBackground(new Color(255, 250, 205));
		TA.setBounds(10, 58, 459, 439);
		panel_13.add(TA);
		
		JLabel label_27 = new JLabel("==========================================================");
		label_27.setFont(new Font("Tahoma", Font.PLAIN, 11));
		label_27.setBounds(10, 41, 471, 6);
		panel_13.add(label_27);
		
		JPanel panel_14 = new JPanel();
		panel_14.setLayout(null);
		panel_14.setBorder(new LineBorder(new Color(64, 224, 208), 2));
		panel_14.setBackground(new Color(0, 250, 154));
		panel_14.setBounds(848, 586, 479, 87);
		panel_1.add(panel_14);
		
		JButton button_4 = new JButton("Receipt");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double a,b,c,d,	e1,f,g,totalfc;           //   fd=food
				double m,n,o,p,q,r,s,totaldc;                  //   dn=Drink
				double x,y,z;
			try {
				String query = "select		*from	all_data		 ";
				PreparedStatement pst = con.prepareStatement(query);
				ResultSet rs = pst.executeQuery();
				Double da=Double.parseDouble(rs.getString("fd1"));
				Double db=Double.parseDouble(rs.getString("fd2"));
				Double dc=Double.parseDouble(rs.getString("fd3"));
				Double dd=Double.parseDouble(rs.getString("fd4"));
				Double de=Double.parseDouble(rs.getString("fd5"));
				Double df=Double.parseDouble(rs.getString("fd6"));
				Double dg=Double.parseDouble(rs.getString("fd7"));
				Double dm=Double.parseDouble(rs.getString("dk1"));
				Double dn=Double.parseDouble(rs.getString("dk2"));
				Double do1=Double.parseDouble(rs.getString("dk3"));
				Double dp=Double.parseDouble(rs.getString("dk4"));
				Double dq=Double.parseDouble(rs.getString("dk5"));
				Double dr=Double.parseDouble(rs.getString("dk6"));
				Double ds=Double.parseDouble(rs.getString("dk7"));
				Double dhome=Double.parseDouble(rs.getString("home"));
				Double dvat=Double.parseDouble(rs.getString("vat"));
			
		
		
			// Variable for foods
			//==========================================
			a=Double.parseDouble(f1.getText());
			b=Double.parseDouble(f2.getText());
			c=Double.parseDouble(f3.getText());
			d=Double.parseDouble(f4.getText());
			e1=Double.parseDouble(f5.getText());
			f=Double.parseDouble(f6.getText());
			g=Double.parseDouble(f7.getText());
			x=Double.parseDouble(hdc.getText());
			y=Double.parseDouble(Vat.getText());
			z=Double.parseDouble(discount.getText());
			
	//========================================================
			//  Variable for Drink
			m=Double.parseDouble(d1.getText());
			n=Double.parseDouble(d2.getText());
			o=Double.parseDouble(d3.getText());
			p=Double.parseDouble(d4.getText());
			q=Double.parseDouble(d5.getText());
			r=Double.parseDouble(d6.getText());
			s=Double.parseDouble(d7.getText());
	//  =======================================================
//	totalfc=((a*250.00)+(b*150.00)+(c*200.00)+(d*120.00)+(e1*100.00)+(f*100.00)+(g*100));
//	totaldc=(m*50.00)+(n*50.00)+(o*50.00)+(p*50.00)+(q*50.00)+(r*50.00)+(s*50.00);
			
			
				
				
				// Variable for foods
				//==========================================
				a=Double.parseDouble(f1.getText());
				b=Double.parseDouble(f2.getText());
				c=Double.parseDouble(f3.getText());
				d=Double.parseDouble(f4.getText());
			e1=Double.parseDouble(f5.getText());
				f=Double.parseDouble(f6.getText());
				g=Double.parseDouble(f7.getText());
	x=Double.parseDouble(hdc.getText());
		y=Double.parseDouble(Vat.getText());
				z=Double.parseDouble(discount.getText());
				
		//========================================================
				//  Variable for Drink
				m=Double.parseDouble(d1.getText());
				n=Double.parseDouble(d2.getText());
				o=Double.parseDouble(d3.getText());
				p=Double.parseDouble(d4.getText());
				q=Double.parseDouble(d5.getText());
				r=Double.parseDouble(d6.getText());
				s=Double.parseDouble(d7.getText());
		/* =======================================================
				totalfc=((a*250.00)+(b*150.00)+(c*200.00)+(d*120.00)+(e*100.00)+(f*100.00)+(g*100.00));
				totaldc=(m*50.00)+(n*50.00)+(o*50.00)+(p*50.00)+(q*50.00)+(r*50.00)+(s*50.00);*/
				
				totalfc=((a*da)+(b*db)+(c*dc)+(d*dd)+(e1*de)+(f*df)+(g*dg));
				totaldc=((m*dm)+(n*dn)+(o*do1)+(p*dp)+(q*dq)+(r*dr)+(s*ds));
				
				double total1=totalfc+totaldc+x+y;		//		  total Calculation
				double finaltotal=(total1-(0.01*z*total1));
					
				double totalfd=totalfc+totaldc;    // Total of Food & Drink Cost
				
//		double total1=totalfc+totaldc+x+y;   //  total Calculation
				
//		double finaltotal=(total1-(0.01*z*total1));   // Calculation of Discount
				
				//----------------Multiple---------------------------
				double ma=a*da;
				double mb=b*db;
				double mc=c*dc;
				double md=d*dd;
				double me=e1*de;
				double mf=f*df;
				double mg=g*dg;
				double mm=m*dm;
				double mn=n*dn;
				double mo=o*do1;
				double mp=p*dp;
				double mq=q*dq;
				double mr=r*dr;
				double ms=s*dr;
				
				
				//-----------To Convert in String-------------------------------
				
				String a1=String.valueOf(a);
				String a2=String.valueOf(b);
				String a3=String.valueOf(c);
				String a4=String.valueOf(d);
				String a5=String.valueOf(e1);
				String a6=String.valueOf(f);
				String a7=String.valueOf(g);
				//------------------------------------------------
				String b1=String.valueOf(m);
				String b2=String.valueOf(n);
				String b3=String.valueOf(o);
				String b4=String.valueOf(p);
				String b5=String.valueOf(q);
				String b6=String.valueOf(r);
				String b7=String.valueOf(s);
		//-----------------------------------------------------------
				String sma=String.valueOf(ma);
				String smb=String.valueOf(mb);
				String smc=String.valueOf(mc);
				String smd=String.valueOf(md);
				String sme=String.valueOf(me);
				String smf=String.valueOf(mf);
				String smg=String.valueOf(mg);
				String smm=String.valueOf(mm);
				String smn=String.valueOf(mn);
				String smo=String.valueOf(mo);
				String smp=String.valueOf(mp);
				String smq=String.valueOf(mq);
				String smr=String.valueOf(mr);
				String sms=String.valueOf(ms);
				
				String x1=String.valueOf(x);
				String y1=String.valueOf(y);
				String z1=String.valueOf(z);
				
				String stotalfc=String.valueOf(totalfc);  //Calculation of Food Cost
				String stotaldc=String.valueOf(totaldc);       //   Calculation of Drink Cost
				String stotalfd=String.valueOf(totalfd);    //  Total of the Food & Drink
				String stotal1=String.valueOf(finaltotal);    // All Calculation
				
				
				
				TA.append("\n\t\t   Cafe Selfie\n"+"\t                      Ring Road,Mohammadpur\n      ------------------------------------------------------------------------------------------------------------\n\n");
				//TA.append("                          \t\t\t                    Number X Prices\n\n");
				if(a>0){
				TA.append("*    Fiery Grilled Chicken\t\t                     "+a1+" X "+da+"= "+sma+"\n");
				}
				if(b>0){
				TA.append("*    Chicken Burger       \t\t                     "+a2+" X "+db+"= "+smb+"\n");
				}
				if(c>0){
				TA.append("*    Chicken Dosa         \t\t                     "+a3+" X "+dc+"= "+smc+"\n");
				}
				if(d>0){
				TA.append("*    Fancy Fry            \t\t                     "+a4+" X "+dd+"= "+smd+"\n");
				}
				if(e1>0){
				TA.append("*    Noodles              \t\t                     "+a5+" X "+de+"= "+sme+"\n");
				}
				if(f>0){
				TA.append("*    Sweet Corn           \t\t                     "+a6+" X "+df+"= "+smf+"\n");
				}
				if(g>0){
				TA.append("*    Ice-Cream            \t\t                     "+a7+" X "+dg+"= "+smg+"\n");
				}
				if(m>0){
				TA.append("*    Tea                  \t\t                     "+b1+" X "+dm+"=  "+smm+"\n");
				}
				if(n>0){
				TA.append("*    Hot Coffee           \t\t                     "+b2+" X "+dn+"= "+smn+"\n");
				}
				if(o>0){
				TA.append("*    Cold Coffee          \t\t                     "+b3+" X "+do1+"= "+smo+"\n");
				}
				if(p>0){
				TA.append("*    Cocacola             \t\t                     "+b4+" X "+dp+"= "+smp+"\n");
				}if(q>0){
				TA.append("*    Pepsi                \t\t                     "+b5+" X "+dq+"= "+smq+"\n");
				}
				if(r>0){
				TA.append("*    Juice                \t\t                     "+b6+" X "+dr+"= "+smr+"\n");
				}
				if(s>0){
				TA.append("*    Water                \t\t                     "+b7+" X  "+ds+"= "+sms+"\n");
				}
				 
				TA.append("       -----------------------------------------------------------------------------------------------------------\n");
				
				TA.append("\t\t\t    Total Foods & Drinks= "+totalfd+"\n");
				
				if(x>0){
				TA.append("\t\t\t   Home Delivary CHarge= "+dhome+"\n");}
				if(y>0){
				TA.append("\t\t\t\t          Vat= "+dvat+"\n");}
				if(z>0){
				TA.append("\t\t\t\tDiscount= "+z1+"%\n");}
				TA.append("       -----------------------------------------------------------------------------------------------------------\n");
				
				TA.append("\t\t\t                      Total Taka = "+stotal1+"\n");
			} catch (Exception e2) {
				JOptionPane.showMessageDialog(null, e2);
			/*	f1.setText("0");
				f2.setText("0");
				f3.setText("0");
				f4.setText("0");
				f5.setText("0");
				f6.setText("0");
				f7.setText("0");
				d1.setText("0");
				d2.setText("0");
				d3.setText("0");
				d4.setText("0");
				d5.setText("0");
				d6.setText("0");
				d7.setText("0");
				discount.setText("0");
			
				tfc.setText("");
				tdc.setText("");
				total.setText("");
				TA.setText("");*/
			}
				 
			}
			
		});
		button_4.setForeground(Color.RED);
		button_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_4.setBackground(Color.PINK);
		button_4.setBounds(99, 11, 101, 56);
		panel_14.add(button_4);
		
		JButton button_5 = new JButton("Print");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				if(TA.equals(null))
				{
			JOptionPane.showConfirmDialog(null,"There is no Data in your Text Field");}
			
			
				try {
					
				
					boolean ta=TA.print();
				} catch (PrinterException e3) {
                   
					e3.printStackTrace();
					JOptionPane.showConfirmDialog(null,"Done");
				
			}}
		});
		button_5.setForeground(Color.RED);
		button_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_5.setBackground(Color.PINK);
		button_5.setBounds(292, 11, 95, 56);
		panel_14.add(button_5);
		
		JLabel lblCafeSelfie = new JLabel("Cafe Selfie");
		lblCafeSelfie.setForeground(Color.RED);
		lblCafeSelfie.setFont(new Font("Bookman Old Style", Font.BOLD, 40));
		lblCafeSelfie.setBounds(522, 11, 332, 45);
		panel_1.add(lblCafeSelfie);
		JButton button_3 = new JButton(" Reset");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TA.setText("");
				f1.setText("0");
				f2.setText("0");
				f3.setText("0");
				f4.setText("0");
				f5.setText("0");
				f6.setText("0");
				f7.setText("0");
				d1.setText("0");
				d2.setText("0");
				d3.setText("0");
				d4.setText("0");
				d5.setText("0");
				d6.setText("0");
				d7.setText("0");
				discount.setText("0");
	        	hdc.setText("0");
	        	Vat.setText("0");
				tfc.setText("");
				tdc.setText("");
				total.setText("");
				
				
			}
		});
		button_3.setForeground(Color.RED);
		button_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_3.setBackground(Color.PINK);
		button_3.setBounds(349, 11, 89, 55);
		panel_10.add(button_3);
		
		JLabel lblClock = new JLabel("Clock :");
		lblClock.setForeground(new Color(255, 0, 0));
		lblClock.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblClock.setBounds(829, 11, 77, 34);
		panel_1.add(lblClock);
		
		clock2 = new JTextField("0");
		clock2.setEditable(false);
		clock2.setHorizontalAlignment(SwingConstants.CENTER);
		clock2.setForeground(Color.RED);
		clock2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		clock2.setColumns(10);
		clock2.setBackground(new Color(0, 255, 127));
		clock2.setBounds(902, 10, 425, 34);
		panel_1.add(clock2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\SHUVO\\Desktop\\coffee-cup.png"));
		lblNewLabel.setBounds(434, 0, 77, 57);
		panel_1.add(lblNewLabel);
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 228, 225));
		tabbedPane.addTab("	Data Update			", null, panel_2, null);
		panel_2.setLayout(null);
		
		JPanel panel_15 = new JPanel();
		panel_15.setLayout(null);
		panel_15.setBorder(new LineBorder(new Color(64, 224, 208), 2));
		panel_15.setBackground(new Color(0, 250, 154));
		panel_15.setBounds(179, 101, 411, 399);
		panel_2.add(panel_15);
		
		JLabel label_28 = new JLabel("Foods");
		label_28.setForeground(Color.RED);
		label_28.setFont(new Font("Tahoma", Font.BOLD, 24));
		label_28.setBounds(10, 11, 90, 27);
		panel_15.add(label_28);
		
		JLabel label_29 = new JLabel("1. Fiery Grilled Chicken");
		label_29.setFont(new Font("Arial", Font.BOLD, 17));
		label_29.setBounds(10, 49, 189, 30);
		panel_15.add(label_29);
		
		JLabel label_30 = new JLabel("2. Chicken Burger");
		label_30.setFont(new Font("Arial", Font.BOLD, 18));
		label_30.setBounds(10, 90, 177, 30);
		panel_15.add(label_30);
		
		JLabel label_31 = new JLabel("3. Chicken Dosa");
		label_31.setFont(new Font("Arial", Font.BOLD, 18));
		label_31.setBounds(10, 131, 177, 30);
		panel_15.add(label_31);
		
		JLabel label_32 = new JLabel("4. Fancy Fry");
		label_32.setFont(new Font("Arial", Font.BOLD, 18));
		label_32.setBounds(10, 172, 177, 30);
		panel_15.add(label_32);
		
		JLabel label_33 = new JLabel("5. Noodles");
		label_33.setFont(new Font("Arial", Font.BOLD, 18));
		label_33.setBounds(10, 213, 177, 30);
		panel_15.add(label_33);
		
		JLabel label_34 = new JLabel("6. Sweet Corn");
		label_34.setFont(new Font("Arial", Font.BOLD, 18));
		label_34.setBounds(10, 246, 177, 30);
		panel_15.add(label_34);
		
		JLabel label_35 = new JLabel("7. Ice-Cream");
		label_35.setFont(new Font("Arial", Font.BOLD, 18));
		label_35.setBounds(10, 287, 177, 30);
		panel_15.add(label_35);
		
		df1 = new JTextField("0");
		df1.setHorizontalAlignment(SwingConstants.TRAILING);
		df1.setForeground(Color.RED);
		df1.setFont(new Font("Felix Titling", Font.BOLD, 20));
		df1.setColumns(10);
		df1.setBackground(new Color(250, 250, 210));
		df1.setBounds(197, 53, 200, 27);
		panel_15.add(df1);
		
		df2 = new JTextField("0");
		df2.setHorizontalAlignment(SwingConstants.TRAILING);
		df2.setForeground(Color.RED);
		df2.setFont(new Font("Felix Titling", Font.BOLD, 20));
		df2.setColumns(10);
		df2.setBackground(new Color(250, 250, 210));
		df2.setBounds(197, 90, 200, 27);
		panel_15.add(df2);
		
		df3 = new JTextField("0");
		df3.setHorizontalAlignment(SwingConstants.TRAILING);
		df3.setForeground(Color.RED);
		df3.setFont(new Font("Felix Titling", Font.BOLD, 20));
		df3.setColumns(10);
		df3.setBackground(new Color(250, 250, 210));
		df3.setBounds(197, 128, 200, 27);
		panel_15.add(df3);
		
		df4 = new JTextField("0");
		df4.setHorizontalAlignment(SwingConstants.TRAILING);
		df4.setForeground(Color.RED);
		df4.setFont(new Font("Felix Titling", Font.BOLD, 20));
		df4.setColumns(10);
		df4.setBackground(new Color(250, 250, 210));
		df4.setBounds(197, 172, 200, 27);
		panel_15.add(df4);
		
		df5 = new JTextField("0");
		df5.setHorizontalAlignment(SwingConstants.TRAILING);
		df5.setForeground(Color.RED);
		df5.setFont(new Font("Felix Titling", Font.BOLD, 20));
		df5.setColumns(10);
		df5.setBackground(new Color(250, 250, 210));
		df5.setBounds(197, 213, 200, 27);
		panel_15.add(df5);
		
		df6 = new JTextField("0");
		df6.setHorizontalAlignment(SwingConstants.TRAILING);
		df6.setForeground(Color.RED);
		df6.setFont(new Font("Felix Titling", Font.BOLD, 20));
		df6.setColumns(10);
		df6.setBackground(new Color(250, 250, 210));
		df6.setBounds(197, 253, 200, 27);
		panel_15.add(df6);
		
		df7 = new JTextField("0");
		df7.setHorizontalAlignment(SwingConstants.TRAILING);
		df7.setForeground(Color.RED);
		df7.setFont(new Font("Felix Titling", Font.BOLD, 20));
		df7.setColumns(10);
		df7.setBackground(new Color(250, 250, 210));
		df7.setBounds(197, 294, 200, 27);
		panel_15.add(df7);
		
		JLabel label_36 = new JLabel("------------------------------------------------------------------------------------------------");
		label_36.setFont(new Font("Tahoma", Font.PLAIN, 11));
		label_36.setBounds(10, 328, 387, 7);
		panel_15.add(label_36);
		
		JLabel lblHomeDelavaryCost = new JLabel("Home Delivery Cost");
		lblHomeDelavaryCost.setFont(new Font("Arial", Font.BOLD, 18));
		lblHomeDelavaryCost.setBounds(10, 346, 189, 30);
		panel_15.add(lblHomeDelavaryCost);
		
		dhdc = new JTextField("0");
		dhdc.setHorizontalAlignment(SwingConstants.TRAILING);
		dhdc.setForeground(Color.RED);
		dhdc.setFont(new Font("Felix Titling", Font.BOLD, 20));
		dhdc.setColumns(10);
		dhdc.setBackground(new Color(250, 250, 210));
		dhdc.setBounds(197, 342, 200, 34);
		panel_15.add(dhdc);
		
		JLabel label_38 = new JLabel("------------------------------------------------------------------------------------------------");
		label_38.setFont(new Font("Tahoma", Font.PLAIN, 11));
		label_38.setBounds(10, 37, 387, 7);
		panel_15.add(label_38);
		
		JLabel label_50 = new JLabel("Price");
		label_50.setForeground(Color.RED);
		label_50.setFont(new Font("Tahoma", Font.BOLD, 24));
		label_50.setBounds(285, 11, 112, 27);
		panel_15.add(label_50);
		
		JPanel panel_16 = new JPanel();
		panel_16.setLayout(null);
		panel_16.setBorder(new LineBorder(new Color(64, 224, 208), 2));
		panel_16.setBackground(new Color(0, 250, 154));
		panel_16.setBounds(627, 101, 411, 399);
		panel_2.add(panel_16);
		
		JLabel label_39 = new JLabel(" Drinks");
		label_39.setForeground(Color.RED);
		label_39.setFont(new Font("Tahoma", Font.BOLD, 24));
		label_39.setBounds(10, 11, 90, 27);
		panel_16.add(label_39);
		
		JLabel label_40 = new JLabel("1.  Tea");
		label_40.setFont(new Font("Arial", Font.BOLD, 18));
		label_40.setBounds(10, 49, 90, 30);
		panel_16.add(label_40);
		
		dd1 = new JTextField("0");
		dd1.setHorizontalAlignment(SwingConstants.TRAILING);
		dd1.setForeground(Color.RED);
		dd1.setFont(new Font("Felix Titling", Font.BOLD, 20));
		dd1.setColumns(10);
		dd1.setBackground(new Color(250, 250, 210));
		dd1.setBounds(184, 49, 217, 27);
		panel_16.add(dd1);
		
		JLabel label_41 = new JLabel("2. Hot Coffee");
		label_41.setFont(new Font("Arial", Font.BOLD, 18));
		label_41.setBounds(10, 90, 135, 30);
		panel_16.add(label_41);
		
		JLabel label_42 = new JLabel("3. Cold Coffee");
		label_42.setFont(new Font("Arial", Font.BOLD, 18));
		label_42.setBounds(10, 131, 123, 30);
		panel_16.add(label_42);
		
		JLabel label_43 = new JLabel("4. Cocacola");
		label_43.setFont(new Font("Arial", Font.BOLD, 18));
		label_43.setBounds(10, 172, 123, 30);
		panel_16.add(label_43);
		
		JLabel label_44 = new JLabel("5. Pepsi");
		label_44.setFont(new Font("Arial", Font.BOLD, 18));
		label_44.setBounds(10, 213, 123, 30);
		panel_16.add(label_44);
		
		JLabel label_45 = new JLabel("6. Juice");
		label_45.setFont(new Font("Arial", Font.BOLD, 18));
		label_45.setBounds(10, 254, 90, 30);
		panel_16.add(label_45);
		
		JLabel label_46 = new JLabel("7. Water");
		label_46.setFont(new Font("Arial", Font.BOLD, 18));
		label_46.setBounds(10, 294, 90, 30);
		panel_16.add(label_46);
		
		dd2 = new JTextField("0");
		dd2.setHorizontalAlignment(SwingConstants.TRAILING);
		dd2.setForeground(Color.RED);
		dd2.setFont(new Font("Felix Titling", Font.BOLD, 20));
		dd2.setColumns(10);
		dd2.setBackground(new Color(250, 250, 210));
		dd2.setBounds(184, 93, 217, 27);
		panel_16.add(dd2);
		
		dd3 = new JTextField("0");
		dd3.setHorizontalAlignment(SwingConstants.TRAILING);
		dd3.setForeground(Color.RED);
		dd3.setFont(new Font("Felix Titling", Font.BOLD, 20));
		dd3.setColumns(10);
		dd3.setBackground(new Color(250, 250, 210));
		dd3.setBounds(184, 135, 217, 27);
		panel_16.add(dd3);
		
		dd4 = new JTextField("0");
		dd4.setHorizontalAlignment(SwingConstants.TRAILING);
		dd4.setForeground(Color.RED);
		dd4.setFont(new Font("Felix Titling", Font.BOLD, 20));
		dd4.setColumns(10);
		dd4.setBackground(new Color(250, 250, 210));
		dd4.setBounds(184, 179, 217, 27);
		panel_16.add(dd4);
		
		dd5 = new JTextField("0");
		dd5.setHorizontalAlignment(SwingConstants.TRAILING);
		dd5.setForeground(Color.RED);
		dd5.setFont(new Font("Felix Titling", Font.BOLD, 20));
		dd5.setColumns(10);
		dd5.setBackground(new Color(250, 250, 210));
		dd5.setBounds(184, 220, 217, 27);
		panel_16.add(dd5);
		
		dd6 = new JTextField("0");
		dd6.setHorizontalAlignment(SwingConstants.TRAILING);
		dd6.setForeground(Color.RED);
		dd6.setFont(new Font("Felix Titling", Font.BOLD, 20));
		dd6.setColumns(10);
		dd6.setBackground(new Color(250, 250, 210));
		dd6.setBounds(184, 261, 217, 27);
		panel_16.add(dd6);
		
		dd7 = new JTextField("0");
		dd7.setHorizontalAlignment(SwingConstants.TRAILING);
		dd7.setForeground(Color.RED);
		dd7.setFont(new Font("Felix Titling", Font.BOLD, 20));
		dd7.setColumns(10);
		dd7.setBackground(new Color(250, 250, 210));
		dd7.setBounds(184, 301, 217, 27);
		panel_16.add(dd7);
		
		JLabel label_47 = new JLabel("------------------------------------------------------------------------------------------------");
		label_47.setFont(new Font("Tahoma", Font.PLAIN, 11));
		label_47.setBounds(14, 335, 387, 7);
		panel_16.add(label_47);
		
		JLabel lblVat = new JLabel("Vat");
		lblVat.setFont(new Font("Arial", Font.BOLD, 18));
		lblVat.setBounds(10, 353, 162, 30);
		panel_16.add(lblVat);
		
		dvat = new JTextField("0");
		dvat.setHorizontalAlignment(SwingConstants.TRAILING);
		dvat.setForeground(Color.RED);
		dvat.setFont(new Font("Felix Titling", Font.BOLD, 20));
		dvat.setColumns(10);
		dvat.setBackground(new Color(250, 250, 210));
		dvat.setBounds(184, 349, 217, 34);
		panel_16.add(dvat);
		
		JLabel label_49 = new JLabel("------------------------------------------------------------------------------------------------");
		label_49.setFont(new Font("Tahoma", Font.PLAIN, 11));
		label_49.setBounds(10, 35, 387, 7);
		panel_16.add(label_49);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setForeground(Color.RED);
		lblPrice.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblPrice.setBounds(209, 11, 188, 27);
		panel_16.add(lblPrice);
		
		JButton btnUpdate = new JButton("  Update");
		btnUpdate.setIcon(new ImageIcon("C:\\Users\\SHUVO\\Desktop\\if_Sync_32555.png"));
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PreparedStatement pst=null;
				ResultSet rs=null;
				
				try {
					String sql="Update all_data		set		fd1='"+df1.getText()+"',fd2='"+df2.getText()+"',fd3='"+df3.getText()+"',fd4='"+df4.getText()+"',fd5='"+df5.getText()+"',fd6='"+df6.getText()+"',fd7='"+df7.getText()+"',dk1='"+dd1.getText()+"',dk2='"+dd2.getText()+"',dk3='"+dd3.getText()+"',dk4='"+dd4.getText()+"',dk5='"+dd5.getText()+"', dk6='"+dd6.getText()+"',dk7='"+dd7.getText()+"',home='"+dhdc.getText()+"',vat='"+dvat.getText()+"'"; 
					
					
					
							
					pst=con.prepareStatement(sql);
					
				
					JOptionPane.showMessageDialog(null,"New Data Updated");
			
					pst.executeUpdate();
					
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, e2);
					
				}
				
			}
		});
		
		
		btnUpdate.setForeground(Color.BLUE);
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnUpdate.setBounds(179, 601, 229, 44);
		panel_2.add(btnUpdate);
		
		JButton btnShowPreviesData = new JButton(" Show Previous Data");
		btnShowPreviesData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					String query = "select * from all_data";
					PreparedStatement pst = con.prepareStatement(query);
					ResultSet rs = pst.executeQuery();
					df1.setText(rs.getString("fd1"));
					df2.setText(rs.getString("fd2"));
					df3.setText(rs.getString("fd3"));
					df4.setText(rs.getString("fd4"));
					df5.setText(rs.getString("fd5"));
					df6.setText(rs.getString("fd6"));
					df7.setText(rs.getString("fd7"));
					dd1.setText(rs.getString("dk1"));
					dd2.setText(rs.getString("dk2"));
					dd3.setText(rs.getString("dk3"));
					dd4.setText(rs.getString("dk4"));
					dd5.setText(rs.getString("dk5"));
					dd6.setText(rs.getString("dk6"));
					dd7.setText(rs.getString("dk7"));
					dhdc.setText(rs.getString("home"));
					dvat.setText(rs.getString("vat"));
				}
				 catch (Exception e2) {
						JOptionPane.showMessageDialog(null,	e2);
					 		}
			
			}
		});
		btnShowPreviesData.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnShowPreviesData.setForeground(new Color(0, 0, 205));
		btnShowPreviesData.setBounds(466, 599, 219, 44);
		panel_2.add(btnShowPreviesData);
		
		JLabel lblHereYouCan = new JLabel("Here You Can Change Your Product Price");
		lblHereYouCan.setForeground(Color.RED);
		lblHereYouCan.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblHereYouCan.setBounds(274, 31, 664, 27);
		panel_2.add(lblHereYouCan);
	      
		
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(240, 230, 140));
		tabbedPane.addTab("Admin", null, panel_3, null);
		panel_3.setLayout(null);
		
		
		JLabel lblOldUserName = new JLabel("Old User Name");
		lblOldUserName.setForeground(new Color(199, 21, 133));
		lblOldUserName.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblOldUserName.setBounds(420, 150, 132, 24);
		panel_3.add(lblOldUserName);
		
		JLabel lblOldPassword = new JLabel("Old Password");
		lblOldPassword.setForeground(new Color(199, 21, 133));
		lblOldPassword.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblOldPassword.setBounds(420, 196, 132, 24);
		panel_3.add(lblOldPassword);
		
		JLabel nun = new JLabel("New User Name");
		nun.setForeground(new Color(199, 21, 133));
		nun.setFont(new Font("Tahoma", Font.BOLD, 15));
		nun.setBounds(420, 306, 132, 24);
		panel_3.add(nun);
		
		JLabel lblNewPassword = new JLabel("New Password");
		lblNewPassword.setForeground(new Color(199, 21, 133));
		lblNewPassword.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewPassword.setBounds(420, 361, 132, 28);
		panel_3.add(lblNewPassword);
		
		oun = new JTextField();
		oun.setBackground(new Color(224, 255, 255));
		oun.setFont(new Font("Tahoma", Font.BOLD, 15));
		oun.setBounds(549, 144, 213, 35);
		panel_3.add(oun);
		oun.setColumns(10);
		
		NUN = new JTextField();
		NUN.setFont(new Font("Tahoma", Font.BOLD, 15));
		NUN.setColumns(10);
		NUN.setBackground(new Color(224, 255, 255));
		NUN.setBounds(549, 304, 213, 35);
		panel_3.add(NUN);
		
		JButton btnNewButton = new JButton("Update");
		btnNewButton.setForeground(new Color(0, 0, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PreparedStatement pst=null;
				ResultSet rs=null;
				int count=0;
				
				try {
					String a=oun.getText();
					String b=op.getText();
					if(a.contentEquals("")&&b.contentEquals(""))
					{
						JOptionPane.showMessageDialog(null,"Please Enter the User Name & Password");
					}
					
					String query="select * from admin where username=? and password=?";
					pst=con.prepareStatement(query);   // con is connection variable
					
					pst.setString(1,oun.getText());
					pst.setString(2,op.getText());
					
					rs=pst.executeQuery();
					while(rs.next())
					{
					count++;
					}
					if(count==1)
					{
						JOptionPane.showMessageDialog(null,"User and Password is Correct");
						/*try {
							String sql="delete from admin where username= ?";
							pst=con.prepareStatement(sql);
							pst.setString(1,NUN.getText());
							//pst.setString(2,np.getText());
							pst.execute();
							
							JOptionPane.showMessageDialog(null,"Your data is deleted");
							
						} catch (Exception e2) {
							JOptionPane.showMessageDialog(null, e2);
							
						}*/
						
						
						
						
						
						
						JOptionPane.showMessageDialog(null,"User and Password is Correct");
						try {
							String sql="Update admin set  username='"+NUN.getText()+"',password='"+np.getText()+"'";
							pst=con.prepareStatement(sql);
							//pst.setString(1,NUN.getText());
							//pst.setString(2,np.getText());
							pst.executeUpdate();
							JOptionPane.showMessageDialog(null,"New User & Password Updated");
							
						} catch (Exception e2) {
							JOptionPane.showMessageDialog(null, e2);
							
						}
						 
						
					}
					
					else
						JOptionPane.showMessageDialog(null,"Wrong Password");
						
					pst.close();
					rs.close();
					
					
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, e2);
					
				}
				
			
		}
			
			
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\SHUVO\\Desktop\\if_Sync_32555.png"));
		btnNewButton.setBounds(420, 449, 132, 44);
		panel_3.add(btnNewButton);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				oun.setText(null);
				op.setText(null);
				NUN.setText(null);
				np.setText(null);
				
			}
			
		});
		btnReset.setIcon(new ImageIcon("C:\\Users\\SHUVO\\Desktop\\if_Reset_40149.png"));
		btnReset.setForeground(Color.BLUE);
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnReset.setBounds(564, 449, 132, 44);
		panel_3.add(btnReset);
		
		op = new JPasswordField();
		op.setBackground(new Color(224, 255, 255));
		op.setBounds(549, 193, 213, 35);
		panel_3.add(op);
		
		np = new JPasswordField();
		np.setBackground(new Color(224, 255, 255));
		np.setBounds(549, 354, 213, 35);
		panel_3.add(np);
		
		JButton btnBackToLogin = new JButton("Back To Login");
		btnBackToLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Login_System.main(null);
			
			
			}
		});
		btnBackToLogin.setForeground(Color.BLUE);
		btnBackToLogin.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnBackToLogin.setBounds(723, 449, 179, 44);
		panel_3.add(btnBackToLogin);
		
		textField = new JTextField("0");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setForeground(Color.RED);
		textField.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBackground(new Color(240, 230, 140));
		textField.setBounds(441, 21, 425, 34);
		panel_3.add(textField);
		
		JLabel label_37 = new JLabel("Clock :");
		label_37.setForeground(Color.RED);
		label_37.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		label_37.setBounds(368, 22, 77, 34);
		panel_3.add(label_37);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(250, 250, 210));
		tabbedPane.addTab("		Developers				", null, panel_4, null);
		panel_4.setLayout(null);
		
		JLabel label_48 = new JLabel("");
		label_48.setIcon(new ImageIcon("C:\\Users\\SHUVO\\Desktop\\18222687_770644066428500_2993287022067820259_n.jpg"));
		label_48.setBounds(899, 26, 160, 150);
		panel_4.add(label_48);
		
		JLabel label_51 = new JLabel("");
		label_51.setIcon(new ImageIcon("C:\\Users\\SHUVO\\Desktop\\19601616_812024092311554_2432906482419667636_n.jpg"));
		label_51.setBounds(899, 194, 160, 150);
		panel_4.add(label_51);
		
		JLabel label_52 = new JLabel("");
		label_52.setIcon(new ImageIcon("C:\\Users\\SHUVO\\Desktop\\13882451_1752867464994866_7550728954806131190_n.jpg"));
		label_52.setBounds(899, 349, 160, 150);
		panel_4.add(label_52);
		
		JLabel label_53 = new JLabel("");
		label_53.setIcon(new ImageIcon("C:\\Users\\SHUVO\\Desktop\\19756637_1133912710042012_2200598814227786850_n.jpg"));
		label_53.setBounds(899, 521, 160, 150);
		panel_4.add(label_53);
		
		JLabel lblIdName = new JLabel("ID: 162-15-7944        Name: Tarikul Hasan");
		lblIdName.setForeground(Color.RED);
		lblIdName.setFont(new Font("Bookman Old Style", Font.BOLD, 33));
		lblIdName.setBounds(61, 75, 758, 45);
		panel_4.add(lblIdName);
		
		JLabel lblIdName_1 = new JLabel("ID: 162-15-8144        Name: Rubel Chandra ");
		lblIdName_1.setForeground(Color.RED);
		lblIdName_1.setFont(new Font("Bookman Old Style", Font.BOLD, 33));
		lblIdName_1.setBounds(61, 248, 788, 45);
		panel_4.add(lblIdName_1);
		
		JLabel lblIdName_2 = new JLabel("ID: 162-15-7863           Name: Mostafijur Rahman");
		lblIdName_2.setForeground(Color.RED);
		lblIdName_2.setFont(new Font("Bookman Old Style", Font.BOLD, 28));
		lblIdName_2.setBounds(71, 395, 758, 45);
		panel_4.add(lblIdName_2);
		
		JLabel lblIdName_3 = new JLabel("ID: 162-15-7783      Name: Shahadat Hossain");
		lblIdName_3.setForeground(Color.RED);
		lblIdName_3.setFont(new Font("Bookman Old Style", Font.BOLD, 28));
		lblIdName_3.setBounds(61, 555, 758, 45);
		panel_4.add(lblIdName_3);
		
		JLabel lblIdName_4 = new JLabel("ID: 162-15-8016    Name: Md. Nuruzzaman");
		lblIdName_4.setForeground(Color.RED);
		lblIdName_4.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 36));
		lblIdName_4.setBounds(27, 645, 822, 57);
		panel_4.add(lblIdName_4);
		
		
	
		
	}
}
