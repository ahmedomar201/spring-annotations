package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {
	
	private FortuneService fortuneService;
	
	@Autowired
	public FootballCoach (FortuneService theFortuneService) {
		fortuneService=theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		 
		return "shoooooooot";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
