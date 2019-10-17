#include<iostream>
#include<cstring>
using namespace std;
char firstelement, result[10][10] = {' '};
string str1, str2;
bool flag = false;
int l1, l2, loci,locj,lef,rit;
void InsertData()
{
	for (int i = 0; i < 10; i++)
	{
		for (int j = 0; j < 10; j++)
		{
			result[i][j]='*';
		}
	}
}
void GetData()
{
	cout << "Enter String to be Placed Vertically:";
	cin >> str1;
	cout << "Enter String to be Placed Horizantally:";
	cin >> str2;
	cout << "Enter the Starting Co-ordinates:";
	cin >> lef >> rit;
}
void FindElement()
{
	for (int i = 0; i < l1; i++)
	{
		if (flag == true)
			break;
		for (int j = 0; j < l2; j++)
		{
			if (str1[i] == str2[j])
			{
				firstelement = str1[i];
				loci = i; 
				locj = j;
				flag = true;
			}
			if (flag == true)
				break;
		}
	}
	cout << "Matching Element:" << firstelement << " Found At:" << loci<<endl;
}
void Display()
{
	for (int i = 0; i < 10; i++)
	{
		for (int j = 0; j < 10; j++)
		{
			cout << result[i][j];
		}
		cout << "\n";
	}
}
void main()
{
	InsertData();
	GetData();
	l1 = str1.length();
	l2 = str2.length();
	FindElement();
	for (int i = 0; i < l1; i++)
	{
		result[lef+i][rit] = str1[i];
	}
	for (int i = 0; i < l2; i++)
	{
		int startleft = lef + loci;
		result[startleft][rit+i-1] = str2[i];
	}
	Display();
}