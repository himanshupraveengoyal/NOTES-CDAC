#include<iostream>
using namespace std;
void printtable(int a)
{
	cout << "Here is the table of:" << a << endl;
	for (int i = 1;i <= 10;i++)
		cout << a << "*" << i << "=" << a * i<<endl;
}
void main()
{
	char inp;
	do
	{
		int i, j;
		cout << "Enter the starting table:";
		cin >> i;
		cout << "Enter the ending table:";
		cin >> j;
		if (j > i)
		{
			for (int k = i;k <= j;k++)
			{
				printtable(k);
			}
		}
		else if (i == j)
			printtable(i);
		else
		{
			for (int k = i;k >= j;k--)
			{
				printtable(k);
			}
		}
		cout << "Enter Y to run again:";
		cin >> inp;
	} while (inp=='Y'|| inp == 'y');
}