package Day4;

import Day3.MyConsole;

interface Addition
{
	double PerformAddition(double first,double second);
}
interface Subtraction
{
	double PerformSubtraction(double first,double second);
}
interface Multiplication
{
	double PerformMultiplication(double first,double second);
}
interface Division
{
	double PerformDivision(double first,double second);
}
public class FunctionalInterFaceExample 
{
	public static void main(String[] args) 
	{
		double firstNum=MyConsole.GetDouble("Enter the First value:");
		double SecondNum=MyConsole.GetDouble("Enter the Second value:");
		
		Addition add=(double first,double second)->{return first+second;};
		Subtraction sub=(double first,double second)->{return first-second;};
		Multiplication multi=(double first,double second)->{return first*second;};
		Division div=(double first,double second)->{return first/second;};
		
		MyConsole.Print("Addition:"+add.PerformAddition(firstNum, SecondNum));
		MyConsole.Print("Subtraction:"+sub.PerformSubtraction(firstNum, SecondNum));
		MyConsole.Print("Multiplication:"+multi.PerformMultiplication(firstNum, SecondNum));
		MyConsole.Print("Division:"+div.PerformDivision(firstNum, SecondNum));
		
	}
}
