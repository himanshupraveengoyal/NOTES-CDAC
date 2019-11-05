//ArrayPrgm.java
import java.io.*;
class ArrayPrgm
{
	static void FirstExample()
	{
		int values[]=new int[5];
		for(int i=0;i<5;i++)
		{
			values[i]=i+1;
			System.out.println(values[i]);
		}
	}

	static void SecondExample()
	{
		int n=MyConsole.getNumber("Enter the Size of Array:");
		int value[]=new int[n];
		for(int i=0;i<n;i++)
		{
			value[i]=MyConsole.getNumber("Enter the value:");
		}
		int index=0;
		while(index<n)
		{
			System.out.println(value[index]);
			index++;
		}
	}

	static void ThirdExample()
	{
		int score[]={120,50,60,14,0,56};
		for (int value : score) 
		{
			System.out.println(value);
		}
	}

	static void MultiDimensionalArry()
	{
		int[][] marks = {{45,54,55,45},{65,66,76,63},{78,75,78,84},{87,90,95,81},{88,78,90,85}};
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(marks[i][j]+ " ");
			}
			System.out.println();
		}
	}

	static void JaggedArry()
	{
		int [][]school = new int[4][];	//Fixed 4 Rows And Variable Coloumns
		school[0] = new int[]{67,67,77,77};	
		school[1] = new int[]{67,45,90,77,77};	
		school[2] = new int[]{67,54,66};
		school[3] = new int[]{67,67,66,23,66,77,87,67};	

		for(int i=0;i<4;i++)
		{
			for (int value : school[i]) 
			{
				System.out.print(value+ " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) 
	{
		//FirstExample();		//Simple Synatx For Array
		//SecondExample();		//Taking input and giving output
		//ThirdExample();		//Learning For Each Loop
		//MultiDimensionalArry();	//MultiDimensional Array
		JaggedArry();			//Jagged Array Variable coloumn Fixed Rows
	}
}