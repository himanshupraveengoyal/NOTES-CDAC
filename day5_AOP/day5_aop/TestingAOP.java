package day5_aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestingAOP 
{

	public static void main(String[] args) 
	{
		ClassPathXmlApplicationContext c=new ClassPathXmlApplicationContext("aop.xml");
		A x=c.getBean(A.class);
		x.freak1();
		x.freak2();
	}

}
