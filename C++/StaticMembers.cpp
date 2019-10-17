//#include"CommonFunctions.h"
//static means the one that does not move. static can be used on variables(withing functions) and in classes(Members of a class). 
//static variables are defined inside a function,. When a variable is defined as static, space for it will be allocated for the lifetime of the program. Even if the function is called as many no of times, the variable space is created once during the execution of the program and will be refered from the same location for the rest of the program exection. 
/********************Static variables Demo*****************************
static int count = 0;

void demoFunc() {
	 //created for the first time, next time it will refer to the same variable 
	cout << "The Count: " <<::count<< endl;
	::count++;
}//PS: try removing the static keyword and find the difference. 


void setNewValue(int no) {
	::count = no;
	cout << "The no has changed" << endl;
}
void main() {
	demoFunc();
	demoFunc();
	setNewValue(123);

	demoFunc();
	demoFunc();
	demoFunc();
}

***************************Static Members*************************/
//Fields of a class are always accessible thro an object instance. 
#include"Example.h"
class Apple {
public:
	static string fruitType;//static field
	int size;

	//static function...
	static void TestFunc() {
		cout << "Test Func" << endl;
	}
};

string Apple::fruitType = "";
 
int main() {
	/******************First Example without an object ****************
		Apple kashmirApple;
		kashmirApple.size = 200;
		Apple::fruitType = "Using ClassName, not the object name";
		kashmirApple.fruitType = "Apples, the Queen of Fruits";//setting static variable

		Apple washingtonApple;
		washingtonApple.size = 400;
		cout << washingtonApple.fruitType << endl;
	*********************Calling Static methods******************************
	//static members of the class are accessible without an object.
	Apple::TestFunc();//Static function is one which can be invoked without an object, using the name of the class....
	Apple kApple;
	kApple.TestFunc();//However, C++ does not stop from calling the static members thro their objects....
	cout << kApple.fruitType << endl;
	**********************************************************************/
}
/*
Static keyword can be used on variables as well as fields of the class. 
Static also means singleton and shared variable. 
Memory is allocated once and only once during the execution of the program. 
Memory of the static variables will be created in the static storage class. 
A static variable inside a class should be initialized explicitly by the user using the class name and scope resolution operator outside the class, else it gives a linker error. The declaration should be global and should be the first statement in the cpp file. 
A static function can be created inside the class using static and can be invoked using the classname::Functionname.
Like any other data type, even objects of a class can be created as static. Their lifetime will be till the App terminates. 
Static member functions are allowed to access the static data members or other static member functions, they cannot access the non static data members and non-static member functions.
*/