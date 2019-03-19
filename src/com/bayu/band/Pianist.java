package com.bayu.band;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Pianist implements Band {
	@Value("Budi")
	private String name;
	@Value("23")
	private int age;
	@Value("budi@band.com")
	private String email;
	@Autowired
	@Qualifier("meetFans")
	private MeetAndGreet meetAndGreet;
	
	public Pianist() {

	}

	public Pianist(String name, int age, String email, MeetAndGreet meetAndGreet) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.meetAndGreet = meetAndGreet;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public MeetAndGreet getMeetAndGreet() {
		return meetAndGreet;
	}

	public void setMeetAndGreet(MeetAndGreet meetAndGreet) {
		this.meetAndGreet = meetAndGreet;
	}

	@Override
	public String getDailyPractice() {
		return "Latihan bermain piano.";
	}
}
