#include<iostream>
using namespace std;
int a[5];
void GetData()
{
	for (int i = 0; i < 5; i++)
	{
		cout << "Enter the Elemenmt:";
		cin >> a[i];
	}
}
void zero_small(int& a, int& b)
{
	a = 0;
	b = 0;
}
void Display()
{
	for (int i = 0; i < 5; i++)
		cout << a[i]<<endl;
}
void Sorting()
{
	int temp;
	for (int i = 0; i < 5; i++)
	{
		for (int j = 0; j < 4; j++)
		{
			if (a[j] > a[j + 1])
			{
				temp = a[j];
				a[j] = a[j + 1];
				a[j + 1] = temp;
			}
		}
	}
	zero_small(a[0], a[1]);
}

void main()
{
	GetData();
	Sorting();
	Display();
}