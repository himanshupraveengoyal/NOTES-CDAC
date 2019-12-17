package day6_hibernate_customer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHibernate {

	public static void main(String[] args) 
	{
		ClassPathXmlApplicationContext c=new ClassPathXmlApplicationContext("hibernate.xml");
		Customer cust=new Customer();
		cust.setCustId(33);
		cust.setPassword("test");
		cust.setRewards(555);
		cust.setCity("Mysuru");
		DAOCustomer x=c.getBean(DAOCustomer.class);
		
		Customer customer=x.getCustomer(cust.getCustId());
		System.out.println(customer);
//		String data = x.deleteCustomer(cust);
//		String data = x.updateCustomer(cust);
//		String data = x.storeCustomer(cust);
//		System.out.println(data);
	}

}
