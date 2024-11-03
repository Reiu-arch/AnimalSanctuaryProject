package com.skilldistillery.sanctuary.entities;

public class NakedMoleRat extends Animal{
	//TODO noise, nakenoise, eat

	public static String noise = "Chirp Chirp";
	
	
	
	@Override
	public void makeNoise() {
		System.out.println(noise);
		super.makeNoise();
	}
	@Override
	public int eat(int amount) {
		makeNoise();
		System.out.println("You fed the Mole rat," +amount + "roots.");
		return super.eat(amount);
	}
}
