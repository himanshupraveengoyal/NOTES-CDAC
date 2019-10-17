#include<iostream>
#include<string>
#include<fstream>
#include<ostream>
using namespace std;
void InsertData(int ticketno, string vehicle, string timeentry);
int GetTicketNumber() 
{
	int count = 1;
	ifstream ifs;
	string filename = "ParkingData.csv";
	ifs.open(filename, ios::app);
	string line;
	while (getline(ifs, line))
		++count;
	return count;
}
void GetData()
{
	int ticketno = GetTicketNumber();
	string vehno, timeofentry;
	cout << "Enter Vehicle Number:";
	cin >> vehno;
	cout << "Enter Entry Time:";
	cin >> timeofentry;
	InsertData(ticketno, vehno, timeofentry);
	void InsertData(int ticketno, string vehicle, string timeentry);
	cout << "ENTRY DONE TICKET-ID:"<<ticketno<<endl;
}
void InsertData(int ticketno,string vehicle,string timeentry)
{
	ofstream ofs;
	string filename = "ParkingData.csv";
	ofs.open(filename, ios::app);
	ofs << ticketno << "," << vehicle << "," << timeentry<<"\n";
}
void RetrieveData(int tickno)
{
	ifstream ifs;
	string filename = "ParkingData.csv";
	ifs.open(filename, ios::app);
	string vehino,time,tno;
	while (ifs)
	{
		getline(ifs,tno,',');
		getline(ifs, vehino, ',');
		getline(ifs, time, '\n');
		int ticketno = std::atoi(tno.c_str());
		if (ticketno == tickno)
		{
			cout << "Vehicle Number:" << vehino<<endl;
			cout << "Entry Time:" << time<<endl;
		}
	}
}
string OptionsAvail()
{
	string menu;
	menu += "Welcome To Eternity Mall Parking Lot\n";
	menu += "Enter 1 to Add Vehicle\n";
	menu += "Enter 2 to Find Vehicle\n";
	menu += "Enter 3 to Exit\n";
	menu += "Whats Your Choice:";
	return menu;
}
int main()
{
	int userinp, ticketnum;
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
			cout << "Enter Ticket Number:";
			cin >> ticketnum;
			RetrieveData(ticketnum);
			break;
		case  3:
			cout << "Thanks For Visiting...!!!";
			break;
		default:
			cout << "Invalid Input";
			break;
		}
	} while (userinp!=3);
}