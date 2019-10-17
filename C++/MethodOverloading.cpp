#include"CommonFunctions.h"
//A feature in OOP where 2 or more methods of a class can have the same name but different parameters in terms of either the no or the order. The Call of the function is determined by the parameters passed to the function. As the type of the function is is to be called is determined at the time of compilation itself, its called as Compile Time ppolymorphism. 
//If U have a function that has to work on various types of parameters, U could create different functions with the same name(as their logical intention is the same) varying in their parameters. 
//NOTE: Varying only in the return type of the function is called as a Method Overloading. 

/*****************Method overloading in Cpp*****************************
void print(int no) {
	cout << no << endl;
}

void print(char* str){
	cout << str << endl;
}
*********************Method Overloading in Class**********************/
class Customer {
private:
	int id;
	string name;
	double billAmount;
public:
	Customer(): id(0), name(""), billAmount(0)
	{

	}
	Customer(int id, string name, double amount) : Customer()
	{
		this->id = id;
		this->name = name;
		billAmount = amount;
	}
	friend class Customerdb;
	friend void display(Customer &cst);
};
//This function is designed to display the Customer details...
void display(Customer &cst) {
	cout << "The Name: " << cst.name << endl;
	cout << "The Bill: " << cst.billAmount << endl;
	cout << "The ID: " << cst.id << endl;
}
class Customerdb {
private:
	Customer* db = new Customer[10];

public:
	//adding feature only with customer
	void modify(Customer cst) {
		for (int i = 0; i < 10; i++)
		{
			if (db[i].name == "") {
				db[i].name = cst.name;
				db[i].id = cst.id;
				db[i].billAmount = cst.billAmount;
				return;//exits the function there by returning to the calling function.
			}
		}
		throw "No more Customer details to be added";
	}
	//updating feature only with id and customer
	void modify(int id, Customer cst) {
		for (int i = 0; i < 10; i++)
		{
			if (db[i].id == id) {//id is not modifiable..
				db[i].name = cst.name;
				db[i].billAmount = cst.billAmount;
				return;//exits the function there by returning to the calling function.
			}
		}
		throw "No Customer found to update";
	}
	//remove the customer based on id....
	void modify(int id) {
		for (int i = 0; i < 10; i++) {
			if (db[i].id == id) {
				db[i].name = "";
				db[i].id = 0;
				db[i].billAmount = 0.0;
				return;
			}
		}
		throw "Customer not found to delete";
	}

	Customer* FindCustomer(string name) {
		Customer* pArray = new Customer[10];
		int index = 0;
		for (int i = 0; i < 10; i++)
		{
			if (db[i].name == name) {
				pArray[index] = db[i];
				index++;
			}
		}
		return pArray;
	}

	Customer FindCustomer(int id) {
		for (int i = 0; i < 10; i++)
		{
			if (db[i].id == id)
				return db[i];
		}
		throw "No Customer found matching the ID";
	}
};


void firstExample() {
	//print("Apple123");
	//print(123);
	//print(123.234245);//int will be printed: conversion from 'double' to 'int', possible loss of data...
}
Customer createCustomer() {
	int id = getNumber("Enter the ID");
	string name = getString("Enter the Name");
	double amount = getNumber("Enter the BillAmount");
	Customer* cst = new Customer(id, name, amount);
	return *cst;
}

Customer updateCustomer() {
	string name = getString("Enter the Name to update");
	double amount = getNumber("Enter the BillAmount to update");
	Customer cst(0, name, amount);
	return cst;

}
void main() {
	//firstExample();
	Customerdb mart;
	RETRY:
	try {
		mart.modify(createCustomer());
		/*mart.modify(createCustomer());
		mart.modify(createCustomer());
		mart.modify(createCustomer());*/
		///////////////////////////////////////////////
		mart.modify(getNumber("Enter the Customer to update"), updateCustomer());
		/////////////////////////////////////////////////
		mart.modify(getNumber("Enter the ID of the customer to delete"));
		/////////////////////////////////////////////////
		Customer cst = mart.FindCustomer(getNumber("Enter the ID of customer to find"));
		display(cst);
		//////////////////////////////////////////////////
		Customer* selected = mart.FindCustomer(getString("Enter the name of the Customer to find"));
		for (int i = 0; i < 10; i++) {
			display(selected[i]);
		}
	}
	catch (const char* msg) {
		cout << msg << endl;
		goto RETRY;
	}
}

