package com.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;

	public TrackCoach() {
		
	}
	
	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run a hard 6K";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just do it: " + fortuneService.getFortune();
	}
	
	// add an init method
	public void doMyStartUpStuff() {
		System.out.println("TrackCoach: inside method doMyStartUpStuff");
	}
	
	// add an destory method
		public void doMyCleanupStuff() {
			System.out.println("TrackCoach: inside method doMyCleanupStuff");
		}

}
