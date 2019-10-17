//What is a class? Its an User defined type that can hold a composition
//of multiple data types into a single unit that could represent
// a real world entity. Entity means a real world representation of
//an alive person or a feature.
//When a class is created and used, U get a host of features of the OOP like
//Encapsulation which is also called as Data Hiding. It means that variables of the
//class(Fields or members) created are private to the class. It means that it is not
//accessible outside the class declaration.
//To make it accessible it should be defined under public accessor.
//POINT: Fields of a class are usually expected to be private.
#include<iostream>
#include<string>
using namespace std;
//Use Pascal casing for defining UR Classname, it means that the first letter of the
//word should be in upper case. If there are 2 or more words combined, then the first
//letter of every word should be in upper case.
class Student{
	//data inside this class that represents real time data of each student....
//for private members, it should be camel casing....
	int studentId;
	string studentName;
	string studentAddress;
	long studentContact;
	
public:
	void SetDetails(int id, string name, string address, long phone){
		//The object of our class is represented by a variable called this.
		studentAddress = address;
		studentName = name;
		studentContact = phone;
		studentId = id;
		//Always the parameters which are local to the function will have
		//high precedence over the class level variables with the same name. So to
		//refer the members, U should use this operator which internally refers as 
		//reference of the object thro which we could access the members using -> operator.
	}
	
	string getDetails(){
		string content = "The name is " + studentName + "The Address is " + studentAddress;
		return content;
	}
	
	string getName(){
		return studentName;
	}
	
	string getAddress(){
		return studentAddress;
	}
	
	long getContact(){
		return studentContact;
	}
	
	int getId(){
		return studentId;
	}
};
