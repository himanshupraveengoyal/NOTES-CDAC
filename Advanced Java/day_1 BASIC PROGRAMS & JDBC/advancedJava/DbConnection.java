package advancedJava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class DbConnection 
{
	final static String url="jdbc:mysql://localhost:3307/user";
	final static String user="root";
	final static String pass="root";
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		return DriverManager.getConnection(url, user, pass);
	}
	
	public static int performOperation(String dbquery)
	{
		int rowsAffected=0;
		try 
		{
			Connection con=getConnection();
			if(con==null)	MyConsole.errPrint("Error Connecting MySQL");
			PreparedStatement ps=con.prepareStatement(dbquery);
			rowsAffected=ps.executeUpdate();
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return rowsAffected;
	}
	
	
	static ArrayList<Customers> cDetails=new ArrayList<>();
	public static void loadRecords(String dbquery)
	{
		cDetails.clear();
		try 
		{
			Connection con=getConnection();
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(dbquery);
			while(rs.next())
			{
				int custId = rs.getInt(1);
				String password = rs.getString(2);
				int rewards = rs.getInt(3);
				String city = rs.getString(4);
				Customers customers =new Customers(custId,password,rewards,city);
				cDetails.add(customers);
			}
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
}
