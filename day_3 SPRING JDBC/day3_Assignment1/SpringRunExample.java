package day3_Assignment1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringRunExample {

	public static void main(String[] args) 
	{
		Presentation x=null;
		ClassPathXmlApplicationContext d=new ClassPathXmlApplicationContext("anything.xml");
		x=d.getBean(Presentation.class);
		x.startApp();
	}

}
