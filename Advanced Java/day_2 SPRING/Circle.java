package advJavaDay2;

import advancedJava.MyConsole;

public class Circle 
{
	private int rad;
	
	Circle()
	{
		System.out.println("Circle Class Called");
	}
	
	public void setArea(int rad)
	{
		MyConsole.print("Area:"+3.14*rad*rad);
	}
	
	public void setCircumference(int rad)
	{
		MyConsole.print("Circumference:"+2*3.14*rad);
	}
	
}
