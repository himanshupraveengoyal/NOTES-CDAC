#include<iostream>
using namespace std;
void Check(int a, int b)
{
	if (a ^ b)
	{
		cout << "Numbers are not same" << endl;
	}
	else
	{
		cout << "Numbers are same" << endl;
	}
}
void main()
{
	int a, b;
	cout << "Enter two numbers:";
	cin >> a >> b;
	Check(a, b);
}