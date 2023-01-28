package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	// create array of string 
	private String[] data= {
		"ahmed",
		"omar",
		"mohamed"	
	}; 
	
	// create random number generator
	private Random MyRandom =new Random();
	

	@Override
	public String getFortune() {
		
		// pick random string from array 
		int index =MyRandom.nextInt(data.length);
		
		String theFortune=data[index];
		
		return theFortune;
	}

}
