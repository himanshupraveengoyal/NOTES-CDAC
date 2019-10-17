#include"CommonFunctions.h"
//First Version of the Cake..............
//class Cake {
//private:
//	int size;
//	string flavor;
//	double price;
//
//public:
//	void prepareCake(int size, string flavor, double price) {
//		this->size = size;
//		this->flavor = flavor;
//		this->price = price;
//	}
//
//	string getCakeDetails() {
//		char strContent[200];
//		sprintf(strContent, "The Cake costs %f with the flavor ", price);
//		string content;
//		content.append(strContent);
//		content += flavor;
//		return content;
//	}
//};
//

class Cake {
private:
	int size;
	string flavor;
	double price;

public:
	Cake() : size(0), flavor(""), price(50) {

	}

	Cake(int size, string flavor, double price) {
		prepareCake(size, flavor, price);
	}
	void prepareCake(int size, string flavor, double price) {
		this->size = size;
		this->flavor = flavor;
		this->price = price;
	}

	string getCakeDetails() {
		char strContent[200];
		sprintf(strContent, "The Cake costs %f with the flavor ", price);
		string content;
		content.append(strContent);
		content += flavor;
		return content;
	}
};

class Person {
	string firstName, lastName;
	int yearOfBirth;

public:
	Person() : firstName(""), lastName(""), yearOfBirth(0) {

	}

	Person(string fName, string lName, int yrs) :Person() {
		firstName = fName;
		lastName = lName;
		yearOfBirth = yrs;
	}
	~Person() {
		cout << "Person is being deleted from the memory\n";
	}//Destructors dont have parameters has they are to be invoked before an object is destroyed,so U dont need any dependencies here....
	void ShowDetails() {
		cout << "The Name is " << firstName + lastName << " who is " << yearOfBirth << " years old\n";
	}
};

class Server {
	string serverName;
public:
	Server(string serverName) {
		this->serverName = serverName;
	}
	void CallTheServerFunc() {
		cout << "SErver is doing some service thro the server " <<serverName<<endl;
	}
};

//First Version of client without constructor.......
//class Client {
//public:
//	Server* pServer;
//
//	void Function() {
//		pServer->CallTheServerFunc();
//	}
//};
//2nd version of the client...........

class Client {
public:
	Server* pServer;
	Client(Server* pServer)
	{
		this->pServer = pServer;
	}
	void Function() {
		pServer->CallTheServerFunc();
	}
};
void main() {
	/*Cake obj;
	obj.prepareCake(123, "Choclate", 600);
	cout << obj.getCakeDetails() << endl;
	*********************With Constructor*******************
	Cake chocklateCake(500, "Choclate", 600);//no need to call prepareCake....
	cout << chocklateCake.getCakeDetails() << endl;
	//using pointer object......
	Cake* cake = new Cake(400, "Venilla", 600);
	cout << cake->getCakeDetails();
	*************************Initialization List*****************
	Person p("Phani","Raj", 42);
	p.ShowDetails();
	***********************Composition Example**************************/
	Client yahoo(new Server("Apache TomCat"));
	yahoo.Function();
}
