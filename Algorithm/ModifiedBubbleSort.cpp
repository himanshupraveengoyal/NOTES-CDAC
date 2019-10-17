#include<iostream>
using namespace std;
int a[8];
void GetElements()
{
	for (int i = 0;i < 8;i++)
	{
		cout << "Enter the " << i + 1 << " Element:";
		cin >> a[i];
	}
}
void SortList()
{
	int temp, count = 0, swap = 0;
	for (int i = 0;i < 8;i++)
	{
		for (int j = 0;j < 7-i;j++)
		{
			count++;
			if (a[j] > a[j + 1])
			{
				++swap;
				temp = a[j];
				a[j] = a[j + 1];
				a[j + 1] = temp;
			}
		}
	}
	cout << "Total Iterations:" << count << endl;
	cout << "Total Swaps:" << swap << endl;
}
void DisplayElements()
{
	for (int i = 0;i < 8;i++)
	{
		cout << a[i] << "  ";
	}
}
void main()
{
	char ch;
	do
	{
		GetElements();
		SortList();
		DisplayElements();
		cout << "\n Enter Y to run again:";
		cin >> ch;
	} while (ch == 'Y' || ch == 'y');
}