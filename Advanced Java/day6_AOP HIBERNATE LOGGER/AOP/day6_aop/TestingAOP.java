package day6_aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestingAOP 
{

	public static void main(String[] args) 
	{
		ClassPathXmlApplicationContext c=new ClassPathXmlApplicationContext("aop2.xml");
		A x=c.getBean(A.class);
		x.poc();
		x.checkA();
	}

}
