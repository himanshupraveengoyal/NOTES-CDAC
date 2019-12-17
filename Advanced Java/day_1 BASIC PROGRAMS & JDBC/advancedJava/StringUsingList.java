package advancedJava;

import java.util.*;

public class StringUsingList {

	public static void main(String[] args) 
	{
		String str=MyConsole.getString("Enter the String");
		List<Character> chars=ConvertToList(str);
		for(char ch:chars)
			System.out.println(ch+" "+CountCharacters(chars,ch));
	}

	private static int CountCharacters(List<Character> chars,char ch) 
	{
		int count=0;
		for(char ch1:chars)
		{
			if(ch==ch1)
				count++;
		}
		return count;
	}

	private static List<Character> ConvertToList(String str) 
	{
		List<Character> chars=new ArrayList<Character>();
		for(char ch:str.toCharArray())
			chars.add(ch);
		return chars;
	}
}
