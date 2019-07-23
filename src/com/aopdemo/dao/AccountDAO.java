package com.aopdemo.dao;

import org.springframework.stereotype.Component;

import com.aopdemo.Account;

@Component
public class AccountDAO {

	private String name;
	private String serviceCode;
	
	public String getName() {
		System.out.println(getClass() + " getName");
		return name;
	}

	public void setName(String name) {
		System.out.println(getClass() + " setName");
		this.name = name;
	}

	public String getServiceCode() {
		System.out.println(getClass() + " getService");
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		System.out.println(getClass() + " setService");
		this.serviceCode = serviceCode;
	}

	public void addAccount(Account theAccount, boolean vipFlag) {
		System.out.println(getClass() + " doing my db work");
	}
	
	public boolean doWork() {
		System.out.println(getClass() + " doWork()");
		return false;
	}
}
