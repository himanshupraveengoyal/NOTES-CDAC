package advancedJava;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> treeExample = new TreeMap<Integer,String>();
		/*
		 * treeExample.put(1,"Ebord Thwane"); treeExample.put(3, "Rock");
		 * treeExample.put(4, "Harrison Wells"); treeExample.put(23,"Dr. Wells");
		 * treeExample.put(67,"Harry Wells"); treeExample.put(33, "Sherloque Wells");
		 */
		
		addingValue(treeExample);
		addingValue(treeExample);
		
		display(treeExample);
		
		removeValueUsingKey(treeExample);
		
		display(treeExample);

	}

	private static void removeValueUsingKey(TreeMap<Integer, String> treeExample) {
		int i = MyConsole.getInt("Enter id of value you want to be removed");
		treeExample.remove(i);
	}

	private static void addingValue(TreeMap<Integer, String> treeExample) {
		int i=MyConsole.getInt("Enter the Number");
		String s=MyConsole.getString("Enter the Name");
		treeExample.put(i,s);
	}

	private static void display(TreeMap<Integer, String> treeExample) {
		for(Map.Entry m:treeExample.entrySet()) {
			System.out.println(m.getKey()+" " + m.getValue());
		}
	}

}
