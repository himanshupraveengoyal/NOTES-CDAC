#include<iostream>
using namespace std;
int cqueue[4], max = 4, f = -1, r = -1;
void insert(int inp)
{
	if (f==(r+1)%max)
	{
		cout << "Queue Overflow \n";
	}
	else if (f == -1)
	{
		f++;
		r++;
		cqueue[r] = inp;
		cout << "Element Inserted:" << cqueue[r] << endl;
	}
	else
	{
		r=(r+1)%max;
		cqueue[r] = inp;
		cout << "Element Inserted:" << cqueue[r] << endl;
	}
}
void remove()
{
	if (f == -1)
		cout << "Queue Underflow \n";
	else if (f == r)
	{
		cout << "Element Removed:" << cqueue[f] << endl;
		f = -1;
		r = -1;
	}
	else
	{
		cout << "Element Removed:" << cqueue[f] << endl;
		f++;
	}
}
void display()
{
	if (f == -1)
		cout << "Queue Underflow \n";
	else
	{
		for (int i = f;i!= r;i=(i + 1) % max)
			cout<< cqueue[i] << endl;
		cout << cqueue[r] << endl;
	}

}
void main()
{
	int i, j;
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