package com.corey.springdemo;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is your lucky day!";
	}

	@Override
	public String getRandomFortune() {
		String[] fortunesArray = { "Today will be a good day.", "Don't step on cracks", "Eat your greens.", "Go you!" };
		return fortunesArray[(int)(Math.random() * fortunesArray.length)];
	}

}
