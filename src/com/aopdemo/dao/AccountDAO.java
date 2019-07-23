package com.aopdemo.dao;

import org.springframework.stereotype.Component;

import com.aopdemo.Account;

@Component
public class AccountDAO {

	public void addAccount(Account theAccount, boolean vipFlag) {
		System.out.println(getClass() + "doing my db work");
	}
	
	public boolean doWork() {
		System.out.println(getClass() + "doWork()");
		return false;
	}
}
