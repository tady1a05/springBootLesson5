package com.test.springboot;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class myCoachApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); /*get the context from applicationContext.xml*/
		
		Coach coach = context.getBean("myCoach", Coach.class);/*get spring bean object*/
		/*
		 * due to applicationContext.xml
		 * 
		 * equal to 
		 * Coach coach = new swimCoach(new FortunateServices());
		 * 
		 * */
		System.out.println(coach.doWorkout());
		
		System.out.println(coach.doFortunate());
	}

}
