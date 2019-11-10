package Mixed_AL_DB_CSV;

public class Employee{
	
	private int EmpId;
	private String EmpName;
	private String EmpAddress;
	private int EmpSalary;
	
	Employee(int EmpId,String EmpName,String EmpAddress,int EmpSalary){
		this.EmpId=EmpId;
		this.EmpName=EmpName;
		this.EmpAddress=EmpAddress;
		this.EmpSalary=EmpSalary;
	}

	public int getEmpId() {
		return EmpId;
	}

	public String getEmpName() {
		return EmpName;
	}

	public String getEmpAddress() {
		return EmpAddress;
	}

	public int getEmpSalary() {
		return EmpSalary;
	}

	@Override
	public String toString() {
		return String.format("%d,%s,%s,%d", EmpId,EmpName,EmpAddress,EmpSalary);
	}
}