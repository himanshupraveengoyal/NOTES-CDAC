#include<iostream>
#include"CommonFunctions.h"
using namespace std;

//Inheritance is the next feature of OOP where a class(Base class) can be
//extended into another class(Subclass or Derived Class) so that the derived class
//will have the features of the base class as well the new features of itself. This
//is based on the Open-Closed principle of the OOP Designing Principles. IN this,
// a class is closed for modification but open for extension.

class BaseClass{
	public:
		void addNew(){
			cout<<"Adding new feature"<<endl;
		}
};
// A class in Cpp can be derived from 2 or more base classes. This is called as
//multiple inheritance.
class DerivedClass : /*private*/public  BaseClass{
	public:
		void deleteOld(){
			cout<<"Deleting old feature"<<endl;
		}
};
//Public inheritance makes all the members of the base class retain their access in the derived class.
//If the class is derived as private, all public members will become private to the derived class.
int main(){
	DerivedClass cls;
	cls.addNew();
	cls.deleteOld();
	//U will not only be able to access the base version but also the functions of the derived class.
};






