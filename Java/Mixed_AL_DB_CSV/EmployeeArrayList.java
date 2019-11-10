package Mixed_AL_DB_CSV;

import java.util.*;

interface IEmployeeFuctions
{
	void AddNewEmployee(Employee emp);
	void UpdateEmployee(Employee emp) throws Exception;
	void DeleteEmployee(int id) throws Exception;
	ArrayList<Employee> GetAllEmployee();
	ArrayList<Employee> FindEmployee(int id);
}
public class EmployeeArrayList implements IEmployeeFuctions
{
	ArrayList<Employee> empdetails=new ArrayList<Employee>();
	@Override
	public void AddNewEmployee(Employee emp) {
		empdetails.add(emp);
	}

	@Override
	public void UpdateEmployee(Employee emp) throws Exception 
	{
		boolean flag=false;
		for(int i=0;i<empdetails.size();i++)
		{
			if(empdetails.get(i).getEmpId()==emp.getEmpId())
			{
				flag=true;
				empdetails.remove(i);
				empdetails.add(i,emp);
			}
		}
		if(flag==false)
			throw new Exception("Employee not found");
		
	}

	@Override
	public void DeleteEmployee(int id) throws Exception 
	{
		boolean flag=false;
		for(int i=0;i<empdetails.size();i++)
		{
			if(empdetails.get(i).getEmpId()==id)
			{
				flag=true;
				empdetails.remove(i);
			}
		}
		if(flag==false)
			throw new Exception("Employee not found");
	}

	@Override
	public ArrayList<Employee> GetAllEmployee() {
		return empdetails;
	}

	@Override
	public ArrayList<Employee> FindEmployee(int id) 
	{
		ArrayList<Employee> temp=new ArrayList<Employee>();
		for(Employee emp:empdetails)
			if(emp.getEmpId()==id)
				temp.add(emp);
		return temp;
	}
	
}
