package com.udemy.springdemo;

public class BasketballCoach implements Coach
{

	private FortuneService fortuneService;
	private String emailAddress;
	private String team;

	public BasketballCoach()
	{
		System.out.println("BasketballCoach: inside default constructor");
	}

	public BasketballCoach(FortuneService fortuneService)
	{
		super();
		this.fortuneService = fortuneService;
	}

	// our setter method
	public void setFortuneService(FortuneService fortuneService)
	{
		System.out.println("BasketballCoach: inside the fortuneService setter method");
		this.fortuneService = fortuneService;
	}

	public void setEmailAddress(String emailAddress)
	{
		System.out.println("BasketballCoach: inside the email setter method");
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team)
	{
		System.out.println("BasketballCoach: inside the team setter method");
		this.team = team;
	}

	public String getEmailAddress()
	{
		return emailAddress;
	}

	public String getTeam()
	{
		return team;
	}

	@Override
	public String getDailyWorkout()
	{
		return "Shoot 100 free throws.";
	}

	@Override
	public String getDailyFortune()
	{
		return "You won't miss more than 5: " + fortuneService.getFortune();
	}

}
