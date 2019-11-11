package Mixed_StudentPrgm;public class Student 
{
	private int id;
	private String sname;
	private String fname;
	private String phoneno;
	
	Student(int id,String sname,String fname,String phoneno)
	{
		this.id=id;
		this.sname=sname;
		this.fname=fname;
		this.phoneno=phoneno;
	}

	public int getId() {
		return id;
	}

	public String getSname() {
		return sname;
	}

	public String getFname() {
		return fname;
	}

	public String getPhoneno() {
		return phoneno;
	}

	@Override
	public String toString() {
		return String.format("%d,%s,%s,%s", id,sname,fname,phoneno);
	}
	
	
	
}
