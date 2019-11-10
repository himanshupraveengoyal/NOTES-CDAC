package Mixed_AL_DB_CSV;

import java.util.ArrayList;
import Day3.MyConsole;

public class EmployeeUI 
{
//	static IEmployeeFuctions collections=new EmployeeArrayList();
//	static IEmployeeFuctions collections=new EmployeeIO();
	static IEmployeeFuctions collections=new EmployeeDB();
	
	
	public static void main(String[] args) 
	{
		try 
		{
			boolean run=true;
			do 
			{
				int choice=MyConsole.GetInt(Menu());
				if(choice<=5 && choice!=0)
					ProcessMenu(choice);
				else
					run=false;
			}
			while(run!=false);
			
		} 
		catch (Exception e) 
		{
			MyConsole.ErrPrint(e.getMessage());
		}
	}
	
	
	private static void ProcessMenu(int choice) throws Exception 
	{
		switch(choice)
		{
			case 1:
				AddEmployee();
				break;
			case 2:
				UpdateEmployee();
				break;
			case 3:
				DeleteEmployee();
				break;
			case 4:
				FindEmployee();
				break;
			case 5:
				DisplayAllEmployee();
				break;
			default:
				break;
		}
	}

	private static String Menu() 
	{
		String menu="PRESS 1-------------------->ADD EMPLOYEE \n";
		menu+="PRESS 2-------------------->UPDATE EMPLOYEE \n";
		menu+="PRESS 3-------------------->REMOVE EMPLOYEE \n";
		menu+="PRESS 4-------------------->FIND EMPLOYEE \n";
		menu+="PRESS 5-------------------->DISPLAY ALL EMPLOYEE \n";
		menu+="ENTER YOUR CHOICE ANY OTHER WILL BE CONSIDERED AS EXIT";
		return menu;
	}

	private static void FindEmployee() 
	{
		int id=MyConsole.GetInt("Enter the ID:");
		ArrayList<Employee> EmpDetail=collections.FindEmployee(id);
		for(Employee emp:EmpDetail)
			MyConsole.Print("Id:"+emp.getEmpId()+"\tName:"+emp.getEmpName()+"\tAddress:"+emp.getEmpAddress()+"\tSalary:"+emp.getEmpSalary());
	}
	
	private static void UpdateEmployee() throws Exception 
	{
		int id=MyConsole.GetInt("Enter the ID:");
		String name=MyConsole.GetString("Enter the Name:");
		String address=MyConsole.GetString("Enter the Address:");
		int salary=MyConsole.GetInt("Enter the Salary:");
		Employee emp=new Employee(id, name, address, salary);
		collections.UpdateEmployee(emp);
	}

	private static void DeleteEmployee() throws Exception
	{
		int id=MyConsole.GetInt("Enter the ID:");
		collections.DeleteEmployee(id);
	}

	private static void DisplayAllEmployee() 
	{
		ArrayList<Employee> allEmpDetails=collections.GetAllEmployee();
		for(Employee emp:allEmpDetails)
			MyConsole.Print("Id:"+emp.getEmpId()+"\tName:"+emp.getEmpName()+"\tAddress:"+emp.getEmpAddress()+"\tSalary:"+emp.getEmpSalary());
	}
	
	private static void AddEmployee() 
	{
		int id=MyConsole.GetInt("Enter the ID:");
		String name=MyConsole.GetString("Enter the Name:");
		String address=MyConsole.GetString("Enter the Address:");
		int salary=MyConsole.GetInt("Enter the Salary:");
		Employee emp=new Employee(id, name, address, salary);
		collections.AddNewEmployee(emp);
	}
}