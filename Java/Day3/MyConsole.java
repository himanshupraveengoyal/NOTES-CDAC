package Day3;

import java.util.Scanner;

public class MyConsole 
{
	private static Scanner scan=new Scanner(System.in);
	
	//Print the Value to User
	static void Print(Object obj)
	{
		System.out.println(obj);
	}
	
	//Get String Value From User
	static String GetString(String question)
	{
		System.out.println(question);
		return scan.next();
	}
	
	//Get Double Value From User
	static double GetDouble(String question)
	{
		System.out.println(question);
		return scan.nextDouble();
	}
	
	//Get Integer Value From User
	static int GetInt(String question)
	{
		System.out.println(question);
		return scan.nextInt();
	}
	
}
