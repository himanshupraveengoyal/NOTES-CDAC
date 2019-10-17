#include<iostream>
#include<string>
#include<fstream>
#include<ostream>
#include<ctime>
using namespace std;
//int TicketNumber();
void SetData()
{
//	int ticketno = TicketNumber();
	string vehicleno,toentry,toexit;
	cout << "Enter Vehicle Number:";
//	cin >> vehicleno;

	time_t current_time;
	current_time = time(NULL);
	cout << current_time;
}
void AddData()
{
	ofstream ost;
	string filename = "Parking.csv";
	ost.open(filename, ios::app);


}
void main()
{
	SetData();
}