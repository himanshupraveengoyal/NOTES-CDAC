package day6_hibernate_customer;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer 
{
	@Id
	private int custId ;
	private String password,city;
	private int rewards;

	public String getCity() {
		return city;
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
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setRewards(int rewards) {
		this.rewards = rewards;
	}
	@Override
	public String toString() 
	{
		return "Customer [custId=" + custId + ", password=" + password + ", city=" + city +",rewards="+rewards+ "]";
	}
}
