package Mixed_Patient_Prgm;

import java.util.ArrayList;

interface FunctionSpecificing
{
	void AddNewPatient(Patient p);
	void UpdatePatient(Patient p);
	void DeletePatient(int id);
	ArrayList<Patient> GetAllPatients();
	ArrayList<Patient> FindPatient(int id);
}
public class PatientArrayList implements FunctionSpecificing
{
	ArrayList<Patient> patientDetails=new ArrayList<Patient>();

	@Override
	public void AddNewPatient(Patient p) 
	{
		patientDetails.add(p);
	}

	@Override
	public void UpdatePatient(Patient p) 
	{
		for(int i=0;i<patientDetails.size();i++)
		{
			if(patientDetails.get(i).getId()==p.getId())
			{
				patientDetails.remove(i);
				patientDetails.add(i,p);
			}
		}
	}

	@Override
	public void DeletePatient(int id) 
	{
		for(int i=0;i<patientDetails.size();i++)
		{
			if(patientDetails.get(i).getId()==id)
			{
				patientDetails.remove(i);
			}
		}
	}

	@Override
	public ArrayList<Patient> GetAllPatients() 
	{
		return patientDetails;
	}

	@Override
	public ArrayList<Patient> FindPatient(int id) 
	{
		ArrayList<Patient> temp=new ArrayList<Patient>();
		for(Patient search:patientDetails)
		{
			if(search.getId()==id)
				temp.add(search);
		}
		return temp;
	}
	
}
