package advancedJava;

public class VowelsConsonant 
{
	public static void main(String[] args) 
	{
		String str=MyConsole.getFullString("Enter the String:");
		String words[]=str.split(" ");
		for(String data:words)
			calculateVowelsAndConsonant(data);
	}

	private static void calculateVowelsAndConsonant(String data) 
	{
		int vc=0,cc=0;
		for(char eachword:data.toCharArray())
		{
			if(eachword=='a'||eachword=='e'||eachword=='i'||eachword=='o'||eachword=='u')
				vc++;
			else
				cc++;
		}
		MyConsole.print("Vowels in "+data+" are:"+vc);
		MyConsole.print("Consonant in "+data+" are:"+cc);
	}

}
