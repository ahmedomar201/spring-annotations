package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		
		// read spring config java class  	
		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		//get the bean from spring container 
		
		Coach theCoach=context.getBean("footballCoach",Coach.class);
		
		//call a method on the bean 
		System.out.println(theCoach.getDailyWorkout());
		
		//call a method to getDaily Fortune
		System.out.println(theCoach.getDailyFortune());
		
		//close context 
		context.close();

	}

}
