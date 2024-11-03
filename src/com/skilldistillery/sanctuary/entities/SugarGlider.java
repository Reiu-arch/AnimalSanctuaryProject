package com.skilldistillery.sanctuary.entities;

public class SugarGlider extends Animal {
	// TODO noise, nakenoise, eat

	// sets noise to specified animals noise

	private static String noise = "Squeak Squeak";
	public static String food = "bugs.";

	// overrides method from super class animal with specified animals noise output
	@Override
	public void makeNoise() {
		System.out.println(noise);
		super.makeNoise();
	}
	public void kindOfFood() {
		System.out.println(food);
		super.foodType();
	}

	// intakes random food quantity from attendant class, and passes it through
	// overridden eat method, also outputs noise from specified animal via make
	// noise class
	@Override
	public int eat(int amount) {
		makeNoise();
		System.out.print("You fed the sugar glider," + amount);
		kindOfFood();
		return super.eat(amount);
	}
}
