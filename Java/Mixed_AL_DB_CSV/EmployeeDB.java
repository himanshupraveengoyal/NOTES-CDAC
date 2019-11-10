package Mixed_AL_DB_CSV;

import java.sql.*;
import java.util.ArrayList;

import Day3.MyConsole;

public class EmployeeDB implements IEmployeeFuctions
{
	//Declare JDBC Variables
	final static String url = "jdbc:mysql://localhost:3306/javaex";
	final static String user="root";
	final static String pass="root";
	
	//Connection Function
	private Connection getConnections() throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		return DriverManager.getConnection(url, user, pass);
	}
	//Function to perform action of Insert,Update,Delete
	private int PerformOperations(String dbquery)
	{
		int rowaffected=0;
		try 
		{
			Connection con=getConnections();
			if(con == null) MyConsole.Print("Connection failed to establish");
			PreparedStatement ps = con.prepareStatement(dbquery);
			rowaffected=ps.executeUpdate();
		}
		catch (Exception e) {
			MyConsole.ErrPrint(e.getMessage());
		}
		
		return rowaffected;
	}
	//Function to Load all Data from MYSQL
	private ArrayList<Employee> LoadData(String dbquery) 
	{
		ArrayList<Employee> empDetails=new ArrayList<Employee>();
		try 
		{
			Connection con=getConnections();
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(dbquery);
			while(rs.next())
			{
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String address = rs.getString(3);
				int salary = rs.getInt(4);
				Employee emp = new Employee(id, name, address, salary);
				empDetails.add(emp);
			}
		}
		catch (SQLException e) 
		{
			MyConsole.ErrPrint(e.getMessage());
		} 
		catch (Exception e) 
		{
			MyConsole.ErrPrint(e.getMessage());
		}
		return empDetails;
	}

	@Override
	public void AddNewEmployee(Employee emp) 
	{
		String dbquery="insert into employee(empName,empCity,empSalary) values('"+emp.getEmpName()+"','"+emp.getEmpAddress()+"',"+ emp.getEmpSalary()+")";
		System.out.println(dbquery);
		PerformOperations(dbquery);
	}

	@Override
	public void UpdateEmployee(Employee emp) throws Exception 
	{
		String dbquery="update employee set empName='"+emp.getEmpName()+"',empCity='"+emp.getEmpAddress()+"', empSalary="+emp.getEmpSalary()+" where empId="+emp.getEmpId();
		int num = PerformOperations(dbquery);
		if(num==0) throw new Exception("Employee not found");
	}

	@Override
	public void DeleteEmployee(int id) throws Exception 
	{
		String dbquery="delete from employee where empId="+id;
		int num = PerformOperations(dbquery);
		if(num==0) throw new Exception("Employee not found");
	}

	@Override
	public ArrayList<Employee> GetAllEmployee() {
		String dbquery="select * from employee";
		ArrayList<Employee> emp = LoadData(dbquery);
		return emp;
	}

	@Override
	public ArrayList<Employee> FindEmployee(int id) {
		String dbquery="select * from employee where empId="+id;
		ArrayList<Employee> emp = LoadData(dbquery);
		return emp;
	}

}