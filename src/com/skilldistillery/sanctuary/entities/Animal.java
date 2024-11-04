package com.skilldistillery.sanctuary.entities;

public class Animal {
//TODO name, get name, set name, eat, makename
	private String name;
	private String food;

//from my understanding, makes a copy of the privates name to make it a sudo interactable
	public String getName() {
		return name;
	}
	
//sets name to the sudo interactable from input 
	public void setName(String name) {
		this.name = name;
	}
	
//method for the sub classes that can extend to the animal class
	public void makeNoise() {
	}
	
//another method for the sub classes
	public int eat(int amount) {
		return 0;
	}
	
	//food type
	public void foodType(String food) {
		this.setFood(food);
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}
	
}
