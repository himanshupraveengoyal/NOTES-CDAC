#include<iostream>
using namespace std;

//U cannot modify the function of the base class in the derived class unless the
//base class gives the permission in the form of virtual. methods that are virtual
//can only be modified in the derived class.
class BaseClass{
	public:
		int x;
		virtual void TestFunc(){
			cout<<"Testing on the base version"<<endl;
		}
};//Classes are immutable....

class DerivedClass : public BaseClass{
	public:
        void TestFunc(){
			cout<<"Testing on the newer version"<<endl;
		}
};

BaseClass* createObject(string type){
	if(type =="base")
	   return new BaseClass();
    else
    	return new DerivedClass();
}

int main(){
	BaseClass temp;
	temp.TestFunc();
	//In C++ U could create objects either in the stack or in the heap. If U want
	//to create the object at runtime, we could do so by creating it in the heap.
	//We use new operator with pointers to create objects in the heap.
	BaseClass* pClass;//asking to create a variable to hold the
	//the location of the object when its created....
	pClass = new BaseClass();
	pClass->TestFunc();
	
	//delete pClass;//After the object is used.....
	
	//When U create an object of a class in the heap, the memory is allocated at
	//runtime(when the program executes) and its reference will be stored in the
	//object.
	//U dont need another object, U will use the same variable as the object is
	//only the reference...
	//pClass = new DerivedClass();//U get a new reference with the same object...
	//pClass->TestFunc();
	//Same object behaves in a different way, this is called as POLYMORPHISM...
	pClass = createObject("base");
	pClass->TestFunc();
	
	
}
