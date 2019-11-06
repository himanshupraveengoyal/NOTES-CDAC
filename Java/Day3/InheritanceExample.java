package Day3;

class ParentClass
{
	public void ParentFn()
	{
		MyConsole.Print("Parent Class");
	}
}

class ChildClass extends ParentClass
{
	public void ChildFn()
	{
		MyConsole.Print("Child Class");
	}
}

public class InheritanceExample 
{
	public static void main(String[] args) 
	{
		ParentClass pc=new ParentClass();
		pc.ParentFn();
		ChildClass cc=new ChildClass();
		cc.ChildFn();
	}

}
