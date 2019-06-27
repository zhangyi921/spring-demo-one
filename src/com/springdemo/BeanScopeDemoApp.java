package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		BaseballCoach theCoach = context.getBean("BaseballCoach", BaseballCoach.class);
		
		BaseballCoach theCoach2 = context.getBean("BaseballCoach", BaseballCoach.class);
		
		System.out.println(theCoach == theCoach2);
		
		context.close();
	}
}
