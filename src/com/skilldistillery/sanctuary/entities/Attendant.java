package com.skilldistillery.sanctuary.entities;

public class Attendant {
    //TODO creat a makerounds array 
	       //make be able to interact with animals, NA out of scope for this project
	//TODO may need a scanner input with printout of list, NA, out of scope
	//TODO needs inout to give animals food, only needs to be random from 0-10 units with no user input 
	
public void makeRounds(Animal[] animal){
		System.out.println("Its time to go feed the animals, lets go!");
		
		for (Animal animalVar: animal) {
			if (animalVar != null) {
				int foodQuantity = (int)(Math.random()*11);
				System.out.print("Hey, " + animalVar.getName()+ " heres "+ foodQuantity);
				animalVar.foodType();
				System.out.println("_____________________");
			} else {
				System.out.println("Looks like nobody is in here!");
			}
				
		}
		System.out.println("Looks like thats everyone, lets take a break!");
	}
}
