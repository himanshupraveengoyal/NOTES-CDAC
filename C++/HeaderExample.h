#include <iostream>
#include<string>
using namespace std;
void TestFunc(){
	cout<<"Test Func"<<endl;
}

class Fruit{
	string name;
	
	public:
		void setName(string name){
			this->name = name;
		}
		
		string getName(){
			return name;
		}
};

class Basket{
	private:
		Fruit fruits[10];
	public:
		void AddFruit(Fruit f){
			for(int i=0; i < 10; i++){
				if(fruits[i].getName() == ""){
					fruits[i].setName(f.getName());
					break;
				}else continue;
			}
		}
		
		void DeleteFruit(string name){
			
		}
		
		Fruit FindFruit(string name){
			  	for(int i=0; i < 10; i++){
				if(fruits[i].getName()== name){
					return fruits[i];
				}else continue;
			}
		}
		
		Fruit* GetAllItems(){
			return fruits;
		}
};


