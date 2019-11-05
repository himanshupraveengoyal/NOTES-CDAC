//MyConsole.java

import java.io.Console;
import java.lang.Object;

public class MyConsole{
	private static Console con = System.console();
	public static String getString(String question){
		System.out.println(question);
		return con.readLine();
	}

	public static int getNumber(String question){
		return Integer.parseInt(getString(question));
	} 

	public static double getDouble(String question){
		return Double.parseDouble(getString(question));
	}

	public static void print(Object data)
	{
		System.out.println(data);
	}
}