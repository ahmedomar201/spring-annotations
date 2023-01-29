package com.luv2code.springdemo;

public class SwimCoach implements Coach {
	
	private FortuneService fortuneService;
	
	
	public SwimCoach(FortuneService theFortuneService) {
		fortuneService=theFortuneService;
	}
	@Override
	public String getDailyWorkout() {
		
		return "swim 100 meters in beach";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
