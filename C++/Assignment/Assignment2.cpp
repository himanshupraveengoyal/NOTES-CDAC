#include<iostream>
using namespace std;
void ShowData(string str, int i)
{
	cout << str << "  " << i << endl;
}
void ShowData(string str)
{
	cout << str << endl;
}
void main()
{
	ShowData("Subject   Marks");
	ShowData("Mathematics", 90);
	ShowData("Computer", 70);
	ShowData("Science", 67);
}