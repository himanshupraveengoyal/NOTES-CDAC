
//*(create and dereference(get the data located in that address)) and & that is used to get the address of an existing variable...
#include"CommonFunctions.h"
void print(int* loc) {
	cout << "The Value of Loc is " << loc << endl;
	cout << "The Data of the Loc is " << *loc << endl;
}
int main() 
{
//	int apple = 123;//a location is created that can hold data(123) of the specified type and refered by a name called apple...
	//cout << "Value:"<< apple <<"\nLocation: "<<&apple<< endl;

	/*int* addressOfFruit = &apple;
	cout << "The Address of apple:" << &apple << endl;
	cout << "The Value of addressOfFruit: " << addressOfFruit << endl;*/
	do
	{
		//Memory is allocated in the heap and the value will point to that memory that holds the data of 345. I dont wish to know  the name of the variable....
		int* value = new int(345);//creating the variable at the time of creating the pointer itself....
		int no = getNumber("Enter a number");
		print(&no);
	} while (true);
}