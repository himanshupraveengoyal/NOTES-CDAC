#include"CommonFunctions.h"
//If U want to inject some dependencies to the object for its usage at the time of object creation, then OOP supports a function called Constructor. A Constructor is a function that has the same name of the class with no return type(Not even void). However it could take args based on the dependencies that U want to inject while the object is being created. 
//Constructor with no args is called as Default Constuctor. When constructors are having args they are called as parameterized constructor and the constructors are said to be overloaded. 
//When the object is being created, based on the args passed, that version of the constructor will be invoked. Constructors provide the flexibility in creating the objects. 
//Initialization List in C++: Its a feature in C++ where we can initialize the fields of the class before the constructor is called. All the fields of the class in C++ will have garbage values. To provide initialization of the data we use initialization list. Initialization list is called even before the constructor is invoked. 
//Destructors are sp functions that are invoked when the object is explicitly deleted from the memory using delete operator. objects created in the stack will delete the object automatically, but the ones created in the heap needs an explicit deletion using delete operator. It is similar to the constructor but prefixed with a ~.  
//PS: C++ 11 has automatic memory management using Garbage collector. 

class Person {
private:
	string firstName, lastName;
	int yearOfBirth;
public:
	Person(): firstName(""), lastName(""), yearOfBirth(0)
	{
		//This is called Initialization list.....
	}
	
	~Person() {
		cout << "Person is being deleted from the memory\n";
	}//Destructors dont have parameters has they are to be invoked before an object is destroyed,so U dont need any dependencies here.....


	//Constructors are not used for intializing the fields, it is rather used for setting the dependencies for the object creation so that U could use the object successfully. 
	Person(string fName, string lName, int yrs) :Person() {
		firstName = fName;
		lastName = lName;
		yearOfBirth = yrs;
	}
	//The practical usage of a constructor comes when U have compostion of objects. HAS A Relation is called as Composition. Every Car has a Radio. Every Car is not a Radio. Inheritance is 'IS-A' Relation and Composition is 'HAS-A' relation. If a Radio has to be set at the time of Car creation, we inject the radio into the Car before its used fully. 
};
//Contains the details of Maping, Sterios, GPS tracking and others...
class Infotainment {
public:
	string deviceName;
	double cost;
	//Its good to have a default constructor which would be used to intialize the values and parameterized to set the values....
	Infotainment() :deviceName(""), cost(0) {

	}
	Infotainment(string device, double price) : Infotainment()
	{
		deviceName = device;
		cost = price;
	}
	void Start() {
		print("Infotainment by name " + deviceName + " is playing");
	}
};

class Vehicle {
public:
	string regNo;
	int yearOfReg;

	Vehicle() : regNo("KA05 TMP1234"), yearOfReg(2019) {

	}
	Vehicle(string no, int year) :Vehicle()
	{
		regNo = no;
		yearOfReg = year;
	}

	void DisplayDetails() {
		cout << "Car is registered in the year of " << yearOfReg << "\nIts Reg no is " << regNo << endl;
	}
};
//Car will have a place where we can install the Infotainment....
class Car : public Vehicle{
private:
	Infotainment* pDevice;
public:
	Car() {
		::Vehicle("AP-4 EQ 4355", 2018);
		pDevice = new Infotainment();
		pDevice->deviceName = "Philips";
		pDevice->cost = 5000;
	}

	Car(Infotainment* device, string regNo, int yr): Vehicle(regNo, yr)
	{
		pDevice = device;
	}

	void Start() {
		cout << "Car has started to run\n";
		pDevice->Start();
	}
};
class Cake {
private:
	int size;
	string flavor;
	double price;

public:
	
	Cake()
	{
		cout << "Default cake is prepared" << endl;
	}

	Cake(int size, string flavor, double price) {
		prepareCake(size, flavor, price);
	}
	void prepareCake(int size, string flavor, double price) {
		this->size = size;
		this->flavor = flavor;
		this->price = price;
	}

	string getCakeDetails(){
		char strContent[200];
		sprintf(strContent, "The Cake costs %f with the flavor ", price);
		string content;
		content.append(strContent);
		content += flavor;
		return content;
	}
};

void main() {
	//Cake ck;//Default cake and then set the flavors and other things...
	//ck.prepareCake(400, "Choclate", 560);
	//cout<<ck.getCakeDetails()<<endl;
	//Cake chocklateCake(500, "Choclate", 600);
	//cout << chocklateCake.getCakeDetails() << endl;

	/*Cake* cake = new Cake(400, "Venilla", 600);
	cout<<cake->getCakeDetails();*/

	Car c(new Infotainment("Harman", 17000), "KA05 MG1033", 2014);//default constructor..
	c.Start();
	c.DisplayDetails();
}
/*
POINTS:
Constructor has the same name as the class with no return type and can be overloaded. 
Initialization List is used to intialize the fields of the class. 
U could call one constructor from another using initialization List. Initialization list will be called before the constructor is invoked. 
Constructors without parameters are called default constructors. Other kind is called parameterized constructor. 
If there is an inheritance of classes involved, the base class's default constructor will be invoked as a part of the initialization list. However if U wish to call the specific paramterized constructor of the base class, U could use the :: operator with the class name to invoke the constructor. 

*/
