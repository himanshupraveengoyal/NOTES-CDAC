#include<iostream>
#include<fstream>
#include<ostream>
using namespace std;

void WriteData()
{
	ofstream ost;
	string filename = "Out.txt";
	ost.open(filename);
	ost << "Time is a great teacher but unfortunately it kills all its pupils. Berlioz" << "\n";
	ost.close();
}

void main()
{
	WriteData();
}