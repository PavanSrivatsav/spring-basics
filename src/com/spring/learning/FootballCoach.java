package com.spring.learning;

public class FootballCoach implements Coach {

	private FortuneService fortuneService;

	public FootballCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "spend some time in dribbling";
	}

	@Override
	public String getDailyFortune() {
		return "Football Coach : " + fortuneService.getDailyFortune();
	}

}
