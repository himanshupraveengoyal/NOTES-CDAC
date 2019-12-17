package advancedJava;

import java.util.*;

public class DSMapping {

	public static void main(String[] args) 
	{
		Map<Integer,String> users=new HashMap<Integer,String>();
		
		addUsers(users);
		mapIterator(users);
		removeUsers(users);
	}

	private static void removeUsers(Map<Integer, String> users) 
	{
		int i=MyConsole.getInt("Enter the UserId to Remove:");
		users.remove(i);
	}

	private static void addUsers(Map<Integer, String> users) 
	{
		int i=MyConsole.getInt("Enter Id:");
		String name=MyConsole.getString("Enter the Name:");
		users.put(i,name);
	}

	private static void mapIterator(Map<Integer, String> users) 
	{
		Set set=users.entrySet();
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			Map.Entry allusers=(Map.Entry)itr.next();
			MyConsole.print(allusers.getKey()+" "+allusers.getValue());
		}
	}

}
