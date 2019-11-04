//SecondProgram.java

import java.io.*;
class SecondProgram
{
	public static void main(String[] args)
	{
		System.console().printf("Enter the Name:");
		String name=System.console().readLine();
		System.console().printf("Enter Age:");
		String age=System.console().readLine();
		System.console().printf("Enter Roll No:");
		String rno=System.console().readLine();
		String result="Name:"+name+" Age:"+age+ " Rollno"+rno;
		System.console().printf(result);
	}
}
