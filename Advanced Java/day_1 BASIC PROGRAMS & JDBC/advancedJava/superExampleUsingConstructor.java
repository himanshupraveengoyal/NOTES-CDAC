package advancedJava;

class Base{
	Base(){
		MyConsole.print("Base class constructor is called");
	}
}
public class superExampleUsingConstructor  extends Base{

	superExampleUsingConstructor(){
		super();
		MyConsole.print("its derived class , but the parent class constructor is called first because of super");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		superExampleUsingConstructor refVar = new superExampleUsingConstructor();
	}

}
