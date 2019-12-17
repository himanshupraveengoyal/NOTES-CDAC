package day3_Assignment1;

import java.util.List;

public class Presentation 
{
	public Presentation() 
	{
		System.out.println("Presentation Layer");
	}
	
	private DAO x;
	public void setFreak(DAO dao) 
	{	
		System.out.println("dao wired in Presentation");
		this.x = dao;	
	}
	
	public void startApp() 
	{
//		insertIntoDb();
//		updateIntoDb();
//		singleRowDb();
		multipleRowDb();
	}
	
	private void multipleRowDb() 
	{
		int erewards=MyConsole.getInt("Enter Minimum Rewards:");
		List<Customers> customerlist=x.multipleData(erewards);
		if(customerlist.isEmpty())
			MyConsole.errPrint("No customer with that  rewards exists");
		else
		{
			for(Customers cust:customerlist)
			{
				System.out.println("----------------------------------------");
				System.out.println("Id:"+cust.getCustId());
				System.out.println("Password:"+cust.getPassword());
				System.out.println("Rewards:"+cust.getRewards());
				System.out.println("City:"+cust.getCity());
				
			}
		}
	}

	private void singleRowDb() 
	{
		int cid=MyConsole.getInt("Enter the Customer Id:");
		Customers customers=x.singleData(cid);
		if(customers.getRewards()==0)
			System.out.println("Customer Not Exists");
		else
			System.out.println(customers.getCustId()+" "+customers.getPassword()+" "+customers.getRewards()+" "+customers.getCity());
	}

	private void insertIntoDb() 
	{
		Customers customer = new Customers();
		int id=MyConsole.getInt("Enter the Id:");
		String pwd=MyConsole.getString("Enter the Password:");
		int rewards=MyConsole.getInt("Enter the rewards:");
		String city=MyConsole.getString("Enter City:");
		
		customer.setCustId(id);
		customer.setPassword(pwd);
		customer.setRewards(rewards);
		customer.setCity(city);
		
		boolean result=x.insertToDb(customer);
		if(result)
			MyConsole.print("Inserted Successfully");
		else
			MyConsole.errPrint("Fail to Insert");
	}
	
	private void updateIntoDb() 
	{
		Customers customer = new Customers();
		int id=MyConsole.getInt("Enter the Id:");
		String pwd=MyConsole.getString("Enter the Password:");
		int rewards=MyConsole.getInt("Enter the rewards:");
		String city=MyConsole.getString("Enter City:");
		
		customer.setCustId(id);
		customer.setPassword(pwd);
		customer.setRewards(rewards);
		customer.setCity(city);
		
		boolean result=x.updateToDb(customer);
		if(result)
			MyConsole.print("Updated Successfully");
		else
			MyConsole.errPrint("Fail to Insert");
	}

}
