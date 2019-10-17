#include"HeaderExample.h"


Fruit createFruit(char* name){
	Fruit f;
	f.setName(name);
	return f;
}
void print(string message) {
	cout<<message<<endl;
}

double getValue(string message) {
	print(message);
	double value {};
	cin >> value;
	return value;
}

string createMenu(){
	string content ="~~~~~~~~~~~Fruit management software~~~~~~~\n";
	content+= "To Add a new Fruit------->Press 1\n";
	content+= "To update a new Fruit---->Press 2\n";
	content+= "To delete a new Fruit---->Press 3\n";
	content+= "To find a new Fruit------>Press 4\n";
	return content;
}
int main() {
	string menu = createMenu();
	do
	{
		int choice = getValue(menu);
		if(choice > 4)return 0;
		
	}while(true);
	//cout<<"ANother Example"<<endl;
	//TestFunc();
//	Fruit f;
//	f.setName("Apple");
//	cout<<f.getName()<<endl;

	Basket flipKart;
	/*
	Fruit f;
	f.setName("Apple");
	flipKart.AddFruit(f);
	
	Fruit f2;
	f2.setName("Mango");
	flipKart.AddFruit(f2);
	
	flipKart.AddFruit(createFruit("Apple"));
	flipKart.AddFruit(createFruit("Mango"));
	flipKart.AddFruit(createFruit("Orange"));
	flipKart.AddFruit(createFruit("PineApple"));
	flipKart.AddFruit(createFruit("Banana"));*/
	
	Fruit* allFruits = flipKart.GetAllItems();
	for(int i=0; i < 10;i++){
		cout<<(allFruits[i]).getName()<<endl;
	}
}
