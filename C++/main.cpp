#include <iostream>
using namespace std;
void displayTypeInfo(){
	cout<<"The Size of char is " <<sizeof(char)<<endl;
	cout<<"The Size of short is " <<sizeof(short)<<endl;
	cout<<"The Size of int is " <<sizeof(int)<<endl;
	cout<<"The Size of long is " <<sizeof(long)<<endl;
	cout<<"The Size of float is " <<sizeof(float)<<endl;
	cout<<"The Size of double is " <<sizeof(double)<<endl;
	cout<<"The Size of wchar_t is " <<sizeof(wchar_t)<<endl;

}

//A function is one block of statements represented by an identifier which is
//intended to be used very frequently there by reducing the time in implementing
//it again and again.
//If the function expects any dependencies, it should be passed as arg. An arg
//is something the user wishes to pass into the function so that the function
//behaves as per the requirment. Usually args will be the inputs on which
//UR function depends upon.


void print(char* message){
	cout<<message<<endl;
}

double getValue(char* message){
	print(message);
	double value{};
	cin >> value;
	return value;
}

char getChar(char* message){
	print(message);
	char op;
	cin >> op;
	return op;
}

double addFunc(double v1, double v2){
	return v1 + v2;
}

double subFunc(double v1, double v2){
	return v1 - v2;
}

double mulFunc(double v1, double v2){
	return v1 * v2;
}
double process(double v1, double v2, char op){
	double rsValue{};
	switch(op){
		case '+':
			rsValue = addFunc(v1, v2);
			break;
		case '-':
			rsValue = subFunc(v1, v2);
			break;
		default:
			rsValue = mulFunc(v1, v2);
			break;
	}
}
int main() {
	//displayTypeInfo();
	double firstValue, secondValue, rsValue; //store numbers
	char operand, choice;//sign of the operation that we need to perform.
	print("Welcome to Calc Program");

	do{
		firstValue = getValue("Enter the First Value");
		secondValue = getValue("Enter the second Value");
		operand = getChar("Enter the operand as + - X or /");
		rsValue = process(firstValue, secondValue, operand);
		cout<<"The result of this operation: "<<rsValue<<endl;
		choice = getChar("Press * for new Operation");
	}while(choice == '*');
}
/*Data types: In C++, data types can be categorised as primitive, 
 user defined types(union, struct, enum, classes) and pointer types.
Primitive: 
Intergral(int, short, long)
Floating(float, double): Single and double 
Charecter(char)
Other types: bool(true or false)
Valueless(void)
Wide Charecter(OS based). For longer size charecter like non-English 
language charecters like chinese, far-eastern languages and 
middle-eastern languages.
A single line can contain multiple variable declarations of the same type.
U could also have modifiers to the data types: extended featurs: signed, 
unsigned, Short, Long which enhances the size of the data type,
Refer the C++ documentation for the different sizes of the data types. 
short: 16 bit value: -32768 to 32768
int: 32 bit value: -2,147,483,648 to 2,147,483,648 
long: 64 bit value: 
unsigned modifier is used to store only positive numbers starting with 0
Most of the time, developer use int without modifiers to store the data.
use an operator called sizeof to know the size of the data type in the \
form of bytes.
*/

/*
functions are designed on the principle of Seperation of concerns.
Each function is designed to perform only one task, if it contains
multiple tasks, it should be further seperated into sub functions
and then use them.
Dependencies of the function has to be provided as arguements
(parameters) to the function, each arg is declared with a datatype
 followed by identifier and , seperating each of the parameters.
Anything that is used within the function is limited to itself. This
is called as scope of the variable.
If any of the computed values that is generated within the function
has to be given back to the caller, it will be given in the form
of return type of the function. A function can have only one return type.

To make a decision based execution, we use switch statement. switch takes an
arg of the integral type or char as the choice on which the decision has to
take place. Each decision is defined by a case block.
However, U could have a default block which is be invoked if any of the other
cases wont fit in.
Each case block is exited with a break. break is a jump statement.

To repeat a section of code innumerable no of times, U could use do..while
loop. In this case, the loop is intented to execute atleast once and repeated
later on choice which is defined by the while block. the while block always
evaluates to a boolean expression. true means continue the loop and false
means exit the loop.
*/






