#include<iostream>
using namespace std;
int queue[10], max = 4, f = -1, r = -1;
void insert(int inp)
{
	if (r == max - 1)
		cout << "Queue Overflow \n";
	if (r == -1)
	{
		f++;
		r++;
		queue[r] = inp;
		cout << "Element Inserted:" << inp<<endl;
	}
	else
	{
		r++;
		queue[r] = inp;
		cout << "Element Inserted:" << inp << endl;
	}
}
void remove()
{
	if (f == -1)
		cout << "Queue Underflow \n";
	else if (f == r)
	{
		cout << "Element Removed"<<queue[f]<<endl;
		f = -1;
		r = -1;
	}
	else
	{
		cout << "Element Removed" << queue[f] << endl;
		f++;
	}
}
void display()
{
	if (f == -1)
		cout << "underflow\n";
	else
	{
		for (int i = f;i <= r;i++)
			cout << queue[i] << endl;
	}
}
void main()
{
	int i,j;
	do
	{
		cout << "Enter 1 to Add an Element\n Enter 2 to Remove an Element\n Enter 3 to Display Elements\n  ";
		cout << "Enter 4 to Exit\n Whats Your Choice:";
		cin >> i;
		switch (i)
		{
		case 1:
			cout << "Enter the number:";
			cin >> j;
			insert(j);
			break;
		case 2:
			remove();
			break;
		case 3:
			display();
			break;
		default:
			cout << "Input Mismatched Try Again...!!!\n";
		}
	} while (i != 4);
}