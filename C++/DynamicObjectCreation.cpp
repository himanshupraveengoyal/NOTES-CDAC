//DynamicObjectCreation.cpp

#include"CommonFunctions.h"

class employee{
	private:
		int id;
		string name;
		string address;

	public:
		void setDetails(int id, string name, string address){
			this->id = id;
			this->address = address;
			this->name = name;
		}

		string getName() {
			return name;
		}

		string getAddress() {
			return address ;
		}

		int getID() {
			return id;
		}
};
/////global variables/////////////////////
employee* allemployees;
int size;
//////////////////////////////////////////
//This function is created to initialize the global variables of the
//program.....
void Initialize(){
	size = getInteger("Enter the No Of Employees");
	allemployees = new employee[size];
}

//create an employee object...
string getMenu(){
	string menu = "~~~~~~~~~~~~~~~~EMPLOYEE MONITORING SYSTEM~~~~~~~\n";
	menu+= "TO ADD NEW EMPLOYEE-------->PRESS 1\n";
	menu+= "TO UPDATE EMPLOYEE--------->PRESS 2\n";
	menu+= "TO DELETE EMPLOYEE--------->PRESS 3\n";
	menu+= "TO DISPLAY ALL------------->PRESS 4\n";
	menu+= "PS: ANY OTHER KEY IS CONSIDERED AS EXIT................";
	return menu;

}



void addNewEmployee(employee emp){
	for(int i=0; i < size; i++){
		if(allemployees[i].getName() == ""){
			allemployees[i].setDetails(emp.getID(), emp.getName(), emp.getAddress());
			return;
		}
	}
}

void updateEmployee(employee emp){
  cout<<"Will be implemented by U..."<<endl;
}

void deleteEmployee(int id){
   for(int i=0; i< size;i++){
   	if(allemployees[i].getID()== id){
   		allemployees[i].setDetails(0, "", "");
   		return;
	   }
   }
}

void displayAllEmployees(){
	 /*for(employee emp : allemployees){
	 	if(emp.getName()!= "")
  			cout<<"The Name is " <<emp.getName();
	 }*/
	 for(int i = 0; i < size;i++){
	 	if(allemployees[i].getName()!= "")
		   {
		   	string msg = "The Details:\nThe Name is " + allemployees[i].getName() + " from " + allemployees[i].getAddress();
		   	cout<<msg<<endl;
		   }
	 }

}

void creatingEmployee(){
	//create an employee object...
	employee emp;
	int id = getInteger("Enter the ID");
	string name = getString("Enter the Name");
	string address = getString("Enter the Address");
	emp.setDetails(id, name, address);
	addNewEmployee(emp);
	print("Employee added successfully to the database");
	//pass this emp object into the addNewEMployee that is created.
}

void deletingEmployee(){
	int empId = getInteger("Enter the ID of the Employee to delete");
	deleteEmployee(empId);
	print("Employee deleted sucessfully from the database");
}
bool processMenu(int choice){
	switch(choice){
		case 1:
			 creatingEmployee();
			 return true;
		case 2:
			return true;
		case 3:
			deletingEmployee();
			return true;
		case 4:
			displayAllEmployees();
			return true;
		default:
			return false;
	}
}


int main(){
	string menu = getMenu();//get the menu structure...
	Initialize();
	bool processing = true;
	do{
		int choice = getInteger(menu);
		processing = processMenu(choice);
	}while(processing);
	//employee employees[100];//creating 100 objects in the stack...
//	employee* allEmployees = new employee[100];


}
