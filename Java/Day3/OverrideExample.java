package Day3;

class Parent
{
	public void MyFunc()
	{
		MyConsole.Print("Parent Class");
	}
}

class Child extends Parent
{
	@Override
	public void MyFunc()
	{
		MyConsole.Print("Child Class");
	}
}

public class OverrideExample 
{
	public static void main(String[] args) 
	{
		Parent obj=new Parent();
		obj.MyFunc();
		obj=new Child();
		obj.MyFunc();
	}

}
