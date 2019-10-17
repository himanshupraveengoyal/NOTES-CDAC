#include<iostream>
using namespace std;
string Reverse(string str)
{
	int len = str.length();
	for (int i = 0; i < len / 2; i++)
	{
		char temp;
		temp = str[i];
		str[i] = str[len - i - 1];
		str[len - i - 1]=temp;
	}
	return str;
}
void main()
{
	string inp,out;
	cout << "Enter The String:";
	cin >> inp;
	out = Reverse(inp);
	cout << "Reversed String:"<<out;
}







