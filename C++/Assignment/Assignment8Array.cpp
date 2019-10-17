#include<iostream>
using namespace std;
int main()
{
	int size;
	cout << "How many elements to be added:";
	cin >> size;
	float a[size];
	float sum = 0.0;
	for (int i = 0; i < size; i++)
	{
		cout << "Enter the "<<i+1<<" Element:";
		cin >> a[i];
		sum += a[i];
	}
	cout << "Sum:" << sum << endl;
	cout << "Average:" << sum / size << endl;

}
