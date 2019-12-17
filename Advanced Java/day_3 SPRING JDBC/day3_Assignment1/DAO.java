package day3_Assignment1;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;



public class DAO 
{
	private JdbcTemplate t;
	public DAO()
	{
		BasicDataSource b=new BasicDataSource();
		b.setDriverClassName("com.mysql.jdbc.Driver");
		b.setUsername("root");
		b.setPassword("root");
		b.setUrl("jdbc:mysql://localhost:3306/user");
		t=new JdbcTemplate();
		t.setDataSource(b);
		System.out.println("DAO Object Created");
	}

	public boolean insertToDb(Customers customer) 
	{
		String sql="insert into customer(custId,password,rewards,city) values(?,?,?,?)";
		Object[] params= {customer.getCustId(),customer.getPassword(),customer.getRewards(),customer.getCity()};
		int rowaffected=t.update(sql,params);
		return rowaffected>0;
	}

	public boolean updateToDb(Customers customer) 
	{
		String sql="update customer set password=?,rewards=?,city=? where custId=?";
		Object[] params= {customer.getPassword(),customer.getRewards(),customer.getCity(), customer.getCustId()};
		int rowaffected=t.update(sql,params);
		return rowaffected>0;
	}

	public Customers singleData(int cid) 
	{
		String sql="select custId,password,rewards,city from customer where custId=?";
		Object[] params= {cid};
		BeanPropertyRowMapper<Customers> x=new BeanPropertyRowMapper<Customers>(Customers.class);
		Customers cust;
		try 
		{
			cust=t.queryForObject(sql,params,x);
		} 
		catch (DataAccessException e) 
		{
			cust=new Customers();
			cust.setRewards(0);
		}
		return cust;
	}

	public List<Customers> multipleData(int erewards) 
	{
		String sql="select * from customer where rewards>?";
		Object[] params= {erewards};
		List<Customers> clist;
		BeanPropertyRowMapper<Customers> x=new BeanPropertyRowMapper<>(Customers.class);
		try 
		{
			clist=t.query(sql,params,x);
		} 
		catch (DataAccessException e) 
		{
			clist=new ArrayList<Customers>();
		}
		return clist;
	}

}
