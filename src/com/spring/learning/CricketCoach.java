package com.spring.learning;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;

	public CricketCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "spend some time in batting";
	}

	@Override
	public String getDailyFortune() {
		return "Cricket Coach : " + fortuneService.getDailyFortune();
	}

}
