#include<iostream>
using namespace std;
double simpleintrest(double p, double r, double t)
{
	return(p * r * t / 100.0);
}

void main()
{
	double p, r, t;
	cout << "enter the principal amount:" << endl;
	cin >> p;
	cout << "enter the rate of intrest :" << endl;
	cin >> r;
	cout << "enter the time(in years):" << endl;
	cin >> t;
	cout << "Interest:" << simpleintrest(p, r, t);
}