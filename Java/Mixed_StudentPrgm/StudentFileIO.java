package Mixed_StudentPrgm;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;


public class StudentFileIO implements IStudent
{
	ArrayList<Student> studentDetails=new ArrayList<Student>();
	static String filename="StudentsDetails.csv";
	public void LoadRecords()
	{
		studentDetails.clear();
		try 
		{
			FileReader reader=new FileReader(filename);
			BufferedReader breader=new BufferedReader(reader);
			String line="";
			while((line=breader.readLine())!=null)
			{
				String words[]=line.split(",");
				Student s=new Student(Integer.parseInt(words[0]),words[1],words[2],words[3]);
				studentDetails.add(s);
			}
			breader.close();
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	@Override
	public void AddNewStudent(Student s) 
	{
		try 
		{
			FileWriter writer=new FileWriter(filename,true);
			writer.write(s.toString()+"\n");
			writer.close();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		} 
	}

	@Override
	public void UpdateStudent(Student s) throws Exception 
	{
		LoadRecords();
		boolean flag=false;
		for(int i=0;i<studentDetails.size();i++)
		{
			if(studentDetails.get(i).getId()==s.getId())
			{
				studentDetails.remove(i);
				studentDetails.add(i,s);
				flag=true;
			}
		}
		if(flag==true)
		{
			new FileWriter(filename,false).close();
			for(Student stud:studentDetails)
				AddNewStudent(stud);
		}
		else
			throw new Exception("Student Not Found");
	}

	@Override
	public void DeleteStudent(int sid) throws Exception {
		LoadRecords();
		boolean flag=false;
		for(int i=0;i<studentDetails.size();i++)
		{
			if(studentDetails.get(i).getId()==sid)
			{
				studentDetails.remove(i);
				flag=true;
			}
		}
		if(flag==true)
		{
			new FileWriter(filename,false).close();
			for(Student stud:studentDetails)
				AddNewStudent(stud);
		}
		else
			throw new Exception("Student Not Found");
	}

	@Override
	public ArrayList<Student> GetAllStudents() {
		LoadRecords();
		return studentDetails;
	}

	@Override
	public ArrayList<Student> FindStudent(int sid) {
		LoadRecords();
		ArrayList<Student> temp=new ArrayList<Student>();
		for(Student stud:studentDetails)
		{
			if(stud.getId()==sid)
			{
				temp.add(stud);
			}
		}
		return temp;
	}

}
