package Mixed_Patient_Prgm;

import java.sql.*;
import java.util.ArrayList;


import Day3.MyConsole;

public class PatientDB implements FunctionSpecificing
{
	final static String url="jdbc:mysql://localhost:3306/javaex";
	final static String user="root";
	final static String pwd="root";

	public Connection getConnection() throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,user,pwd);
		return con;
	}
	
	public int PerformOperations(String dbquery)
	{
		int rowaffected=0;
		try 
		{
			Connection con=getConnection();
			if(con==null)	MyConsole.ErrPrint("Connection Error...!!!");
			PreparedStatement ps=con.prepareStatement(dbquery);
			rowaffected=ps.executeUpdate();
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return rowaffected;
	}
	ArrayList<Patient> pdetails=new ArrayList<Patient>();
	public void LoadRecords(String dbquery)
	{
		try {
			Connection con=getConnection();
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(dbquery);
			while(rs.next())
			{
				int id=rs.getInt(0);
				String pname=rs.getString(1);
				String dname=rs.getString(2);
				String phno=rs.getString(3);
				double bill=rs.getDouble(4);
				Patient p=new Patient(id, pname, dname, phno, bill);
				pdetails.add(p);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void AddNewPatient(Patient p) 
	{
		String dbquery=String.format("insert into patient(pname,dname,phno,bill) values('%s','%s','%s','%f')",p.getPname(),p.getDname(),p.getPhno(),p.getBill());
		PerformOperations(dbquery);
	}

	@Override
	public void UpdatePatient(Patient p) 
	{
		String dbquery=String.format("update patient set pname='%s',dname='%s',phno='%s',bill='%f' where id=%d", p.getPname(),p.getDname(),p.getPhno(),p.getBill(),p.getId());
		PerformOperations(dbquery);
	}

	@Override
	public void DeletePatient(int id) {
		String dbquery=String.format("delete from patient where id=%d",id);
		PerformOperations(dbquery);
		
	}

	@Override
	public ArrayList<Patient> GetAllPatients() {
		LoadRecords("select * from patients");
		return pdetails;
	}

	@Override
	public ArrayList<Patient> FindPatient(int id) 
	{
		String dbquery="select * from patient where id="+id;
		LoadRecords(dbquery);
		ArrayList<Patient> temp=new ArrayList<Patient>();
		for(Patient search:pdetails)
		{
			if(search.getId()==id)
				temp.add(search);
		}
		return temp;
	}
	
}
