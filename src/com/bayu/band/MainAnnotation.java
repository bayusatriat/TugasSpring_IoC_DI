package com.bayu.band;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAnnotation {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		
		Pianist band = context.getBean("MyPianist", Pianist.class);
		System.out.println("Name: " + band.getName());
		System.out.println("Age: " + band.getAge());
		System.out.println("Email: " + band.getEmail());
		System.out.println(band.getDailyPractice());
		System.out.println("Meet and Greet Session: " + band.getMeetAndGreet().getFans());
		
		context.close();
	}

}
