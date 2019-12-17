package day3_Assignment2;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class DAO 
{
	JdbcTemplate t;
	
	public DAO()
	{
		BasicDataSource b=new BasicDataSource();
		b.setDriverClassName("com.mysql.jdbc.Driver");
		b.setUsername("root");
		b.setPassword("root");
		b.setUrl("jdbc:mysql://localhost:3307/user");
		t=new JdbcTemplate();
		t.setDataSource(b);
		System.out.println("DAO Called");
	}

	public List<Customers> getAllCity(String ecity) 
	{
		String dbquery="select custId,password,rewards,city from customer where city=?";
		Object[] params= {ecity};
		List<Customers> allcustomer=null;
		BeanPropertyRowMapper<Customers>  x=new BeanPropertyRowMapper<>(Customers.class);
		try 
		{
			allcustomer=t.query(dbquery,params,x);
		} 
		catch (DataAccessException e) 
		{
			allcustomer=new ArrayList<Customers>();
		}
		return allcustomer;
	}

	public Customers getUserData(int id) 
	{
		String sql="select custId,password,rewards,city from customers where custId = ?";
		Object[] params = { id };
		BeanPropertyRowMapper<Customers> x=new BeanPropertyRowMapper<>(Customers.class);
		Customers cust = null;
		try 
		{
			cust=t.queryForObject(sql, params,x);
		} 
		catch (DataAccessException e) 
		{
			new Customers();
			cust.setRewards(-100);
		}
		return cust;
	}

	public boolean insertToDb(Customers cust) 
	{
		String sql="insert into customer(custId,password,rewards,city) values(?,?,?,?)";
		Object[] params = { cust.getCustId(),cust.getPassword(),cust.getRewards(),cust.getCity() };
		int rowsaffected=t.update(sql,params);
		return rowsaffected>0;
	}

	public boolean deleteFromDb(int id) 
	{
		String sql="delete from customer where custId=?";
		Object[] params = { id };
		int rowsaffected=t.update(sql,params);
		return rowsaffected>0;
	}

	public boolean updateToDb(Customers cust) 
	{
		String sql="update customer set password=?,rewards=?,city=? where custId=?";
		Object[] params = {cust.getPassword(),cust.getRewards(),cust.getCity(),cust.getCustId() };
		int rowsaffected=t.update(sql,params);
		return rowsaffected>0;
	}
}
