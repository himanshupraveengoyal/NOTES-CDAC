package advancedJava;

class Devu{
	void concept() {
		System.out.println("if you will  use super then parent class method will be called");
	}
}
public class SuperUsingMethod extends Devu {

	void concept() {
		System.out.println("without super child method is called");
	}
	
	void showOff() {
		concept();
		super.concept();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  SuperUsingMethod s= new SuperUsingMethod();
  s.showOff();
	}

}
