package day6_logger;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringExample {

	public static void main(String[] args) 
	{
		Presentation x=null;
		ClassPathXmlApplicationContext c=new ClassPathXmlApplicationContext("springExample.xml");
		
		x=c.getBean(Presentation.class);
		x.startApp();
		
		
	}

}
