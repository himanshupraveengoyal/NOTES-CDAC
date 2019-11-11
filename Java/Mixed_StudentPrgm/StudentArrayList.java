package Mixed_StudentPrgm;

import java.util.ArrayList;

interface IStudent
{
	void AddNewStudent(Student s);
	void UpdateStudent(Student s) throws Exception;
	void DeleteStudent(int sid) throws Exception;
	ArrayList<Student> GetAllStudents();
	ArrayList<Student> FindStudent(int sid);
}
public class StudentArrayList implements IStudent
{
	ArrayList<Student> studentDetails=new ArrayList<Student>();
	@Override
	public void AddNewStudent(Student s) {
		studentDetails.add(s);
	}

	@Override
	public void UpdateStudent(Student s) throws Exception {
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
		if(flag==false)
			throw new Exception("Student Not Found");
		
	}

	@Override
	public void DeleteStudent(int sid) throws Exception {
		boolean flag=false;
		for(int i=0;i<studentDetails.size();i++)
		{
			if(studentDetails.get(i).getId()==sid)
			{
				studentDetails.remove(i);
				flag=true;
			}
		}
		if(flag==false)
			throw new Exception("Student Not Found");
	}

	@Override
	public ArrayList<Student> GetAllStudents() {
		return studentDetails;
	}

	@Override
	public ArrayList<Student> FindStudent(int sid) {
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
