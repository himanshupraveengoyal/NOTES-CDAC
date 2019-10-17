#include"CommonFunctions.h"
//Copy constructors are used to create a new object as a copy of the existing object. The object is created using an implicit code logic that cpp provides  called as COPY CONSTRUCTOR. The syntax uses the referneceof the object as arg to the constructor. The copy constructor copies all the values of the members from an existing object to the new object as member by member cloning.  
//By Default C++ creates a default Copy constructor even if U dont create one.  
class Details {
public:
	string address;
	string city;

	Details(string addr, string city)
	{
		address = addr;
		this->city = city;
	}
};

class Employee {
private:
	int id;
	string strName;
	
public:
	Details* pDetails;

	Employee(int id, string name, Details* p)
	{
		this->id = id;
		strName = name;
		pDetails = p;
		cout << "Employee is created\n";
	}

	//Copy constructor is similar to any other constructor except its parametr will always be the reference of the object that U wish to copy....U need to create athe Copy constructor if U have any dynamic objects or pointer objects to be copied which the default copy constructor only copies the address of the object, not the values of the object....
	Employee(Employee &copy)
	{
		id = copy.id;
		strName = copy.strName;
		pDetails = new Details(copy.pDetails->address, copy.pDetails->city);
		cout << "Copy constructor invoked\n";
	}
	void ShowApple() {
		cout << "The ID data is " << id << endl;
		cout << "The Name data is " << strName << endl;
		cout << "The Address data is " << pDetails->address << endl;
		cout << "The City data is " << pDetails->city << endl;
	}
};
//Global function not associated with any class.....
void ShowDetails(Employee emp) {
	emp.ShowApple();
}

void main() {
	Employee emp(13, "MainGuy", new Details("RR Nagar", "Bangalore"));
	//Employee temp(emp);//Copy Constructor....
	//temp.ShowApple();
	//emp.ShowApple();
	//temp.pDetails->address = "Jayanagar";
	//cout << "--------After modifying-------------------\n";
	//temp.ShowApple();
	//emp.ShowApple();

	ShowDetails(emp);
}
