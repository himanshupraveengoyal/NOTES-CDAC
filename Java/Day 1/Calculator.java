//Calculator.java
import java.io.*;
class Calculator
{
	static int Addition(int a,int b)
	{
		return a+b;
	}
	static int Subtraction(int a,int b)
	{
		return a-b;
	}
	static int Multiplication(int a,int b)
	{
		return a*b;
	}
	static int Division(int a,int b)
	{
		return a/b;
	}
	static int Process(int a,int b,int opt)
	{
		switch(opt)
		{
			case 1:
				return Addition(a,b);
			case 2:
				return Subtraction(a,b);
			case 3:
				return Multiplication(a,b);
			case 4:
				return Division(a,b);
			default:
				return Addition(a,b);
		}
	}
	public static void main(String[] args)
	{
		int val;
		do
		{	
			System.console().printf("Enter 1-->Addition \n Enter 2-->Subtraction \n Enter 3-->Multiplication \n Enter 4-->Division \n Enter 5-->Exit \n Enter Input:");
			val=Integer.parseInt(System.console().readLine());
			
			if(val!=5)
			{
				System.console().printf("Enter the  First Value:");
				int a=Integer.parseInt(System.console().readLine());
			
				System.console().printf("Enter the  Second Value:");
				int b=Integer.parseInt(System.console().readLine());
				
				int result=Process(a,b,val);
				System.out.println(result);
			}
		}
		while(val!=5);
	}
}