package com.bayu.band;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:member.properties")
public class MemberConfig {
	@Bean
	public MeetAndGreet meetFans() {
		return new MeetFans();
	}
	@Bean
	public Band vocalist(MeetAndGreet meetAndGreet) {
		Vocalist myVocalist = new Vocalist(meetFans());
		return myVocalist;
	}
}
