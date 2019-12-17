package day3_Assignment2;

import java.util.*;

public class Presentation 
{
	private DAO x;
	public Presentation() 
	{
		System.out.println("Presentation Layer Working");
	}
	
	public void setFreak(DAO dao) 
	{	
		System.out.println("dao wired in Presentation");
		this.x = dao;	
	}
	public void startApp()
	{
		loginProcess();
	}
	
	private static String menu() 
	{
		String menu="";
		menu+="Enter 1---------->Login \n";
		menu+="Enter 2---------->Exit \n";
		menu+="Enter Your Choice:";
		return menu;
	}
	
	private void loginProcess() 
	{
		int choice=MyConsole.getInt(menu());
		switch (choice) 
		{
			case 1:
				login();
				break;
			case 2:
				break;
			default:
				MyConsole.errPrint("Invalid Response...!!! Try Again \n");
				loginProcess();
		}
	}

	private void login() 
	{
		MyConsole.print("Welcome to Login Page");
		int id=MyConsole.getInt("Enter the Customer Id:");
		String password=MyConsole.getString("Enter the Password:");
		ResourceBundle r =ResourceBundle.getBundle("sys");
		int puserid = Integer.parseInt(r.getString("userid"));
		String ppassword = r.getString("password");
		if (id==puserid&&password.equals(ppassword))
			loginSuccess();
		else
		{
			MyConsole.errPrint("Invalid Credentials...!!! Please try Again \n");
			login();
		}
	}

	private void loginSuccess() 
	{
		System.out.println("Login Successfull");
		loginProcessMenu();
	}
	
	private static String loginMenu() 
	{
		String menu="";
		menu+="Enter 1---------->New Customer \n";
		menu+="Enter 2---------->View All City \n";
		menu+="Enter 3---------->Log Off \n";
		menu+="Enter Your Choice:";
		return menu;
	}
	
	private void loginProcessMenu() 
	{
		int choice=MyConsole.getInt(loginMenu());
		switch (choice) 
		{
			case 1:
				enterCustomer();
				break;
			case 2:
				viewCityCustomers();
				break;
			case 3:
				login();
				break;
			default:
				MyConsole.errPrint("Invalid Response...!!! Try Again \n");
				loginProcessMenu();
		}
	}

	private void enterCustomer() 
	{
		int id=MyConsole.getInt("Enter the id:");
		Customers cust=x.getUserData(id);
		if(cust.getRewards()==-100)
		{
			//Add Insert Function and proceed
			insertFurtherDetails(id);
		}
		else
		{
			//make update delete menu and proceed
			custDetailsProcessMenu(id);
		}
	}

	private void custDetailsProcessMenu(int id) 
	{
		int choice=MyConsole.getInt(newMenu());
		switch (choice) 
		{
			case 1:
				updateCustomer(id);
				break;
			case 2:
				deleteCustomer(id);
				break;
			default:
				MyConsole.errPrint("Invalid Response...!!! Try Again \n");
				custDetailsProcessMenu(id);
		}		
	}

	private void updateCustomer(int id) 
	{
		String password=MyConsole.getString("Enter the Password:");
		int rewards=MyConsole.getInt("Enter the Rewards");
		String city=MyConsole.getString("Enter the city");
		Customers cust=null;
		cust.setCustId(id);
		cust.setPassword(password);
		cust.setCity(city);
		cust.setRewards(rewards);
		boolean result=x.updateToDb(cust);
		if(result)
			MyConsole.print("Updated Successfully");
		else
			MyConsole.errPrint("Failed To Insert");
	}

	private void deleteCustomer(int id) 
	{
		boolean result=x.deleteFromDb(id);
		if(result)
			MyConsole.print("Deleted Succesfully");
		else
			MyConsole.errPrint("Failed to delete");
	}

	private String newMenu() 
	{
		String menu="";
		menu+="Enter 1---------->Update Customer \n";
		menu+="Enter 2---------->Delete Customer \n";
		menu+="Enter Your Choice:";
		return menu;
	}

	private void insertFurtherDetails(int id) 
	{
		String password=MyConsole.getString("Enter the Password:");
		int rewards=MyConsole.getInt("Enter the Rewards");
		String city=MyConsole.getString("Enter the city");
		Customers cust=null;
		cust.setCustId(id);
		cust.setPassword(password);
		cust.setCity(city);
		cust.setRewards(rewards);
		boolean result=x.insertToDb(cust);
		if(result)
			MyConsole.print("Inserted Successfully");
		else
			MyConsole.errPrint("Failed To Insert");
	}

	private void viewCityCustomers() 
	{
		String ecity=MyConsole.getString("Enter City");
		List<Customers> customerlist=x.getAllCity(ecity);
		if(customerlist.isEmpty())
			System.out.println("No Customers Exists");
		else
		{
			for (Customers customers : customerlist) 
			{
				System.out.println("--------------------------------");
				System.out.println("Customer Id:"+customers.getCustId());
				System.out.println("Customer Rewards:"+customers.getRewards());
				System.out.println("Customer City:"+customers.getCity());
			}
		}
	}
	
}
