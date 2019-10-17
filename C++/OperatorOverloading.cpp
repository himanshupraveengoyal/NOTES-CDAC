//In CPP, we could use the operators of the language to suit our requirements. This way of changing the behavior of the operators to meet our requirement is called as operator overloading. Certain operators cannot be overloaded like this, new which have a sp meaning to the C++ Runtime.. 

#include"CommonFunctions.h"
class Bill {
private:
	int no;
	double amount;
public:
	Bill() : no(0), amount(0){}
	Bill(int no, double amount) { this->amount = amount; this->no = no; }

	//We will overload the + operator...
	Bill operator + (double amount) {
		this->amount += amount;
		return *this;
	}

	Bill operator += (double amount) {
		this->amount += amount;
		return *this;
	}

	void displayBill() { cout << "The Bill Amount: " << this->amount << endl; }
};
void main() {
	Bill bill(1, 4000);
	//Problem: I wish to add an amount to the bill, not possible with the traditional operator....
	bill += 200;
	bill += 3400;
	bill.displayBill();
}

