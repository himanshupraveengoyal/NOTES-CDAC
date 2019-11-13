package Mixed_Patient_Prgm;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class PatientFileIO implements FunctionSpecificing
{
	ArrayList<Patient> pDetails=new ArrayList<Patient>();
	
	private void LoadRecords()
	{
		try 
		{
			pDetails.clear();
			FileReader reader=new FileReader("Patient.csv");
			BufferedReader breader=new BufferedReader(reader);
			String line="";
			while((line=breader.readLine())!=null)
			{
				String [] words=line.split(",");
				Patient p=new Patient(Integer.parseInt(words[0]),words[1],words[2],words[3],Double.parseDouble(words[4]));
				pDetails.add(p);
			}
			breader.close();
		} catch (NumberFormatException e) 
		{
			e.printStackTrace();
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	@Override
	public void AddNewPatient(Patient p) 
	{
		try 
		{
			FileWriter writer=new FileWriter("Patient.csv",true);
			writer.write(p.toString()+"\n");
			writer.close();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		
	}

	@Override
	public void UpdatePatient(Patient p) 
	{
		boolean flag=false;
		LoadRecords();
		for(int i=0;i<pDetails.size();i++)
		{
			if(pDetails.get(i).getId()==p.getId())
			{
				pDetails.remove(i);
				pDetails.add(i,p);
				flag=true;
			}
		}
		if(flag==true)
		{
			try 
			{
				new FileWriter("Patient.csv").close();
				for(Patient pat:pDetails)
					AddNewPatient(pat);
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
	}

	@Override
	public void DeletePatient(int id) 
	{
		boolean flag=false;
		LoadRecords();
		for(int i=0;i<pDetails.size();i++)
		{
			if(pDetails.get(i).getId()==id)
			{
				pDetails.remove(i);
				flag=true;
			}
		}
		if(flag==true)
		{
			try 
			{
				new FileWriter("Patient.csv",false).close();
				for(Patient pat:pDetails)
					AddNewPatient(pat);
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}		
		}
	}

	@Override
	public ArrayList<Patient> GetAllPatients() {
		LoadRecords();
		return pDetails;
	}

	@Override
	public ArrayList<Patient> FindPatient(int id) 
	{
		LoadRecords();
		ArrayList<Patient> temp=new ArrayList<Patient>();
		for(Patient search:pDetails)
		{
			if(search.getId()==id)
				temp.add(search);
		}
		return temp;
	}
}