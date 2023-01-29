package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {
		
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	//define a default constructor 
	public FootballCoach() {
		System.out.println(">>FootballCoach: inside defualt constructor ");
	}
	
	//define initial method 
	
	@PostConstruct
    public void demoStartStuff() {
		System.out.println(">>FootballCoach: inside demoStartStuff()  ");

	}
	
	//define my destroy method 
	@PreDestroy
    public void demoDestoryStuff() {
		System.out.println(">>FootballCoach: inside demoDestoryStuff()  ");

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
