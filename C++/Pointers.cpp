//Pointers.cpp
#include<iostream>
using namespace std;


class TestClass{
	public:
		string testName;
};

void createTestClass(){
	TestClass cls;//Stack creation of the object....
	cls.testName = "C# Test";
	
	TestClass cl2;
	cl2.testName ="AWP Test";
	
	TestClass* pCls = new TestClass();//Heap creation using new...
	//To access the members of a class using a pointer object, U should
	//use -> operator instead of . operator.
	pCls->testName = "Cpp Test";
	
	//advantage of using the pCls...
	pCls = new TestClass();
	//creating new object every time u call the new operator
	pCls->testName ="Java Test";
	cout<<"The Test name: " <<pCls->testName;
	pCls = new TestClass();
	pCls->testName ="C# Test";
	cout<<"The Test name: " <<pCls->testName;
}

void firstExample(){
	char* apple = "A Fruit which is good for health"; //char array......
	int x = 123;//Variables hold a value that represents the data of the variable.
	int* loc;
	cout<<"The value of *loc:"<<loc<<endl;
	cout<<"The address of the x value: "<<&x<<endl;
}
//The value will be local to the function to which it is passed. This
//is called as Passby value....
void TestFunc(int value){
	value++;//3
	value = value * 2; //6
	cout<<"The result : " <<value;
}
//The function is taking the arg of the pointer, this is called a pass
//by pointer. The value associated with the address will be passed
//and any changes made to the value of the address will reflect on the
//variable that holds that value.
//No multiple copies are created in the pass by pointer. There will be only
//one variable on which all the operations are done. So no local copy
// is passed into the function. This will help in not creating un-nessasary
//copies of the data and allow it to be garbage collected. This way can
//lower the memory footprint of the program.
//Other advantages:
//Dynamic memory allocation where the objects could be created
//at runtime and there by promote many of the powerfull OOP features.
//Arrays, complex classes can be represented in a simplified manner using
//pointers. A pointer can be represented as an array. Technically functions
//that return array could be defined as * variable.

int* createArray(int size){
	int* address = new int(5);
	int* arr = new int[size];
	for(int i=0; i < size; i++){
		arr[i] = i+1;
	}
	return arr;
}
/*
POINTS:
asterisk(*) is used to declare the pointer.
ampersand(&) is used to refer an address of a variable.
asterisk(*) is also used to refer or change the value of the address.
arrow (->) is used to refer the members of a pointer object.
this is a pointer that points to the address of the current object in
//the scope of the Application.
All arithematic operators can be applied on pointers.
//Pointers pointing to the variables can be either incremented or
//decremented using any of the operators along with deferencing pointer
//variables.
*/

void pointersUsingArithematicOperators(){
	int x = 123;
	int* loc = &x;
	cout<<"The address of x: " <<*loc<<endl;
	++loc;
	cout<<"The next address is :" <<*loc<endl;
	--loc;
	cout<<"The previous address is :" <<*loc<endl;
}
void RealTestFunc(int* value){
	*value = 123;
	cout<<"The result:" <<*value<<endl;
}

//Pointers are variables that refer to an address of a memory.
int main(){
	int* example = createArray(5);
	for(int i=0; i<5;i++) cout<<example[i]<<endl;
/*	int value = 2;
	//TestFunc(value);
	cout<<"The value before passing to the func:"<<value<<endl;
	RealTestFunc(&value);
	cout<<"The value after coming out of the function: "<<value<<endl;
//	firstExample();
	/*
	int* addressOfVariable = new int(5);//U R creating a variable of
	//int* that points to the location of an integer that is created
	//dynamically using new operator.
	cout<<"The value of addressOfVariable:"<<addressOfVariable<<endl;
	cout<<"The Data of the variable: "<<*addressOfVariable<<endl;*/
	//If U want to get the value associated in that address we need to use
	//* operator to dereference the pointer and get the value associated
	//in that address.
	/*
	The pointer asterisk(*) has 2 semantic meanings:
	to declare a pointer variable(int* x)
	to access the value associatged with that pointer(*x);
	*/
	
	
}









