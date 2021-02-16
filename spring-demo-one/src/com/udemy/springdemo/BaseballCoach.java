package com.udemy.springdemo;

public class BaseballCoach implements Coach
{

	private FortuneService fortuneService;

	public BaseballCoach(FortuneService fortSvc)
	{
		this.fortuneService = fortSvc;
	}

	@Override
	public String getDailyWorkout()
	{
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune()
	{
		// use my fortuneService to get a fortune
		return fortuneService.getFortune();
	}

}
