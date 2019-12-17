package jdbc_test;

import java.sql.*;

public class ConnectJDBC 
{
	final static String url="jdbc:mysql://localhost:3306/javaex";
	final static String user="root";
	final static String pass="root";
	
	public Connection getConnection() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection(url, user, pass);
	}
	
	public int PerformOperation(String dbquery)
	{
		int rowsAffected=0;
		try 
		{
			Connection con=getConnection();
			if(con==null)	System.err.println("Error Connecting MySQL");
			PreparedStatement ps=con.prepareStatement(dbquery);
			rowsAffected=ps.executeUpdate();
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rowsAffected;
	}
	
	private void LoadRecords(String dbquery)
	{
		try 
		{
			Connection con=getConnection();
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(dbquery);
			while(rs.next())
			{
				
			}
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
