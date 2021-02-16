package com.udemy.springdemo;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach
{

	public TennisCoach()
	{
	}

	@Override
	public String getDailyWorkout()
	{
		return "Practice your backhand volley";
	}

}
