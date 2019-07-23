package com.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {

	public void addAccount() {
		System.out.println(getClass() + "adding a membership account");
	}
	
	public void goToSleep() {
		System.out.println(getClass() + "go to sleep");
	}
}
