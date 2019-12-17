package day3_Assignment1;

import java.util.Scanner;

public class MyConsole 
{
	private static Scanner scan=new Scanner(System.in);
	
	//Print the Value to User
	public static void print(Object obj)
	{
		System.out.println(obj);
	}
	
	public static void errPrint(String question)
	{
		System.err.println(question);
	}
	
	//Get String Value From User
	public static String getString(String question)
	{
		System.out.println(question);
		return scan.next();
	}
	
	public static String getFullString(String question)
	{
		System.out.println(question);
		return scan.nextLine();
	}
	
	//Get Integer Value From User
	public static int getInt(String question)
	{
		System.out.println(question);
		return scan.nextInt();
	}
}
