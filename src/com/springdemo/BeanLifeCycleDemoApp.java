package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		TrackCoach theCoach = context.getBean("TrackCoach", TrackCoach.class);
		
		TrackCoach theCoach2 = context.getBean("TrackCoach", TrackCoach.class);
		
		System.out.println(theCoach == theCoach2);
		
		context.close();
	}
}
