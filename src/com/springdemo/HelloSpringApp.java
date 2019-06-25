package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrive bean from spring container
		Coach theCoach = context.getBean("BaseballCoach", Coach.class);
		
		// call method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// call out new method for fortunes
		System.out.println(theCoach.getDailyFortune());
		
		// retrive bean from spring container
		Coach theCoach1 = context.getBean("TrackCoach", Coach.class);
		
		// call method on the bean
		System.out.println(theCoach1.getDailyWorkout());
		System.out.println(theCoach1.getDailyFortune());
		
		// close the context
		context.close();

	}

}
