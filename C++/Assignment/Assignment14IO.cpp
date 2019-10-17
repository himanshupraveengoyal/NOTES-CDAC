#include<iostream>
#include<string>
#include<fstream>
#include<ostream>
using namespace std;
int c = 0;
void RecieveData()
{
	ifstream ist;
	string filename = "Story.txt";
	ist.open(filename);
	string line;
	while (getline(ist, line))
	{
		if (line[0] != 'A' && line[0] != 'a')
			c++;
	}
}

int main()
{
	RecieveData();
	cout << "Number of Lines Not Starting with A:" << c;
}