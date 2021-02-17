package com.udemy.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class TennisCoach implements Coach
{

	// Field Injection
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;

	public TennisCoach()
	{
		System.out.println(">> TennisCoach: inside the default constructor");
	}

	@PostConstruct
	public void doStartUp()
	{
		System.out.println(">> TennisCoach: inside init method");
	}

	@PreDestroy
	public void doCleanUp()
	{
		System.out.println(">> TennisCoach: inside destroy method");
	}

//	Method injection
//	@Autowired
//	public void setFortuneService(FortuneService fortuneSvc)
//	{
//		System.out.println(">> TennisCoach: inside the setter for fortuneSvc");
//		fortuneService = fortuneSvc;
//	}

	@Override
	public String getDailyWorkout()
	{
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune()
	{
		return fortuneService.getFortune();
	}

}
