#include<iostream>
#include<string>
#include "FirstDemo.h"
using namespace std;//Std Cpp library....
//() tells that its a function

//Let user pass 2 variables of the type int by  name called v1 and v2...
int addFunc(int v1, int v2) {
	int res = v1 + v2;
	//The value will be refered by the caller. So UR job is to simply give the value to the caller.....
	return res;
}

void TestFunc() {
	//write the statements here....
	//statements are local to the function...
	//variables created will die before U leave the function.....
	//to extract the variable data from this function, u should do so as a return of a function...
}
int main() {
	int firstNo = 123;//let there be a variable of the type int which holds 123..
	int secondNo = 34;
	int answer = addFunc(firstNo, secondNo);
	cout << "The Answer is " << answer << endl;

	//return firstExample();
	//what are  the data types of C++?
	/*
	Integral Types: byte, short, int , long...
	Floating types: float, double
	Other types:char, bool
	User Defined types: classes, structs and enums....
	Example of displaying the sizes of all data types using sizeof...
	*/
	//creating a location to store data of the type integer refered by name called value.. Data is 123, name is value which will store in a certain location called &value. 
	int value = 123;
	cout << "The value: " << value << endl;
	cout << "The value: " << value << " is stored in the location called "<<&value<< endl;
}
//Why functions?
/*
Clean programming.... 
Divide and rule...
Easy Maintainance...
*/
//What is the procedure:
/*
Declare the function
Implement the function
Call the function
Functions dont have memory....
Memory is for the variables inside the function when called directly or indirectly from the Main program...
*/
int firstExample()
{
	//Basic IO operations....
	cout << "Please what message U wish to give today?" << endl;
	string message;//creating a variable to store the input that is provided by the user from the console...
	cin >> message;
	cout << message << endl;
	return 0;//app is terminating...
}

