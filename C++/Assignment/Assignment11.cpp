#include<iostream>
using namespace std;
int factorial(int fact)
{
	if (fact <= 1)
		return 1;
	else
		return fact * factorial(fact - 1);
}
void main()
{
	int n;
	cout << "Enter number to find factorial:";
	cin >> n;
	cout << "Factorial of " << n << " is:" << factorial(n);
}