#include<iostream>
#include<string>
#include<fstream>
#include<ostream>
using namespace std;
void InsertData(int eno, string ename, string emob);
int GetEmployeeNumber()
{
	int count = 1;
	ifstream ifs;
	string filename = "EmployeeData.csv";
	ifs.open(filename, ios::app);
	string line;
	while (getline(ifs, line))
		++count;
	return count;
}
void GetData()
{
	int eno = GetEmployeeNumber();
	string ename, emob;
	cout << "Enter Employee Name:";
	cin >> ename;
	cout << "Enter Employee Mobile Number:";
	cin >> emob;
	InsertData(eno, ename, emob);
	cout << "ENTRY DONE EMPLOYEE-ID:" << eno << endl;
}
void InsertData(int eno, string ename, string emob)
{
	ofstream ofs;
	string filename = "EmployeeData.csv";
	ofs.open(filename, ios::app);
	ofs << eno << "," << ename<< "," << emob << "\n";
}

string OptionsAvail()
{
	string menu;
	menu += "Welcome To Tata Consultancy Services Employee Records\n";
	menu += "Enter 1 to Add Employee\n";
	menu += "Enter 2 to Display Employee\n";
	menu += "Enter 3 to Delete Employee\n";
	menu += "Enter 4 to Exit\n";
	menu += "Whats Your Choice:";
	return menu;
}

void RetrieveData(int ena)
{
	ifstream ifs;
	string filename = "EmployeeData.csv";
	ifs.open(filename, ios::app);
	string ename, emobi, eno;
	while (ifs)
	{
		getline(ifs, eno, ',');
		getline(ifs, ename, ',');
		getline(ifs, emobi, '\n');
		int enumber = std::atoi(eno.c_str());
		if (enumber == ena)
		{
			cout << "Employee Name:" << ename << endl;
			cout << "Employee Mobile Number:" << emobi << endl;
		}
	}
}

void DeleteData(const char* filename,int enumber)
{
	string tempfilename = "Temp.csv";
	ifstream is(filename);
	ofstream ofs;
	ofs.open(tempfilename, ios::app);
	char c;
	int line_no = 1;
	while (is.get(c))
	{
		if (c == '\n')
			line_no++;
		if (line_no != enumber)
			ofs << c;
	}
	ofs.close();
	is.close();
	remove(filename);
	rename("Temp.csv", filename);
	cout << "Employee Removed"<<endl;
	
}


void main()
{
	int userinp, enumb;
	do
	{
		cout << OptionsAvail();
		cin >> userinp;
		switch (userinp)
		{
		case 1:
			GetData();
			break;
		case 2:
			cout << "Enter Employeee Id:";
			cin >> enumb;
			RetrieveData(enumb);
			
			break;
		case 3:
			cout << "Enter Empolyee Id:";
			cin >> enumb;
			DeleteData("EmployeeData.csv",enumb);

			break;
		case  4:
			cout << "Thanks For Visiting...!!!";
			break;
		default:
			cout << "Invalid Input";
			break;
		}
	} while (userinp != 4);
}