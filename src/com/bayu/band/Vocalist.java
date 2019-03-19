package com.bayu.band;

import org.springframework.beans.factory.annotation.Value;

public class Vocalist implements Band {
	@Value("${member.name}")
	private String name;
	@Value("${member.age}")
	private int age;
	@Value("${member.email}")
	private String email;
	private MeetAndGreet meetAndGreet;
	
	public Vocalist() {

	}

	public Vocalist(MeetAndGreet meetAndGreet) {
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
		return "Latihan menyanyi.";
	}
}
