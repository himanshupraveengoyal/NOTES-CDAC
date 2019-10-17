#include<iostream>
using namespace std;
int a, b;
void Display()
{
	cout << "Value of A:" << a << endl;
	cout << "Value of B:" << b << endl;
}
void zero_small(int& a, int& b)
{
	if (a > b)
		b = 0;
	else
		a = 0;
}
void GetData()
{
	cout << "Enter the Element:";
	cin >> a;
	cout << "Enter the Element:";
	cin >> b;
	zero_small(a, b);
}
void main()
{
	GetData();
	Display();
}