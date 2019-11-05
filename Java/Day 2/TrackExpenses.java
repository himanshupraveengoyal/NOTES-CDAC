import java.util.*;
class Expenses 
{
	private int id;
	private double amount;
	private String details;
	private Date date;

	Expenses(int id,double amount,String details,Date date)
	{
		this.id=id;
		this.amount=amount;
		this.details=details;
		this.date=date;
	}

	public int GetId()
	{
		return id;
	}

	public String Details()
	{
		return details;
	}

	public Double Amount()
	{
		return amount;
	}

	public Date NewDate()
	{
		return date;
	}

	public String toString()
	{
		return "ID:"+id+" Details:"+details+" Amount:"+amount+" Date:"+date;
	}

}
//----------------------------------------------------------------------------------------------------
class ExpenseManager
{
	protected Expenses [] _allExpenses;
	int size = 0;
	static int index = 0;

	ExpenseManager(int size)
	{
		_allExpenses = new Expenses[size];
		this.size = size;
	}

	public void addNewExpenses(Expenses ex)
	{
		_allExpenses[index]=ex;
		index++;
	}

	public String findExpense(String info)
	{
		for(int i=0;i<_allExpenses.length;i++)
		{
			if(_allExpenses[i].Details().equals(info))
			{
				return _allExpenses[i].toString();
			}
		}
		return null;
	}

	public String DeleteExpense(String info)
	{
		for(int i=0;i<_allExpenses.length;i++)
		{
			if(_allExpenses[i].Details().equals(info))
			{
				_allExpenses[i]=null;
				return "DELETED";
			}
		}
		return "Expense Not Found";
	}

	public String UpdateExpense(Expenses ex)
	{
		for(int i=0;i<_allExpenses.length;i++)
		{
			if(_allExpenses[i].GetId()==ex.GetId())
			{
				_allExpenses[i]=ex;
				return "UPDATED";
			}
		}
		return "Expense Not Found";
	}
}
//----------------------------------------------------------------------------------------------------
class ExpenseFactory
{
	public static ExpenseManager expenseManager(String type)
	{
		if(type.equals("Array"))
		{
			int size = MyConsole.getNumber("Enter the no of Expenses to hold");
			return new ExpenseManager(size);
		}
		return null;//No memory is allocated....
	}
}
//----------------------------------------------------------------------------------------------------
class TrackExpenses
{
	static ExpenseManager _mgr = ExpenseFactory.expenseManager("Array");

	private static String getMenu()
	{
		String menu = "~~~~~~EXPENSE MANAGER SOFTWARE~~~~~~~~\n";
		menu += "TO ADD NEW EXPENSE------------->PRESS 1\n";
		menu += "TO DELETE AN EXPENSE----------->PRESS 2\n";
		menu += "TO FIND EXPENSES--------------->PRESS 3\n";
		menu += "TO UPDATE EXPENSES--------------->PRESS 4\n";
		menu += "NOTE: ANY OTHER KEY IS CONSIDERED AS EXIT";
		return menu;
	}

	private static void processProgram()
	{
		boolean processing = true;
		String menu = getMenu();
		do{
			int choice = MyConsole.getNumber(menu);
			processing = processMenu(choice);
		}while(processing);
	}

	private static boolean processMenu(int choice)
	{
		switch (choice) 
		{
			case 1:
				addingExpense();
				break;
			case 2:
				deleteExpense();
				break;		
			case 3:
				findingExpense();
				break;
			case 4:
				updateExpense();
				break;	
			default:
				return false;
		}
		return true;
	}


	public static void main(String[] args) 
	{
		if(_mgr == null)
		{
			MyConsole.print("OOPS! Something wrong happened!!!\n");
			return;
		}
		processProgram();
	}
//------------------------------ADDING EXPENSE
	private static void addingExpense()
	{
		try
		{
			int id=MyConsole.getNumber("Enter the Id:");
			String details=MyConsole.getString("Enter the Details:");
			Double amount=MyConsole.getDouble("Enter the Amount:");
			int dd=MyConsole.getNumber("Enter the Date:");
			int mm=MyConsole.getNumber("Enter the Month:");
			int yy=MyConsole.getNumber("Enter the Year:");
			Date dt=new Date(yy,mm,dd);
			Expenses ex=new Expenses(id,amount,details,dt);
			_mgr.addNewExpenses(ex);

		}
		catch(Exception ex)
		{
			MyConsole.print(ex.getMessage());
		}	
	}
//-----------------------------FINDING EXPENSE
	private static void findingExpense()
	{
		String detail=MyConsole.getString("Enter Some Detail About Expense:");
		try
		{
			String expenses = _mgr.findExpense(detail);
			MyConsole.print(expenses);
		}
		catch(Exception ex)
		{
			MyConsole.print(ex.getMessage());
		}
	}
//------------------------------DELETE EXPENSE
	private static void deleteExpense()
	{
		String detail=MyConsole.getString("Enter Some Detail About Expense:");
		try
		{
			String expenses = _mgr.DeleteExpense(detail);
			MyConsole.print(expenses);
		}
		catch(Exception ex)
		{
			MyConsole.print(ex.getMessage());
		}
	}
//------------------------------UPDATE EXPENSE
	private static void updateExpense()
	{
		int id=MyConsole.getNumber("Enter the Id You Want To Update:");
		try
		{
			String details=MyConsole.getString("Enter the Details:");
			Double amount=MyConsole.getDouble("Enter the Amount:");
			int dd=MyConsole.getNumber("Enter the Date:");
			int mm=MyConsole.getNumber("Enter the Month:");
			int yy=MyConsole.getNumber("Enter the Year:");
			Date dt=new Date(yy,mm,dd);
			Expenses ex=new Expenses(id,amount,details,dt);
			String val=_mgr.UpdateExpense(ex);
			MyConsole.print(val);

		}
		catch(Exception ex)
		{
			MyConsole.print(ex.getMessage());
		}
	}
}