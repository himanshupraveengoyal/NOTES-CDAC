package Mixed_StudentPrgm;

import java.util.ArrayList;

import Day3.MyConsole;

public class StudentUI {

//	static IStudent collections=new StudentArrayList();
//	static IStudent collections=new StudentFileIO();
	static IStudent collections=new StudentDB();
	public static void main(String[] args) 
	{
		try 
		{
			boolean run=true;
			do 
			{
				int choice=MyConsole.GetInt(Menu());
				if(choice<=5 && choice!=0)
					ProcessMenu(choice);
				else
					run=false;
			}
			while(run!=false);
			
		} 
		catch (Exception e) 
		{
			MyConsole.ErrPrint(e.getMessage());
		}
	}

	
	private static void ProcessMenu(int choice) throws Exception 
	{
		switch(choice)
		{
			case 1:
				AddStudent();
				break;
			case 2:
				UpdateStudent();
				break;
			case 3:
				DeleteStudent();
				break;
			case 4:
				FindStudent();
				break;
			case 5:
				GetAllStudents();
				break;
			default:
				break;
		}
	}


	private static String Menu() 
	{
		String menu="PRESS 1-------------------->ADD STUDENT \n";
		menu+="PRESS 2-------------------->UPDATE STUDENT \n";
		menu+="PRESS 3-------------------->REMOVE STUDENT \n";
		menu+="PRESS 4-------------------->FIND STUDENT \n";
		menu+="PRESS 5-------------------->DISPLAY ALL STUDENT \n";
		menu+="ENTER YOUR CHOICE ANY OTHER WILL BE CONSIDERED AS EXIT";
		return menu;
	}


	private static void GetAllStudents() 
	{
		ArrayList<Student> studDetail=collections.GetAllStudents();
		for(Student stud:studDetail)
			MyConsole.Print("Id:"+stud.getId()+"\t Name:"+stud.getSname()+"\t Fathers Name:"+stud.getFname()+"\t Phone Number:"+stud.getPhoneno());
	}

	private static void FindStudent() 
	{
		int sid=MyConsole.GetInt("Enter the Id:");
		ArrayList<Student> studDetail=collections.FindStudent(sid);
		for(Student stud:studDetail)
			MyConsole.Print("Id:"+stud.getId()+"\t Name:"+stud.getSname()+"\t Fathers Name:"+stud.getFname()+"\t Phone Number:"+stud.getPhoneno());
	}

	private static void DeleteStudent() throws Exception 
	{
		int id=MyConsole.GetInt("Enter the Id:");
		collections.DeleteStudent(id);
	}
	private static void AddStudent() 
	{
		int id=MyConsole.GetInt("Enter the Id:");
		String sname=MyConsole.GetString("Enter the Student Name:");
		String fname=MyConsole.GetString("Enter the Students Father Name:");
		String phno=MyConsole.GetString("Enter the Students Father Mobile Number:");
		Student student=new Student(id, sname, fname, phno);
		collections.AddNewStudent(student);
	}
	private static void UpdateStudent() throws Exception 
	{
		int id=MyConsole.GetInt("Enter the Id:");
		String sname=MyConsole.GetString("Enter the Student Name:");
		String fname=MyConsole.GetString("Enter the Students Father Name:");
		String phno=MyConsole.GetString("Enter the Students Father Mobile Number:");
		Student student=new Student(id, sname, fname, phno);
		collections.UpdateStudent(student);
	}
	

}
