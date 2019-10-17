#include"CommonFunctions.h"
/*
Files in Cpp are mainly done with fstream, ifstream, ofstream under fstream.h file. Include the fstream.h file before U perform any IO related operations. 
ofstream: used to write on Files
ifstream: read from the files. 
fstream: Performs both read and write from/to files. 

Any File IO operation must have the following activities:
pass the filename in the constructor at the time of object creation.
using the open method perform the operations
finally close the stream object.
*/

void readFromFile() {
	ifstream fIn;//Class to read the text based files.....
	//string filename = "FileIO.cpp";//Filename to read...
	string filename = "SampleText.txt";//Filename to read...
	string line = "";//string to store each line
	fIn.open(filename);//Open the file to read....
	while (fIn) {//while the file has not reached the end of stream...
		getline(fIn, line);//read each line and store it into line variable
		cout << line << endl;//display the line....
	}
	fIn.close();//Finally close the file before U exit the function...
}

void writeToFile() {
	string filename = "SampleText.txt";
	ofstream fOs;
	string line = "";
	fOs.open(filename, ios::app);//For appending the existing file...
	while (fOs) {
		getline(cin, line);//read the input provided by the user into the line...
		if (line == "-1") {
			break;
		}
		fOs << line << endl;
	}
	fOs.close();
}

void writeToCsvFile() {
	ofstream fOs;
	string filename = "Data.csv";
	bool tryAgain = true;
	fOs.open(filename, ios::app);
	do {
		int id = getNumber("Enter the ID of the employee");
		string name = getString("Enter the Name");
		string address = getString("Enter the Address");
		double salary = getDouble("Enter the salary");		
		fOs << id << "," << name << "," << address << "," << salary << "\n";
		string option = getString("Press N for New Entry else any other key");
		tryAgain = option == "N" ? true : false;
	} while (tryAgain);
	fOs.close();
}

void readingCsvFile() {
	employee* list = new employee[100];
	//This example will read all the data of the CSV File and store it into an array of objects of the type Employee...
	ifstream fIn;
	string filename = "Data.csv";
	fIn.open(filename);
	string line;
	int index = 0;
	while (fIn) {
		getline(fIn, line);
		stringstream s(line);
		string word;
		int i = 0;
		employee e;
		while (getline(s, word, ',')) {
			if(i == 0)
			e.id = stoi(word);
			if (i == 1)
				e.name = word;
			if (i == 2)
				e.address = word;
			if (i == 3)
				e.salary = stoi(word);
			i++;
		}
		list[index] = e;
		/*char* chrLine = const_cast<char*>(line.c_str());
		char* splits = strtok(chrLine, ",");
		employee emp;
		emp.id = splits[0];
		emp.name = splits[2];
		list[index] = emp;*/
		index++;
	}
	fIn.close();
	for (int i = 0; i < 100; i++) {
		if (list[i].name != "") {
			print(list[i]);
		}
	}
}
void main() {
	//writeToFile();
	//readFromFile();
	//writeToCsvFile();
	readingCsvFile();
}
