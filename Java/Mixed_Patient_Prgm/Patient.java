package Mixed_Patient_Prgm;

public class Patient 
{

	private int id;
	private String pname;
	private String dname;
	private String phno;
	private double bill;
	
	Patient(int id,String pname,String dname,String phno,double bill)
	{
		this.id=id;
		this.pname=pname;
		this.dname=dname;
		this.phno=phno;
		this.bill=bill;
	}

	public int getId() {
		return id;
	}
	
	public String getPname() {
		return pname;
	}
	
	public String getDname() {
		return dname;
	}
	
	public String getPhno() {
		return phno;
	}
	
	public double getBill() {
		return bill;
	}

	@Override
	public String toString() {
		return String.format("%d,%s,%s,%s,%f", id,pname,dname,phno,bill);
	}
	
}
