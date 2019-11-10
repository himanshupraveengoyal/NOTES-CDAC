package Mixed_AL_DB_CSV;

import java.io.*;
import java.util.*;

public class EmployeeIO implements IEmployeeFuctions
{
	ArrayList<Employee> empdetail=new ArrayList<Employee>();
	String filename="Employee.csv";
	private void LoadRecords()
	{
		empdetail.clear();
		try 
		{
			FileReader reader=new FileReader(filename);
			BufferedReader breader=new BufferedReader(reader);
			String line="";
			while((line=breader.readLine())!=null)
			{
				String words[]=line.split(",");
				Employee emp=new Employee(Integer.parseInt(words[0]), words[1], words[2], Integer.parseInt(words[3]));
				empdetail.add(emp);
			}
			breader.close();
		} 
		catch (NumberFormatException e) 
		{
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	@Override
	public void AddNewEmployee(Employee emp) 
	{
		try 
		{
			FileWriter writer=new FileWriter(filename,true);
			writer.write(emp.toString()+"\n");
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void UpdateEmployee(Employee emp) throws Exception 
	{
		boolean flag=false;
		for(int i=0;i<empdetail.size();i++)
		{
			if(empdetail.get(i).getEmpId()==emp.getEmpId())
			{
				empdetail.remove(i);
				empdetail.add(i,emp);
				flag=true;
			}
		}
		if(flag==true)
		{
			new FileWriter(filename,false).close();
			for(Employee employee:empdetail)
				AddNewEmployee(employee);
		}
		else
			throw new Exception("Employee Does not exists");	
	}

	@Override
	public void DeleteEmployee(int id) throws Exception 
	{
		boolean flag=false;
		for(int i=0;i<empdetail.size();i++)
		{
			if(empdetail.get(i).getEmpId()==id)
			{
				empdetail.remove(i);
				flag=true;
			}
		}
		if(flag==true)
		{
			new FileWriter(filename,false).close();
			for(Employee emp:empdetail)
				AddNewEmployee(emp);
		}
		else
			throw new Exception("Employee Does not exists");
	}

	@Override
	public ArrayList<Employee> GetAllEmployee() {
		LoadRecords();
		return empdetail;
	}

	@Override
	public ArrayList<Employee> FindEmployee(int id) {
		LoadRecords();
		ArrayList<Employee> temp=new ArrayList<Employee>();
		for(Employee emp:empdetail)
			if(emp.getEmpId()==id)
				temp.add(emp);
		return temp;
	}

}