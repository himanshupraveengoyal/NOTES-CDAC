#include"CommonFunctions.h"
//What is an Exception? An abnormal situatuib where the app fails to execute further due to anomalies in the program that might not make the app execute in a clean manner. Exceptions can be either raised by the System or by the Application itself. Exceptions like out of memory, access denied, null reference, File Not found are raised by the System. Applications can also throw exceptions based on the logical mis-management by the user of the Application like passing an invalid id as an arg....
//C++ provides 3 keywords to work with Exceptions: try, catch and throw. 
//try: represents a block of code that could raise an Exception. 
//catch: represents the block of code that has to be executed when that kind of exception occurs. catch takes an arg of the type of exception thrown. 
//throw: is used to raise an Exception within ur program.
//Error codes: 1 : Error1, 2: Error2, 3: Error3
#include<cstring>
const string deleteError = "Not a valid id to delete";
const string updateError = "Not a valid id to Update";
const string selectError = "Not a valid id to Find";
const string insertError = "OOPS! Something wrong happened!!!!";
void testFunc() {
	
	string answer = getString("What do U want to do today?");
	if (answer != "Work")
		throw "Const error message";//const char* 
	cout << "Right Answer!!!!\n";
}

void main() {
	try {
		testFunc();
	}
	catch (const char* error) {
		cout << "Error: " << error << endl;
	}
	catch (int errCode) {
		if (errCode == 1) {
			cerr << deleteError;
		}
		else if (errCode == 2)
			cerr << "Something really wrong happened, will come back to U\n";
		else
			cerr << "Something wrong always happens, will not come back to U\n";
	}
	catch (...) {
		cerr << "We only dont know why it happened.....\n";
	}
	//System related exceptions are classes derived from exception class of Std C++ library. However U could create UR own Custom Exception by creating a class derived from exception class. 
}

