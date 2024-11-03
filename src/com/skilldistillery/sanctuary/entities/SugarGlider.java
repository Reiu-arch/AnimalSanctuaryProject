package com.skilldistillery.sanctuary.entities;

public class SugarGlider extends Animal {
	// TODO noise, nakenoise, eat
	private static String noise = "Squeak Squeak";

	@Override
	public void makeNoise() {
		System.out.println(noise);
		super.makeNoise();
	}
	
	@Override
	public int eat(int amount) {
		makeNoise();
		System.out.println("You fed the sugar glider," +amount + " bugs.");
		return super.eat(amount);
	}
}
