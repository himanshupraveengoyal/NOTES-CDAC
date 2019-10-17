#include<iostream>
using namespace std;
int queue[10], max = 10,r = -1;
void insert(int inp)
{
	if (r == max - 1)
		cout << "Array Full \n";
	else
	{
		r++;
		queue[r] = inp;
		cout << "Element Inserted:" << inp << endl;
	}
}

void display()
{
	if (r == -1)
		cout << "Array Empty";
	else
	{
		for (int i = 0; i <= r; i++)
			cout << queue[i] << endl;
	}
}
void main()
{
	int i, j;
	do
	{
		cout << "Enter 1 to Add an Element\n  Enter 2 to Display Elements\n  ";
		cout << "Enter 3 to Exit\n Whats Your Choice:";
		cin >> i;
		switch (i)
		{
		case 1:
			cout << "Enter the number:";
			cin >> j;
			insert(j);
			break;
		case 2:
			display();
			break;
		case 3:
			
			break;
		default:
			cout << "Input Mismatched Try Again...!!!\n";
		}
	} while (i != 3);
}