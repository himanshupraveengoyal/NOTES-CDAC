package Day5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample {
	
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) 
	{	
		InputMistachedExcep();
		MultipleCatchStatements();
		ArithmeticExcepExample();
	}

	private static void ArithmeticExcepExample() 
	{
		try 
		{
			System.out.println("Enter the First Number:");
			int fnum=scan.nextInt();
			System.out.println("Enter the Second Number:");
			int snum=scan.nextInt();
			double result=fnum/snum;
			System.out.println("Result:"+result);
		} 
		catch (Exception e) 
		{
			System.out.println("Number Cannot be divided  by Zero ");
		}
	}

	private static void MultipleCatchStatements() 
	{
		try 
		{
			int arr[]= {10,20,30,40,50,60,70};
			System.out.println("Enter the Index:");
			int index=scan.nextInt();
			System.out.println("Number Found At Index:"+index+" value:"+arr[index]);
		} 
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("Index Does Not Exists");
		}
		catch (InputMismatchException e) 
		{
			System.out.println("Invalid number");
		}
	}

	private static void InputMistachedExcep() {
		try 
		{
			System.out.println("Enter the Number:");
			int numb=scan.nextInt();
			System.out.println("Entered Number:"+numb);
		} 
		catch (InputMismatchException ex) 
		{
			System.out.println("Invalid number");
		}
	}

}
