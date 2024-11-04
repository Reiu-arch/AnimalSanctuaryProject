package com.skilldistillery.sanctuary.app;

import com.skilldistillery.sanctuary.entities.Animal;
import com.skilldistillery.sanctuary.entities.Attendant;

public class Sanctuary {
//TODO public       animal list              void   "has an array of five Animals representing the enclosures in the sanctuary"
//TODO public       animal adding            void   
//TODO private      attendant                void   "Attendant field"
//TODO public       attendant rounds         void
	private Animal[] animalList = new Animal[5];
	private Attendant attendant;

	public void setAttendant(Attendant attendant) {
		this.attendant = attendant;
	}

	public void startAttendantRounds() {
		System.out.println("Its time to go feed the animals, lets go!");
		attendant.makeRounds(animalList);
	}

	public void listAnimals() {
		for (Animal animal : animalList) {
			if (animal != null) {
				System.out.println("Looks like" + animal.getName()+ "is here!");

			} else {
				System.out.println("This enclosure is Empty!");

			}
		}
	}

	public void addAnimal(Animal animal) {
		for (int i = 0; i < animalList.length; i++) {

			if (animalList[i] == null) {
				animalList[i] = animal;
				System.out.println(animal+"has now been added into the sanctuary!");
				return;
			}

		}
	}
	public boolean maxCap() {
		for (int j = 0;j < animalList.length; j++) {
			if (animalList[j] == null) {
			return true;
			}
		}
		return false;
	}
}
