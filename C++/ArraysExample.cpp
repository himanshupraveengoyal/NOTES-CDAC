//Arrays in C++.
/*
Any identifier can hold only one value at any given point of time.
If U want to store multiple values U should create that many no of variables.
For large such variables of the same type, it is hard to maintain that many no.
So we could create a group of variables of the same type and represent each with
the name and a [subscript] operator is done thro Arrays.
Arrays are fixed in size and are optimized as they hold contiginous memory when its
declared. The size of the array is decided before the array is created.
*/

#include<iostream>
#include<cstring>
#include<string>
#include"CommonFunctions.h"//Custom Header files are included using "" <> is
//used for std header files like iostream, string and many more like that,
using namespace std;

void firstExample(){
	double elements[5];
	for(int i =0; i < 5;i++) {
		elements[i] = getValue("Enter the value:");
	}//Using for loop to set values thro a loop for a fixed no of times.
	
	print("All the values are set....");
	//Displaying the values on Console....
	for(int i =0; i < 5; i++){
		cout<<elements[i]<<endl;
	}
}
//Multi dimensional arrays are created to store pairs of values or multiple pairs within
//the code...
void secondExample(){
	int array2D[3][4];
	for(int i =0; i < 3; i++){
		for(int j = 0; j < 4; j++){
			array2D[i][j] = i+j;
		}
	}
	
	cout<<"Displaying the array in matrix format..."<<endl;
	for(int i =0; i < 3; i++){
		for(int j = 0; j < 4; j++){
			cout << array2D[i][j] << " ";
		}
		cout<<"\n";
	}
}

void charArrayExample(){
	char strContent[100];
	strContent[0] = 'A';
	strContent[1] = 'P';
	strContent[2] = 'P';
	strContent[3] = 'L';
	strContent[4] = 'E';

	strcat(strContent, " Keeps the Doctor away");
	//Looks like String. A string is nothing but array of charecters.
	print(strContent);
}

void stringBasedExample(){
	string msg = "Welcome to C++ Programming";
	msg += "\nThis will work like any string based APIs";
	cout<<msg<<endl;
	//string is a part of the C++ Std library to provide modren String based operations
	//like concatination, formating, without usage of array concept.

}
int main(){
	//firstExample();
	//secondExample();
	//charArrayExample();
	//stringBasedExample();
}

/*
POINT: If a set of functions have to be used across multiple files within a
project, U could group those functions inside a header file(Text file with an
extension .h and include them inside UR CPP file using #include directive
#include is more like an instruction to the processor to include(inject) the
file physically into the Cpp file before the processing begins.
*/










