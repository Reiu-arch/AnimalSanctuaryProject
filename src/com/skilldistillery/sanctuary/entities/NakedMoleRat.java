package com.skilldistillery.sanctuary.entities;

public class NakedMoleRat extends Animal {
	// TODO noise, nakenoise, eat

	// sets noise to specified animals noise
	public static String noise = "Chirp Chirp";

	// overrides method from super class animal with specified animals noise output
	@Override
	public void makeNoise() {
		System.out.println(noise);
		super.makeNoise();
	}

	// intakes random food quantity from attendant class, and passes it through
	// overridden eat method, also outputs noise from specified animal via make
	// noise class
	@Override
	public int eat(int amount) {
		makeNoise();
		System.out.println("You fed the Naked Mole Rat, " + amount + " " + getFood());
		return super.eat(amount);
	}
}
