class StudentDatabase{
	private:
		Student students[100];//create an array of 100 students...
	public:
		void AddNewStudent(Student s){
			for(int i=0; i < 100;i++){
				if(students[i].getName() == ""){
					students[i].SetDetails(s.getId(), s.getName(), s.getAddress(), s.getContact());
					return;
				}else continue;
			}
			throw "No Student could be added as all seats are filled";
		}
		
		void UpdateDetails(Student s){
			for(int i=0; i < 100;i++){
				if(students[i].getId() == s.getId()){
					students[i].SetDetails(s.getId(), s.getName(), s.getAddress(), s.getContact());
					return;
				}else continue;
			}
			throw "ID mismatch as no student is found";
		}
		
		Student FindStudent(int id){
		   for(int i =0; i < 100; i++){
		   	if(students[i].getId() == id){
		   		return students[i];
			   }
		   }
		   cout<<"No Student found by that ID"<<endl;
		}
		
		void DeleteStudent(int id){
		   for(int i =0; i < 100; i++){
		   	if(students[i].getId() == id){
		   		return;
			   }
		   }
		   cout<<"No Student found by that ID to delete"<<endl;
		}
		
		Student* GetAllStudents(){
			return students;
		}
};

//Repository is a class that contain data on which U could perform the CRUD
//operations. This includes create, read, update and delete. In this case, the
//array of students is private data on which operations like insert, delete, update
//and find are conducted.












