package com.shivkumar;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
	
	public static void main(String[] args) {
		
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieving bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
				
		// call methods on bean
		System.out.println(theCoach.getDailyWorkout());
		
		// close the context
		context.close();
	}
	
}
