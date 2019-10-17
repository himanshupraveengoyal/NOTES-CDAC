#include<iostream>
using namespace std;
void main() {
	//cin is the variable used for taking inputs from the user from the Console window. charecter input will take the >> operator to allow inputs to be stored in variables which are later displayed into the output screen. 
	cout << "Enter a number\n";
	int x{};//New syntax of C++ that makes the variable initialize to 0...
	cin >> x; //Use this variable to set value from the user into the x. 
	cout << "The value: " << x;
}

//Tip: Use the toolbox to store small code snippets which are to be reused quite frequently. Its not advised to write heavy code in Toolbox.
/*POINTS:
cin is the part of the std C++ library that reads the input entered by the user on the console using >> operator(Extraction). The input must always be stored into a variable to be used and then later display it as an output.
<< and >> operators tell the direction where the data is moving.
Remember that cout and cin variables should always be on the left side of the statements and the operators << and >> determine the direction of the data flow... 
Its good to initialize the variables before use. Some compilers however generate a garbage value for all the variables, new compilers built on C++11 expect the variables to be initialized before use. It could be done either by assigning a value or using {} to set the value.
Any data that has to be stored for a brief period has to be placed in a location identified as variable. variables are used to store the data of specific type. The type of the data U want to store determines the variable type. This is called as Datatype in the computer world.  

*/