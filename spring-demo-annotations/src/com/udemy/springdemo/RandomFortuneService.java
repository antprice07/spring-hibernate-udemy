package com.udemy.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService
{

	// Create an array of strings
	private String[] data =
	{ "Beware of the wolf in sheep's clothing!", "A bird in the hand is worth two in the bush!",
			"You get out what you put in!" };

	// create a random number generator
	private Random myRandom = new Random();

	@Override
	public String getFortune()
	{
		// pick a random string from the array
		int index = myRandom.nextInt(data.length);

		String theFortune = data[index];

		return theFortune;
	}

}
