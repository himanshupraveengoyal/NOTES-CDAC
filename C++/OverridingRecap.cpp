#include"CommonFunctions.h"
//First use class Class.....................
//class TestClass {
//public:
//	void TestFunc() {
//		cout << "Test Func from the base class" << endl;
//	}
//};

//First use case..................................
//class DerivedClass : public TestClass {
//public:
//	void ExampleFunc() {
//		cout << "Example Func from the derived class" << endl;
//	}
//};


class TestClass {
public:
	void TestFunc() {
		cout << "Test Func from the base class" << endl;
	}
	virtual void VirtualFunc() {
		cout << "Virtual Func implemented in the base class" << endl;
	}
};
//2nd Use case......................................
//class DerivedClass : public TestClass {
//public:
//	void ExampleFunc() {
//		cout << "Example Func from the derived class" << endl;
//	}
//	//Non virtual function implemented in the derived class.......
//	void TestFunc() {
//		cout << "Test Func from the Derived class" << endl;
//	}
//};

//3rd use case.................
class DerivedClass : public TestClass {
public:
	void ExampleFunc() {
		cout << "Example Func from the derived class" << endl;
	}
	//Non virtual function implemented in the derived class.......
	void TestFunc() {
		cout << "Test Func from the Derived class" << endl;
	}
	//virtual function is overriden here.....
	virtual void VirtualFunc() {
		cout << "Virtual Func reimplemented in the Derived class" << endl;
	}
};

int main() {
/**********************Slicing***************************************************
	TestClass* pCls = new TestClass();
	pCls->TestFunc();

	pCls = new DerivedClass();
	pCls->TestFunc();//U dont get the Example Func...
************************How to get the other func?**********************************
	TestClass* pCls = new TestClass();
	pCls->TestFunc();

	pCls = new DerivedClass();
	pCls->TestFunc();//Will call the base version......
	//To call the other methods U must typecast
	((DerivedClass*)pCls)->ExampleFunc();
	((DerivedClass*)pCls)->TestFunc();
*************************Virtual Functions*******************************
	TestClass* pCls = new TestClass();
	pCls->VirtualFunc();

	pCls = new DerivedClass;
	pCls->VirtualFunc();
***********************************************/

}