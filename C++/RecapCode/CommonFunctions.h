#pragma once
#include<iostream>
#include<string>
using namespace std;
//Header file is required if U have a common set of functions that will be used across the Application....
void print(string msg) {
	cout << msg << endl;
}

string getString(string question) {
	print(question);
	string answer;
	cin >> answer;
	return answer;
}

int getNumber(string question) {
	print(question);
	int no = 0;
	cin >> no;
	return no;
}