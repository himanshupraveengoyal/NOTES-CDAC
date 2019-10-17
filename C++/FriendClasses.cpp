#include"CommonFunctions.h"
//A Friend class is similar to Friend Function which can access private members of another class in which it is declared as friend...An Eg will be a scenario where it would be usefull to allow a perticular class to access the private members of other class. A LinkedList Class is allowed to access the private members of the Node Class which is a a part of the LinkedList class but Node being a seperate class. 
class Fruit {
private:
	string name;
	double price;
public:
	Fruit() {}
	Fruit(string name, double price)
	{
		this->name = name;
		this->price = price;
	}
	friend class Basket;
};

class Basket {
private:
	Fruit* items = new Fruit[10];
public:
	void addFruit(int index, string name, double cost) {
		items[index].name = name;
		items[index].price = cost;
	}

	void displayFruit(int index) {
		if (items[index].name != "") {
			cout << "The Fruit Name: " << items[index].name << endl;
			cout << "The Price of the Fruit: " << items[index].price << endl;
		}
	}
};
void main() {
	Basket* pBasket = new Basket;
	pBasket->addFruit(0, "Apple", 240);
	pBasket->addFruit(1, "Mango", 140);
	pBasket->addFruit(2, "Orange", 40);
	pBasket->addFruit(3, "PineApple", 60);

	for (int i = 0; i < 10; i++)
	{
		pBasket->displayFruit(i);
	}
}
