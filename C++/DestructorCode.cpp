#include"CommonFunctions.h"

class TestClass {
public:
	TestClass()
	{
		cout << "Test class is created\n";
	}

	~TestClass() {
		cout << "Test Class is destroyed\n";
	}
};
void main() {
	TestClass* pCls = new TestClass();//call the constructor
	delete pCls;//call Destructor...

	TestClass cls;//objects created in the stack will implicitly call the destructors once the object goes out of scope....
	//If the object is created using new operator, U must release the memory using delete operator wrt that object.
	//Destructors follow the reverse hirarchy of calling the destructors of its base classes. 
}
