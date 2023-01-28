package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {
		
	@Autowired
	private FortuneService fortuneService;
	
	//define a default constructor 
	public FootballCoach() {
		System.out.println(">>FootballCoach: inside defualt constructor ");
	}
	
	//define a setter injection
	/*
	@Autowired
	public void demoCrazyStuff(FortuneService theFortuneService) {
		
		System.out.println(">>FootballCoach: inside demoCrazyStuff() method ");
		fortuneService=theFortuneService; 
	}*/
	
	//constructor injection 
	/*@Autowired
	public FootballCoach (FortuneService theFortuneService) {
		fortuneService=theFortuneService;
	}*/

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
