/*
Friend Functions and Classes:
A Friend Function of a class is one which is defined outside but has access to all the members of a class including private members. Friend functions are not members of the class, it will be implemented externally. 
A class can also be a friend class where the class has access to all the members of the class.
Friend functions must be created as a need based development as it would deprive the encapsulation feature of any Object oriented class. 
*/

#include"CommonFunctions.h"
/******************Friend Function declaration and usage*********/
class TestClass {
private:
	int score;
	string subject;
public:
	TestClass(string sub, int marks) {
		score = marks;
		subject = sub;
	}
	friend void showDetails(TestClass &cls);//This line means that the object of the TestClass that is created will be passed as arg to this function not a copy of the object....
};

void showDetails(TestClass &cls) {
	cout << "The student has scored " << cls.score << " in the subject of " << cls.subject << endl;
}//This function even though its defined outside the class, it is able to access the private members of the class to which it does not belong. 

//Is to create the object of the TestClass and read its data....
void DisplayTestDetails() {
	TestClass test("Cpp", 78);
	showDetails(test);
}
void main() {
	DisplayTestDetails();
}
/*
POINTS:
Friends should be used only for limited purposes. Too many functions declared as friends would lessen the purpose of encapsulation of seperate classes and functions in OOP.
Friends are not mutual. If a Class A is a friend of B, this does not imply that B is the friend of A. 
Friends are not the part of inheritance. 
*/