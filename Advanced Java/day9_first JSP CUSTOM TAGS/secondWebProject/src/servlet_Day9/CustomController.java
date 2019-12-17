package servlet_Day9;

import java.util.*;

import javax.servlet.http.HttpServletRequest;

public class CustomController 
{

	public String findCity(HttpServletRequest request) 
	{
		String filename="WEB-INF/custresult.jsp";
		List<Customer> customer=new ArrayList<Customer>();
		Customer c1=new Customer(1,"Himanshu","Bangalore");
		customer.add(c1);
		Customer c2=new Customer(2,"Kamlesh","Mysore");
		customer.add(c2);
		Customer c3=new Customer(3,"Devbabu","Chennai");
		customer.add(c3);
		request.setAttribute("AllCustomers", customer);
		return filename;
	}
	
}
