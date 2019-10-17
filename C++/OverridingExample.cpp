#include"CommonFunctions.h"
#include "OverridingExample.h"

class TestClass {
public:
	void TestFunc() {
		cout << "Test Func from the base class" << endl;
	}

	virtual void VirtualFunc() {
		cout << "Virtual Func implemented in the base class" << endl;
	}
};

class DerivedClass : public TestClass {
public:
	void VirtualFunc() {
		//When virtual functions are overriden in the derived class, U should maintain the same signature of the base class version of the function. This includes the name, parameters, order of the parameters of the function and the return type of the function.
		cout<<"Virtual Func implemented in the derived class" << endl;
	}
	void TestFunc() {
		cout << "Test Func from the derived class" << endl;
	}
	void ExampleFunc() {
		cout << "Example Func from the derived class" << endl;
	}
};

class Person {
public:
	virtual void Speak() {
		cout << "Person is speaking" << endl;
	}
};


class Engineer : public Person {
private:
	string skillSet;
	//All the members of the Person are available to Engineer also....
public:
	void Skill(string skill) {
		skillSet = skill;
		cout << "The Engineer's skillset is " << skillSet << endl;
	}
	//Overriding need not be always modifying , it might also include extending the function....
	void Speak() {
		if (skillSet != "") {
			cout << "The Engineer speaks about " << skillSet << endl;
		}
		else {
			Person::Speak();//calling the base class version 
		}
	}
};


void simpleExample()
{
	TestClass* pCls = new TestClass();
	pCls->TestFunc();
	pCls->VirtualFunc();

	pCls = new DerivedClass;
	pCls->TestFunc();
	pCls->VirtualFunc();//This is runtime polymorphism where the object will behave in different(poly) ways based on the object to which its instantiated. In this example, the baseclass object will invoke the base class version if its instantiated to the base class and will call the derived class version if its instantiated to the derived class. 

	//In this case, the derived class could be typecasted and then used. Forcefull conversion from one type to another is called as type casting.  
	((DerivedClass*)pCls)->ExampleFunc();
	((DerivedClass*)pCls)->TestFunc();
}

Person* createPerson(string whatType) {
	if (whatType == "Engineer")
	{
		string skill = getString("Please enter UR Skill");
		Person* p =  new Engineer();
		((Engineer*)p)->Skill(skill);
		return p;
	}
	else
		return new Person();
}


void personExample() {
	//Person* p = new Person();
	//p->Speak();

	////Runtime polymorphism...
	//p = new Engineer();
	string answer = getString("What kind of Person U want to be");
	Person* p = createPerson(answer);
	p->Speak();
	
//	p->Speak();((Engineer*)p)->Skill("Computer Science");
	//If the object is instantiated to the derived, then U could use the object and type cast it to call the methods of the derived...
	

}

//When a base class object is instantiated to a derived class, any new methods of the derived class  will unavailable to the base class object. This is called as OBJECT SLICING. 
//If the method of the base class is reimplemented in the derived class, then the base class must give the permission to be reimplemented in the derived class. This is given in the form of a modifier called virtual. Non virtual methods if implemented in the derived class will not be able to call the method thro Runtime polymorphism....
void main() {

	//simpleExample();
	personExample();

}
/*
NOTES:
The Base class object when instantiated to derived class, will be able access only the members of the base and if the methods are overriden will be able to access the derived versions. 
If the non virtual methods of the base class are implemented in the derived class it is not method overiding and the methods will behave like any new method of the derived class. 
New methods of the derived class will be inaccesible to the base class object, so U must use type casting to access the derived class specific methods. 
*/
