package Mixed_Patient_Prgm;

import java.util.ArrayList;

import Day3.MyConsole;

public class PatientUI 
{
//	static FunctionSpecificing collections=new PatientArrayList();
	static FunctionSpecificing collections=new PatientDB();
	public static void main(String[] args) 
	{
		boolean flag=true;
		do
		{
			int choice=MyConsole.GetInt(ReadFile.ReadDocument());
			if(choice<=5)
			{
				ProcessMenu(choice);
			}
			
		}
		while(flag==true);
	}
	
	private static void ProcessMenu(int choice) 
	{
		switch(choice)
		{
			case 1:
				AddPatient();
				break;
			case 2:
				UpdatePatient();
				break;
			case 3:
				DeletePatient();
				break;
			case 4:
				FindPatient();
				break;
			case 5:
				GetAllPatient();
				break;
			default:
				break;
		}
	}

	/*private static String Menu() 
	{
		String menu="PRESS 1-------------------->ADD PATIENT \n";
		menu+="PRESS 2-------------------->UPDATE PATIENT \n";
		menu+="PRESS 3-------------------->REMOVE PATIENT \n";
		menu+="PRESS 4-------------------->FIND PATIENT \n";
		menu+="PRESS 5-------------------->DISPLAY ALL PATIENT \n";
		menu+="ENTER YOUR CHOICE ANY OTHER WILL BE CONSIDERED AS EXIT";
		return menu;
	}*/
	private static void GetAllPatient() 
	{
		ArrayList<Patient> patdetails=collections.GetAllPatients();
		for(Patient patient:patdetails)
			MyConsole.Print(patient);
	}
	private static void FindPatient() 
	{
		int id=MyConsole.GetInt("Enter the Id:");
		ArrayList<Patient> patdetails=collections.FindPatient(id);
		for(Patient patient:patdetails)
			MyConsole.Print(patient);
	}
	private static void DeletePatient() 
	{
		int id=MyConsole.GetInt("Enter the Id:");
		collections.DeletePatient(id);
	}
	private static void UpdatePatient() 
	{
		int id=MyConsole.GetInt("Enter the Id:");
		String pname=MyConsole.GetString("Enter the Patient Name:");
		String dname=MyConsole.GetString("Enter the Doctor Name:");
		String phno=MyConsole.GetString("Enter the Phone Number:");
		Double bill=MyConsole.GetDouble("Enter the Amount:");
		Patient p=new Patient(id,pname,dname,phno,bill);
		collections.UpdatePatient(p);
	}
	private static void AddPatient() 
	{
		int id=MyConsole.GetInt("Enter the Id:");
		String pname=MyConsole.GetString("Enter the Patient Name:");
		String dname=MyConsole.GetString("Enter the Doctor Name:");
		String phno=MyConsole.GetString("Enter the Phone Number:");
		Double bill=MyConsole.GetDouble("Enter the Amount:");
		Patient p=new Patient(id,pname,dname,phno,bill);
		collections.AddNewPatient(p);
	}
}