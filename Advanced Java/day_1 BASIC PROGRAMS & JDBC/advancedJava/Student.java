package advancedJava;
 class Student{

private int rollNo;
private char gender;
private double percentage;

public int getRollNo() {
	return rollNo;
	
}

public char getGender() {
	return gender;
}

public double getPercentage() {
	return percentage;
}


public Student(int rollNo,char gender,double percentage) {
	this.rollNo=rollNo;
	this.gender=gender;
	this.percentage=percentage;
}
	}
