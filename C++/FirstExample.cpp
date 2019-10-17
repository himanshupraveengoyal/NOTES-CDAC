//All Files in C++ is developed under text files saved with an extension .cpp.

//main is the entry point of UR Program. If U dont write an Entry point, the compiler will not give any error but UR Linker will provide a LINKER ERROR. 
//For performing IO Operations within ur file, U must include a CPP library called iostream. Its a part of the std C++ libraries that deals with basic IO.
//Since C++03, all libraries are shared as std files grouped under namespace called std. Namespace is a conceptual grouping of classes. std is the namespace under which all the std C++ library APIs are developed. So the new C++ compilers expect to include the library not the header file. However U should also write a statement called 'using namespace std' as all the library classes and functions are within that namespace.   

#include<iostream>
using namespace std;
void main() {
	cout << "C++ Training Program"<<endl;//Every statement is terminated with a ;
	cout << "----------------------------------\n";
	cout << "Developed By:" << "Phaniraj\n";
	cout << "Developed On: 21st Aug 2019\n";
	cout << "Description: This is a demo example on cout variable which is used to display text on the Console's Output screen\n";
	//To build the App: Ctrl+Shift+B.
	//To Execute the App: Ctrl+F5;
}
/*Points:
cout is a variable used to represent output on the Console. 
endl is a variable used to end the line on the Console. Alternatively U could use the \n of the C Charecter system to move to the next line..
cout always sends the data that U want to display as charecter. Hense the name charecter output.(cout) charecter also includes numbers.  
main is the entry point and when main returns, Application will terminate.
*/