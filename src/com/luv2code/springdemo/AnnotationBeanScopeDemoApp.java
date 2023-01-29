package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		
		// load spring config file 
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container 
		
		Coach theCoach=context.getBean("footballCoach",Coach.class);
		
		Coach alphacoach=context.getBean("footballCoach",Coach.class);
		
		//check if they are the same 
		
		boolean result=(theCoach==alphacoach);
		
		//print result
		System.out.println("<<<<<<<<<<<<"+result);
		System.out.println("+++++++++++"+theCoach);
		System.out.println("----------"+alphacoach);
		
		//close context
		
		context.close(); 
		

		
		

	}

}
