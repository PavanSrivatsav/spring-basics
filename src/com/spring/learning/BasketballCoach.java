package com.spring.learning;

public class BasketballCoach implements Coach {

	private FortuneService fortuneService;
	private String emailId;
	private String team;

	public String getEmailId() {
		return emailId;
	}

	public String getTeam() {
		return team;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Learn dribbling";
	}

	@Override
	public String getDailyFortune() {
		return "Basketball coach : " + fortuneService.getDailyFortune();
	}

	public void doInitStuff() { // return type should be void or else it wont execute
		System.out.println("Start of bean");
	}

	public void doDestroyStuff() { // return type should be void or else it wont execute
		System.out.println("End of bean");
	}

}
