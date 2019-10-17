#include<iostream>
using namespace std;
int a[8], f;
void GetElements()
{
	for (int i = 0; i < 8; i++)
	{
		cout << "Enter the " << i + 1 << " Element:";
		cin >> a[i];
	}
	cout << "What Number To Find:";
	cin >> f;
}
void SortList()
{
	int temp, count = 0, swap = 0;
	for (int i = 0; i < 8; i++)
	{
		for (int j = 0; j < 7 - i; j++)
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
	for (int i = 0; i < 8; i++)
	{
		cout << a[i] << "  ";
	}
}

void FindElementUsingBinarySorting(int k)
{
	int start = 0, top = 7, middle = 0;
	while (top > start)
	{
		middle = (top + start) / 2;
		//		cout<<"Going Iterations"<<middle<<endl;
		if (k > a[middle])
		{
			start = middle + 1;
		}
		else
		{
			top = middle;
		}
	}
	if (a[start] == k)
	{
		cout << "Number found at:" << start + 1;
	}
	else
	{
		cout << "Number Not found";
	}

}
int main()
{
	GetElements();
	SortList();
	cout << "Sorted Array\n";
	DisplayElements();
	FindElementUsingBinarySorting(f);
}