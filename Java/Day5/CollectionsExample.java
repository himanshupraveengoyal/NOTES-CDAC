package Day5;

import java.util.*;

public class CollectionsExample 
{
	public static void main(String[] args) 
	{
		ArrayListExample();
		HashSetExample();
		HashMapExample();
		QueueExample();
	}

	private static void QueueExample() 
	{
		Queue<String> qu=new LinkedList<String>();
		qu.add("Apple");	//Adding Element to ArrayList
		qu.add("Orange");
		qu.add("Banana");
		qu.add("PineApple");	
		System.out.println("All Elements In Queue");
		for(String fruit : qu)
		{
			System.out.println(fruit);
		}
		System.out.println("First Element:"+qu.peek());
		System.out.println("Removed Element:"+qu.remove());		//Can only Delete the First Element
		System.out.println("First Element:"+qu.peek());
		System.out.println("Removed Element:"+qu.remove());
		System.out.println("First Element:"+qu.peek());
	}

	private static void HashMapExample() 
	{
		HashMap<String, String> users=new HashMap<String, String>();
		users.put("Himanshu", "Welcome123");
		users.put("Kamlesh", "Kamli123");
		users.put("Devesh", "Devu123");
		
		for(Map.Entry m:users.entrySet())
		{
			System.out.println("User Name:"+m.getKey()+"\tPassword:"+m.getValue());
		}
	}

	private static void HashSetExample() 
	{
		HashSet<String> arr=new HashSet<String>();
		arr.add("Apple");	//Adding Element to ArrayList
		arr.add("Orange");
		arr.add("Banana");
		arr.add("PineApple");
		arr.add("Banana");
		arr.add("PineApple");
		System.out.println("Total Fruits:"+arr.size());		//Size of Array List
		for(String fruit : arr)
		{
			System.out.println(fruit);
		}
		//HashSet does not allow to add the same value multiple times if found it automatically rejects adding it & does not show any compilation error or exceptions
		arr.add("Banana");
		arr.add("PineApple");
		System.out.println("Total Fruits:"+arr.size());		//Size of Array List
		for(String fruit : arr)
		{
			System.out.println(fruit);
		}
	}

	private static void ArrayListExample() 
	{
		ArrayList<String> arr=new ArrayList<String>();
		arr.add("Apple");	//Adding Element to ArrayList
		arr.add("Orange");
		arr.add("Banana");
		arr.add("PineApple");
		arr.add("Banana");
		arr.add("PineApple");
		arr.add(2, "Guava");	//Adding Element in Array List At Specific Position
		System.out.println("Total Fruits:"+arr.size());		//Size of Array List
		for(String fruit : arr)
		{
			System.out.println(fruit);
		}
		arr.remove(6);//Removing Element to Array List
		arr.remove(5);
		System.out.println("Total Fruits:"+arr.size());		
		for(String fruit : arr)
		{
			System.out.println(fruit);
		}
	}

}
