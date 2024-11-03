package com.skilldistillery.sanctuary.entities;

public class Animal {
//TODO name, get name, set name, eat, makename
	private String Animal;

	public Animal() {

	}

	public Animal(String animal) {
		Animal = animal;
	}

	public String getAnimal() {
		return Animal;
	}

	public void setAnimal(String animal) {
		Animal = animal;
	}

	public void makeNoise() {
	}

	public int eat(int amount) {
		return 0;
	}
}
