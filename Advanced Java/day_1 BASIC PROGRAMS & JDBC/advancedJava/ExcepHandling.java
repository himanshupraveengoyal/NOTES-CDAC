package advancedJava;

public class ExcepHandling 
{
	public static void main(String[] args) 
	{
		int fn=MyConsole.getInt("Enter the Positive First Number:");
		int sn=MyConsole.getInt("Enter the Positive Second Number:");
		try 
		{
			double div = performDivision(fn,sn);
			System.out.println("After Division:"+div);
		} 
		catch (Exception e) 
		{
			System.out.println(e);
		}
		finally 
		{
			MyConsole.print("It will execute whatever happened but not in case of system failure");
		}
	}
	
	private static int performDivision(int fn, int sn) throws ArithmeticException
	{
		if(fn<0||sn<0)
			throw new ArithmeticException("Enter Positive Number");
		return fn/sn;
	}
}
