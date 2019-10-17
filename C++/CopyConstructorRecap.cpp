#include"CommonFunctions.h"

class Test {
public:
	string name;
	Test(string name)
	{
		this->name = name;
	}
};

//Class with another class...
class Student {
public:
	string name;
	Test* hisTest;

	Student(string name, Test* whichTest)
	{
		this->name = name;
		this->hisTest = whichTest;
	}

	//Create a custom copy constructor....
	Student(Student &s) {
		name = s.name;
		hisTest = new Test(s.hisTest->name);
	}
};
void main() {
	/////////////////////Example of Default copy constructor/////////////////////
	//Test t;
	//t.name = "Cpp Exam";

	//Test t2(t);//Creating a new object which replicates t....
	//cout << t.name << " and " << t2.name << endl;
	//t2.name = "C# Exam";
	//cout << t.name << " and " << t2.name << endl;
	//////////////Fault in the default copy constructor//////////////////////
	
	Student s1("Phaniraj", new Test("C# Test"));

	Student s2(s1);
	s2.hisTest->name ="Java Test";
	s2.name = "Banu Prakash";

	cout << s1.hisTest->name << " and " << s2.hisTest->name << endl;


}
