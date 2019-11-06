package Day3;

/*
 	Step 1:Create Main Class
 	Step 2:Create Account Class
 	Step 3:Create Other Classes(SB,RD,FD)
 	Step 4:Create ENUM
 	Step 5:Create AccountFactory Class
 	Step 6:Create Abstract Demo Class and create 2 functions for Showing AccType and Asking His 
 		   Account Type
 */
enum AccType
{
	FD,RD,SB
}
abstract class Account
{
	int AccNo;
	String AccHolder;
	double balance;
	
	void Credit(double amount)
	{
		balance+=amount;
	}
	
	void Debit(double amount) throws Exception
	{
		if(amount>balance)
		{
			throw new Exception("Insufficient Funds");
		}
		balance-=amount;
	}
	
	abstract void CalculateInterest();
}
class SBAccount extends Account
{
	@Override
	void CalculateInterest() 
	{
		double interest= balance * 1/12 * 6.5/100;
		Credit(interest);
	}	
}
class FDAccount extends Account
{
	@Override
	void CalculateInterest() 
	{
		double interest= balance * 1/12 * 10/100;
		Credit(interest);
	}	
}
class RDAccount extends Account
{
	@Override
	void CalculateInterest() 
	{
		double interest= balance * 1/12 * 12/100;
		Credit(interest);
	}	
}
class AccountFactory
{
	public static Account createAccount(AccType acc)
	{
		switch(acc)
		{
			case FD:
				return new FDAccount();
			case RD:
				return new RDAccount();
			default:
				return new SBAccount();
		}
	}
}
class AbstractDemo
{
	public static void PrintAccountType()
	{
		MyConsole.Print("Please Select Your Account Type:");
		AccType [] types=AccType.values();
		for (AccType accType : types) 
		{
			MyConsole.Print(accType);
		}
	}
	public static AccType ChooseType()
	{
		String value=MyConsole.GetString("Enter your Account Type:");
		AccType acctype=AccType.valueOf(value);
		return acctype;
	}
}
public class AccountExample 
{
	public static void main(String[] args) 
	{
		AbstractDemo.PrintAccountType();
		AccType type=AbstractDemo.ChooseType();
		Account acc=AccountFactory.createAccount(type);
		acc.AccNo=MyConsole.GetInt("Enter the Account Number:");
		acc.AccHolder=MyConsole.GetString("Enter the Account Holder Name:");
		acc.balance=MyConsole.GetDouble("Enter the Balance:");
		acc.CalculateInterest();
		MyConsole.Print("Balance:"+acc.balance);
	}
}