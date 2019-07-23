package com.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.aopdemo.dao.AccountDAO;
import com.aopdemo.dao.MembershipDAO;

public class MainDemoApp {

	public static void main(String[] args) {
		
		// read spring config java class
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
		// get the bean from spring container
		AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);
		theAccountDAO.addAccount(new Account(), false);
		theAccountDAO.doWork();
		
		// call the accountdao getter/setter methods
		theAccountDAO.setName("ff");
		theAccountDAO.setServiceCode("fds");
		
		theAccountDAO.getName();
		theAccountDAO.getServiceCode();
		
		MembershipDAO theMembershipDAO = context.getBean("membershipDAO", MembershipDAO.class);
		theMembershipDAO.addAccount();
		theMembershipDAO.goToSleep();
		
		
		// close the context
		context.close();

	}

}
