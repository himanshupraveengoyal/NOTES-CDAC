package advancedJava;

import java.util.ResourceBundle;

public class LoginPage 
{
	public static void main(String[] args) 
	{
		processMenu();
	}

	private static void processMenu() 
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
				processMenu();
		}
	}

	private static void login() 
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

	private static String menu() 
	{
		String menu="";
		menu+="Enter 1---------->Login \n";
		menu+="Enter 2---------->Exit \n";
		menu+="Enter Your Choice:";
		return menu;
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
	
	private static void loginProcessMenu() 
	{
		int choice=MyConsole.getInt(loginMenu());
		switch (choice) 
		{
			case 1:
				enterCustomer();
				break;
			case 2:
				viewCity();
				break;
			case 3:
				login();
				break;
			default:
				MyConsole.errPrint("Invalid Response...!!! Try Again \n");
				loginProcessMenu();
		}
	}

	private static void viewCity() 
	{
		String dbquery="select * from customer";
		DbConnection.loadRecords(dbquery);
		for(Customers cust:DbConnection.cDetails)
			System.out.println(cust.getCity());
	}

	private static void enterCustomer() 
	{
		int id=MyConsole.getInt("Enter the Customer Id:");
		String dbquery="select * from customer where custId="+id;
		DbConnection.loadRecords(dbquery);
		if(DbConnection.cDetails.isEmpty())
			askFurtherDetails(id);
		else
			custDetailsProcessMenu(id);
	}

	private static void custDetailsProcessMenu(int id) 
	{
		int choice=MyConsole.getInt(loginMenu());
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
				custDetailsMenu();
		}
	}

	private static void updateCustomer(int id) 
	{
		String password=MyConsole.getString("Enter the Password:");
		int rewards=MyConsole.getInt("Enter the Rewards");
		String city=MyConsole.getString("Enter the city");
		String dbquery=String.format("update customer set password='%s',rewards='%d',cuty='%s' where id='%d'",password,rewards,city, id);
		int rowaffected=DbConnection.performOperation(dbquery);
		if(rowaffected>=1)
			MyConsole.print("Customer Deleted");
	}

	private static void deleteCustomer(int id) 
	{
		String dbquery="delete from customer where custId="+id;
		int rowaffected=DbConnection.performOperation(dbquery);
		if(rowaffected>=1)
			MyConsole.print("Customer Deleted");
	}

	private static String custDetailsMenu() 
	{
		String menu="";
		menu+="Enter 1---------->Update Customer \n";
		menu+="Enter 2---------->Delete Customer \n";
		menu+="Enter Your Choice:";
		return menu;
	}

	private static void askFurtherDetails(int id) 
	{
		int custId=id,rowaffected=0;
		String password=MyConsole.getString("Enter the Password:");
		int rewards=MyConsole.getInt("Enter the Rewards");
		String city=MyConsole.getString("Enter the city");
		String dbquery=String.format("insert into customer values('%d','%s','%d','%s')", custId,password,rewards,city);
		rowaffected=DbConnection.performOperation(dbquery);
		if(rowaffected==1)	MyConsole.print("Customer Inserted");
		else	MyConsole.errPrint("Something went wrong");	
	}

	private static void loginSuccess() 
	{
		System.out.println("Success Login");
		loginProcessMenu();
	}
}