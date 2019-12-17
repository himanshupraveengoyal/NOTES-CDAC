package advancedJava;

public class TestPrimitiveVariables {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj = new Student(39,'M',78.20);
		int rollNo=obj.getRollNo();
		char gender=obj.getGender();
		double percentage=obj.getPercentage();
		System.out.printf("The details are %d    %s     %.2f",rollNo,gender,percentage);
		
		
		

	}
}
