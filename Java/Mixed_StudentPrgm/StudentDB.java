package Mixed_StudentPrgm;

import java.sql.*;
import java.util.ArrayList;

import Day3.MyConsole;

public class StudentDB implements IStudent
{
	final static String url="jdbc:mysql://localhost:3306/javaex";
	final static String user="root";
	final static String pass="root";
	
	public Connection getConnection() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		return DriverManager.getConnection(url, user, pass);
	}
	
	public int PerformOperation(String dbquery)
	{
		int rowsAffected=0;
		try 
		{
			Connection con=getConnection();
			if(con==null)	MyConsole.ErrPrint("Error Connecting MySQL");
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
	
	ArrayList<Student> sdetails=new ArrayList<Student>();
	private ArrayList<Student> LoadRecords(String dbquery)
	{
		sdetails.clear();
		try 
		{
			Connection con=getConnection();
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(dbquery);
			while(rs.next())
			{
				int id = rs.getInt(1);
				String sname = rs.getString(2);
				String fname = rs.getString(3);
				String phno = rs.getString(4);
				Student s =new Student(id, sname, fname, phno);
				sdetails.add(s);
			}
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return sdetails;
	}

	@Override
	public void AddNewStudent(Student s) 
	{
		String dbquery="insert into student(name,fname,phno) values('"+s.getSname()+"','"+s.getFname()+"','"+ s.getPhoneno()+"')";
		PerformOperation(dbquery);
	}

	@Override
	public void UpdateStudent(Student s) throws Exception 
	{

		String dbquery="update student set name='"+s.getSname()+"',fname='"+s.getFname()+"', phno='"+s.getPhoneno()+"' where id="+s.getId();
		int num = PerformOperation(dbquery);
		if(num==0) throw new Exception("Employee not found");
	}

	@Override
	public void DeleteStudent(int sid) throws Exception 
	{
		String dbquery="delete from student where id="+sid;
		int rows=PerformOperation(dbquery);
		if(rows==0)
			throw new Exception("No Student Found");
	}

	@Override
	public ArrayList<Student> GetAllStudents() {
		String dbquery="select * from student";
		LoadRecords(dbquery);
		return sdetails;
	}

	@Override
	public ArrayList<Student> FindStudent(int sid) {
		String dbquery="select * from student where id="+sid;
		LoadRecords(dbquery);
		ArrayList<Student> temp=new ArrayList<Student>();
		for(Student stud:sdetails)
		{
			if(stud.getId()==sid)
			{
				temp.add(stud);
			}
		}
		return temp;
	}

}
