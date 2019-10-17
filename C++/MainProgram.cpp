#include"CommonFunctions.h"
#include"Classes.h"
#include"Repository.h"

void firstExample(){
	Student s;
	s.SetDetails(123, "Phaniraj","Bangalore", 45646546);
	cout<<s.getDetails()<<endl;
}
//This is a function designed to create Student object and return it....
Student createStudent(int id, string name,string address, long phone){
	Student s;
	s.SetDetails(id, name, address, phone);
	return s;
}

void secondExample(){
	Student s = createStudent(123, "Phaniraj","Bangalore",345667);
	cout<<s.getDetails()<<endl;
}

void repositoryExample(){
	StudentDatabase db;
	try{
		db.AddNewStudent(createStudent(123, "Phaniraj","Bangalore", 234245));
		cout<<"Student added to database"<<endl;
		db.AddNewStudent(createStudent(124, "Gopal","Pune", 234245));
		cout<<"Student added to database"<<endl;
		db.AddNewStudent(createStudent(125, "Mahesh","Mysore", 234245));
		cout<<"Student added to database"<<endl;
		
		int id = getValue("Enter the ID to search");
		Student found = db.FindStudent(id);
		cout<<found.getDetails()<<endl;


	}catch(char* ex){
		cout<<ex<<endl;
	}
/*

	Student* allStudents = db.GetAllStudents();
	for(int i=0; i < 3; i++){
		cout<<(allStudents[i]).getName()<<endl;
	}*/
}
int main(){
//	firstExample();
//	secondExample();
	repositoryExample();
}


