#include"CommonFunctions.h"
//Class is a UDT...

//SOLID
/*
Single Responsibility: Divide and Rule
Open-Closed: Classes are immutable but extendable..
Substitution: Base type object can be substituted thro derived objects
Interface Segregation: Good to create specific interfaces.
Dependeny Inversion: Good to depend on abstractions instead of concretions. 
*/
//Encapsulation: Data Hiding....
class Employee {
private:
	int id;
	string name;
	string address;//They are private and are intended to be like that...
public:
	//Accessors to read and write the data...
	void setDetails(int v1, string v2, string v3) {
		id = v1;
		name = v2;
		address = v3;
	}

	int getID() { return id; }
	string getName() { return name; }
	string getAddress() { return address; }

};

//CRUD Operations: inserting, deleteing, updating and finding.....
//When STL is taught, U will  use vector, linkedList to perform operationsin a easy manner. Arrays are fixed in Size, U use collection classes provided by STL to work with CRUD operations.

class EmpArrayDatabase {
public:
		Employee* employees;//creating the pointer of the Employee...
		int count;
public:
	EmpArrayDatabase(int size)
	{
		count = size;
		employees = new Employee[size];//Constructor...
		//employees point to the first employeein the array..
		//employees->setDetails(123, "TestName", "TestAddress");
		//employees[0].getName();
		//cout << "The name is " << employees[1].getName() << endl;
	}

	void AddNewEmployee(Employee emp) {
		//UR Array contain blank records with upto the count mentioned...
		for (int i = 0; i < count; i++)
		{
			if (employees[i].getName() == "") {
				employees[i].setDetails(emp.getID(), emp.getName(), emp.getAddress());
				return;//Jump statement to exit the function....
			}
			else continue;
		}
		throw "No more records can be inserted";
		//Find the first occurance of record which has blank name, will be place we set the details of the record...
		//exit the function if found. Else throw an Exception....
	}

	void UpdateEmployee(Employee emp) {
		//find the matching record, set the new values and finally exit
		//If no record is found, throw an Exception
		for (int i = 0; i < count; i++)
		{
			if (employees[i].getID() == emp.getID()) {
				employees[i].setDetails(emp.getID(), emp.getName(), emp.getAddress());
				return;
			}
		}
		throw "No record found to update";
	}

	void DeleteEmployee(int empID) {
		throw "Do it urself...";
	}

	Employee* Find(string name) {
		Employee* foundRecords = new Employee[count];
		int index = 0;
		for (int i = 0; i < count; i++) {
			if (employees[i].getName() == name) {
				foundRecords[index].setDetails(employees[i].getID(), employees[i].getName(), employees[i].getAddress());
				index++;
			}
			else continue;
		}
		return foundRecords;
	}

	Employee Find(int id) {
		for (int i = 0; i < count; i++) {
			if (employees[i].getID() == id) {
				return employees[i];//Single record...
			}
			else continue;
		}
		throw "No Employee found for this id";
	}
};

int main() 
{
	//////////////////////First Example/////////////////////
	/*Employee emp;
	emp.setDetails(123, "Phaniraj", "Bangalore");
	print("The name is " + emp.getName());
	print("The address is " + emp.getAddress());
	cout << "The ID is " << emp.getID() << endl;*/

	//Creating a variable of a class is called object creation....
	//Accessing the members of the class is done thro . operator...
	//U will be able to accesss only those members that U have rights to access...

	EmpArrayDatabase obj(getNumber("Enter the no of Employees"));
	try
	{
		for (int i = 0; i < 3; i++) {
			Employee emp;
			int id = getNumber("enter id");
			string name = getString("Enter name");
			string address = getString("Enter Address");
			emp.setDetails(id, name, address);
			obj.AddNewEmployee(emp);
		};
		Employee* values = obj.Find(getString("Enter the name to find"));
		for (int i = 0; i < 10; i++)
		{
			if (values[i].getName() != "")
				print(values[i].getName());
		}

	}
	catch (const char* msg)
	{
		cout << msg << endl;
	}
}