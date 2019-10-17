#include<iostream>
using namespace std;
int stack[10], top = -1, max = 4;
void insert(int k)
{
	if (top == max - 1)
	{
		cout << "Stack Overflow\n";
	}
	else
	{
		top++;
		stack[top] = k;
		cout << "Element Added:" << k << endl;
	}
}
void display()
{
	if (top == -1)
		cout << "Stack is Empty\n";
	else
	{
		for (int i = top;i >= 0;i--)
			cout << stack[i]<<endl;
	}
}
void remove()
{
	if (top == -1)
		cout << "Stack is Empty\n";
	else
	{
		cout << "Element Removed:"<<stack[top]<<"\n";
		top--;
	}
}
void main()
{
	int i,j;
	do {
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
	} while (i!=4);

}