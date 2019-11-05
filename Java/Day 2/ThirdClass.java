//ThirdClass.java
class Employee
{
	private int eid;
	private String ename;
	private String eaddress;
	//Constructor
	Employee(int id,String name,String address)
	{
		eid=id;
		ename=name;
		eaddress=address;
	}
	public String EmployeeName()
	{
		return ename;
	}
	public String EmployeeAddress()
	{
		return eaddress;
	}
	public int GetId()
	{
		return eid;
	}
	public String Data()
	{
		return " Name:"+ename+" Address:"+eaddress;
	}	
}
class ThirdClass
{
	public static void main(String[] args) 
	{
		Employee emp=new Employee(141,"Himanshu","Bangalore");
		MyConsole.print("Id:"+emp.GetId()+emp.Data());
	}
}