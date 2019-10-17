#include"CommonFunctions.h"
/*
Abstract class is one that contains one or more pure virtual functions in it. Pure virtual functions dont have a body. It means that pure virtual functions do not contain any implementation. The derived class which inherits from the Abstract class will implement all the pure virtual functions of its base class. 
As the Abstract class is incomplete, the classes cannot be instantiated. They are always instantiated to their derived classes which implements all the pure virtual methods of the Abstract class. 
*/

class BaseClass {
public:
	void NormalMethod() { cout << "Normal method of the base class\n"; }
	virtual void VirtualMethod() { cout << "Virtual method of the base class\n"; }
	virtual void TestFunc() =0;//Pure virtual function in C++. They dont have a body. They are always virtual and will be assigned to 0. 
};

class DerivedClass : public BaseClass {
public:
	void TestFunc() {
		cout << "Test Func implemented in the derived class\n";
	}

	void VirtualMethod() {
		BaseClass::VirtualMethod();
		cout << "Virtual method overriden in the derived class\n";
	}

};
void main() {

	//Abstract classes cannot be instantiated, they are incomplete....
	BaseClass* ptr = new DerivedClass();
	ptr->VirtualMethod();
	//ptr->NormalMethod();
	//ptr->TestFunc();
	//ptr->VirtualMethod();
}
