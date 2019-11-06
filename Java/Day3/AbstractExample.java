package Day3;

abstract class Testing
{
	abstract void myFunc();
}

class NewTesting extends Testing
{
	@Override
	void myFunc()
	{
		MyConsole.Print("Testing Data");
	}
}

public class AbstractExample 
{
	public static void main(String[] args) 
	{
		Testing test=new NewTesting();
		test.myFunc();
	}
}
