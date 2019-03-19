package com.bayu.band;

import org.springframework.stereotype.Component;

@Component
public class MeetFans implements MeetAndGreet {
	@Override
	public String getFans() {
		return "I love you!";
	}
}
