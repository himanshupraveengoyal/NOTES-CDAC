package day6_hibernate_customer;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class DAOCustomer {

	
	SessionFactory sessionfactory;
	
	public void setSessionFactory(SessionFactory sessionfactory) 
	{
		System.out.println("DAO wired");
		this.sessionfactory = sessionfactory;
	}
	
	public void testFunc() 
	{
		System.out.println((sessionfactory!=null));
	}
	
	public String storeCustomer(Customer cust) 
	{
		Session s=sessionfactory.openSession();
		Transaction t=s.beginTransaction();
		s.save(cust);
		t.commit();
		s.close();
		return "Added to db";
	}

	public String updateCustomer(Customer cust) 
	{
		Session s=sessionfactory.openSession();
		Transaction t=s.beginTransaction();
		s.update(cust);
		t.commit();
		s.close();
		return "updated to db";
	}

	public String deleteCustomer(Customer cust) 
	{
		Session s=sessionfactory.openSession();
		Transaction t=s.beginTransaction();
		s.remove(cust);
		t.commit();
		s.close();
		return "deleted from db";
	}

	public Customer getCustomer(int custId) 
	{
		Session s=sessionfactory.openSession();
		Customer cust=s.get(Customer.class, custId);
		return cust;
	}

}
