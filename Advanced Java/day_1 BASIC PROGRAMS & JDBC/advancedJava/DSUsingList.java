package advancedJava;
import java.util.ArrayList;

public class DSUsingList 
{
	public static void main(String[] args) 
	{
		ArrayList<String> fruit = new ArrayList<>();
		int choice;
		do
		{
			MyConsole.print(Menu());
			choice=MyConsole.getInt("Enter your choice ");
			ProcessMenu(fruit, choice);
		}
		while(choice<4);
	}

	private static void ProcessMenu(ArrayList<String> fruit, int choice) 
	{
		
		switch(choice)
		{
			case 1:
				addFruit(fruit);
				break;
			case 2:
				displayFruit(fruit);
				break;
			case 3:
				modifyFruit(fruit);
				break;
			case 4:
				searchFruit(fruit);
			default:
				break;
		}
	}



	private static String Menu() 
	{
		String menu="";
		menu+="1-------->Add Fruit \n";
		menu+="2-------->Display Fruit \n";
		menu+="3-------->Modify Fruit \n";
		menu+="4-------->Search Fruit \n";
		return menu;
	}

	private static void displayFruit(ArrayList<String> fruit) 
	{
		for(String fname : fruit)
		{
			MyConsole.print(fname);
		}
	}
	
	private static void searchFruit(ArrayList<String> fruit) 
	{
		String fruit1 = MyConsole.getString("Enter the fruit Name:");
		for(int i=0;i<fruit.size();i++)
		{
			if(fruit1.equals(fruit.get(i)))
			{
				MyConsole.getString("Fruit Found:"+i);
			}
		}
	}
	
	private static void addFruit(ArrayList<String> fruit) 
	{
		String fruit1  =MyConsole.getString("Enter the fruit Name");
		fruit.add(fruit1);
	}
	
	private static void modifyFruit(ArrayList<String> fruit)
	{
		String fruit1 = MyConsole.getString("Enter the fruit Name:");
		for(int i=0;i<fruit.size();i++)
		{
			if(fruit1.equals(fruit.get(i)))
			{
				fruit.remove(i);
				String fruit2=MyConsole.getString("Enter the New Name");
				fruit.add(i, fruit2);
			}
		}
	}

}
