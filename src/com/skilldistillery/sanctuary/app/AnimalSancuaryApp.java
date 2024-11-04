package com.skilldistillery.sanctuary.app;

import java.util.Scanner;

import com.skilldistillery.sanctuary.entities.Attendant;
// TODO Just need a run() method that will then go to Sanctury.java
// TODO Initialize scanner
// TODO Fill out Read me page
// TODO make a switch board

public class AnimalSancuaryApp {
	// scanner and sanctuary do not work if put inside main, guess is due to main
	// being static and both not being initialized as static within does not compile
	protected Scanner sc = new Scanner(System.in);
	protected Sanctuary sanctuary = new Sanctuary();

	public static void main(String[] args) {

		// IMPORTANT: base run(); method will not run due to not being static. From my
		// understanding non-static methods are like actions and static methods are like
		// people or things. the only way for an action to occur is for something to
		// make it. You label an action (i.e. non-static method) and make an object to
		// make said action.
		AnimalSancuaryApp app = new AnimalSancuaryApp();
		app.run();
	}

	private void run() {
		Sanctuary sanctuary = new Sanctuary();
		Attendant Attendant = null;
		sanctuary.setAttendant(Attendant);
	}

}
