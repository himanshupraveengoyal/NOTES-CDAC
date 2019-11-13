package Mixed_Patient_Prgm;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile 
{
	public static String ReadDocument()
	{
		String menu="";
		try 
		{
			FileReader reader=new FileReader("Menu.txt");
			BufferedReader breader=new BufferedReader(reader);
			String line="";
			while((line=breader.readLine())!=null)
			{
				menu+=line;
				menu+="\n";
			}
			breader.close();
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		return menu;
	}
}
