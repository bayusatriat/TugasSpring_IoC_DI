package com.bayu.band;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainJavaConfiguration {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MemberConfig.class);
		
		Vocalist band = context.getBean("vocalist", Vocalist.class);
		System.out.println("Name: " + band.getName());
		System.out.println("Age: " + band.getAge());
		System.out.println("Email: " + band.getEmail());
		System.out.println(band.getDailyPractice());
		System.out.println("Meet and Greet Session: " + band.getMeetAndGreet().meetFans());
		
		context.close();
	}
	
}
