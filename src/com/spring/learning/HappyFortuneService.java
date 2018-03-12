package com.spring.learning;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		return "Today your fortune level is high!";
	}

}
