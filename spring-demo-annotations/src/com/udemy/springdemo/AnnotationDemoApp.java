package com.udemy.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp
{

	public static void main(String[] args)
	{
		// read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// get bean
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		// call method
		System.out.println(theCoach.getDailyWorkout());
		// close the context
		context.close();
	}

}
