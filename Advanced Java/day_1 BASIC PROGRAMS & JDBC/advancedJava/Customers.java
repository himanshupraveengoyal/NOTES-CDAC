package advancedJava;

public class Customers 
{
	private int custId;
	private String password;
	private int rewards;
	private String city;
	
	public Customers(int custId,String password,int rewards,String city) 
	{
		this.custId=custId;
		this.password=password;
		this.rewards=rewards;
		this.city=city;
	}

	public int getCustId() {
		return custId;
	}

	public String getPassword() {
		return password;
	}

	public int getRewards() {
		return rewards;
	}

	public String getCity() {
		return city;
	}

}
