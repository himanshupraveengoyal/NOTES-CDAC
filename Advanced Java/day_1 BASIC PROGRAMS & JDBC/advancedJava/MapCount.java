package advancedJava;

import java.util.*;
	class MapCount 
{
	public static void main(String []args)
	{
	 String s =MyConsole.getFullString("Enter String:");
	 HashMap<Character,Integer> CountMap=new HashMap<Character,Integer>();
	 
	char[] starray = s.toCharArray();
	for(char c : starray)
	{ 
		if(CountMap.containsKey(c))
		{
		 CountMap.put(c,CountMap.get(c) + 1);
		}
		else
		{
			CountMap.put(c, 1);
		}
	}
	
	for(Map.Entry entry : CountMap.entrySet())
	{
		System.out.println(entry.getKey() + " " + entry.getValue());}
	}
}