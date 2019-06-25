package com.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService1;
	private String emailAddress;
	private String team;
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: inside setter method - setEamilAddress");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach: inside setter method - setTeam");
		this.team = team;
	}

	// create a no-arg constructor
	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg constructor");
	}
	
	public void setFortuneService1(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method - setFortuneService");
		this.fortuneService1 = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practise fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {

		return fortuneService1.getFortune();
	}

}
