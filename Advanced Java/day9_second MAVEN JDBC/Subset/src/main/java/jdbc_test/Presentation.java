package jdbc_test;

public class Presentation 
{
	public static void main(String[] args) 
	{
		String db="insert into employee values(5,'Kamlesh','Bangalore',100000)";
		ConnectJDBC jdbc=new ConnectJDBC();
		int rows=jdbc.PerformOperation(db);
		System.out.println(rows);
	}
}
