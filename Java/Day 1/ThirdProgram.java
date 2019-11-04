//ThirdProgram.java
import java.io.*;
import java.lang.*;
class ThirdProgram
{
	public static void main(String[] args) 
	{
		String name=Prompt.getString("Enter the Name:");
		String age=Prompt.getString("Enter the Age:");
		String address=Prompt.getString("Enter the Address:");
		String result="Name:"+name+" Age:"+age+ " Address:"+address+"\n";
		System.console().printf(result);

		Score.maths=Integer.parseInt(Prompt.getString("Enter the Maths Marks:"));
		Score.english=Integer.parseInt(Prompt.getString("Enter the English Marks:"));
		Score.science=Integer.parseInt(Prompt.getString("Enter the Science Marks:"));
		String score="Maths:"+Score.maths+" English:"+Score.english+ " Science:"+Score.science;
		System.console().printf(score);
	}
}

class Score
{
	static int maths;
	static int science;
	static int english;
}
class Prompt
{
	static String getString(String str)
	{
		System.console().printf(str);
		String input=System.console().readLine();
		return input;
	}
}