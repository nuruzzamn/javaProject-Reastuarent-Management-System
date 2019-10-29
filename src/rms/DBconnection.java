package rms;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import javax.swing.*;
import javax.swing.JOptionPane;

public class DBconnection {
	
Connection con = null;
	
	public static Connection db()
	
	{
		try{
			Class.forName("org.sqlite.JDBC");
			Connection con = DriverManager.getConnection("jdbc:sqlite:F://password.sqlite");
			//JOptionPane.showMessageDialog(null, "Connection Successful");
	    return con;
			
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, e);
			return null;
		}
	}
}

