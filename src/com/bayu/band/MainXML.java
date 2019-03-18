package com.bayu.band;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainXML {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		
		Guitarist band = context.getBean("MyGuitarist", Guitarist.class);
		System.out.println("Name: " + band.getName());
		System.out.println("Age: " + band.getAge());
		System.out.println("Email: " + band.getEmail());
		System.out.println(band.getDailyPractice());
		
		context.close();
	}

}
