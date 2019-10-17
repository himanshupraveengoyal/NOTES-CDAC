#include<iostream>
using namespace std;
double convert(double temp)
{
	return ((temp-32.0)*5.0/9.0);
}
void main()
{
	double tem;
	cout << "enter the temperature( in farenheit) :" << endl;
	cin >> tem;
	cout << "Temperature in Celcius:" << convert(tem);
}