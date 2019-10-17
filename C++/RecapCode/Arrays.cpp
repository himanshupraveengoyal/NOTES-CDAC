//#include<iostream>
//using namespace std;
#include"CommonFunctions.h"
//2 types: functions(return value) and procedures(void).
//A function should give the result. The caller of the function will decide on what to do with the result...

void createAndDisplayArray(int elements[], int size) {
	//take the inputs from the user and set the values into the array..
	//Display the elements of the array in a liniear format...
	//Use do...while to display the elements in the array...
	
}
//Array is a contigenous memory
//does not support returning array...
int* createArray(int elements[], int size) 
{
	for (int i = 0; i < size; i++)
	{
		elements[i]= getNumber("Enter the Value for the position");
	}
	print("All the inputs are provided");
	//I dont display the elements, will return it...
	return elements;
}

//Arrays are fixed in Size. The Size is determined at compile time. 
int main() {
	
	////////////////////////////////////////////////////
	const int x = 4;
	int elements[x];//size is a const or any literal value...
	////by default, elements in an array will set to their garbage value...
	//createAndDisplayArray(elements, x);//U must implement the function and display it...

	/////////////Next Example///////////////////////
	int* values = createArray(elements, x);
	int result = 0;
	for (int i = 0; i < x; i++)
	{
		result += values[i];
			 
	}
	cout << "The Sum of all the elements is " << result << endl;
}
/*Finals
What is an Array?
How to create an Array and use it
How to pass array as arg to a function
How to return array from a function...
*/