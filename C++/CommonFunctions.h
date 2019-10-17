#pragma once
#include<string>
#include<iostream>
#include<fstream>//This is required for File IO classes....
#include<sstream>
using namespace std;


void print(string msg) {
	cout << msg << endl;
}
//Book is a class, Library another class that contain books. 
string getString(string message) {
	string answer;
	cout << message << endl;
	cin >> answer;
	return answer;
}

int getNumber(string message) {
	int answer = 0;
	cout << message << endl;
	cin >> answer;
	return answer;
}

double getDouble(string message) {
	double answer = 0.0;
	cout << message << endl;
	cin >> answer;
	return answer;
}


class employee {
public:
	int id;
	string name, address;
	double salary;
};

void print(employee emp) {
	cout << "Name:" << emp.name << endl;
	cout << "Address:" << emp.address << endl;
	cout << "Salary:" << emp.salary << endl;
	cout << "Id:" << emp.id << endl;
}