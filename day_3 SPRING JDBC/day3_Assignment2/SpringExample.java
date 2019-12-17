package day3_Assignment2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringExample {

	public static void main(String[] args) 
	{
		Presentation x=null;
		ClassPathXmlApplicationContext c=new ClassPathXmlApplicationContext("anything.xml");
		
		x=c.getBean(Presentation.class);
		x.startApp();
		
		
	}

}
