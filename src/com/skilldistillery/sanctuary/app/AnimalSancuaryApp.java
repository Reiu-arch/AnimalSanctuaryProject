package com.skilldistillery.sanctuary.app;

import java.util.Scanner;

import com.skilldistillery.sanctuary.entities.Attendant;
import com.skilldistillery.sanctuary.entities.BlobFish;
import com.skilldistillery.sanctuary.entities.NakedMoleRat;
import com.skilldistillery.sanctuary.entities.SugarGlider;
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

		sanctuary.setAttendant(new Attendant());
		boolean running = true;

		while (running) {
			displayMenu();
			System.out.print("Choose an option (1-4): ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("You chose to check the roster of animals.");
				sanctuary.listAnimals();
				break;
			case 2:
				if (sanctuary.maxCap()) {
					System.out.println("Looks like we cant take in any more animals, we're sorry.");
					break;
				}
				
				System.out.println(
						"You chose to add a new animal to an empty lot, here is a list of the animals we can currently facilitate.");
				animalMenu();
				int input = sc.nextInt();
				sc.nextLine();
				if (input == 1) {
					BlobFish blobfish = new BlobFish();
					System.out.println("What is the Blob Fish's name?");
					String bname = sc.nextLine();
					blobfish.setName(bname);
					System.out.println("What type of food to they eat?");
					String bfname = sc.nextLine();
					blobfish.setFood(bfname);
					sanctuary.addAnimal(blobfish);
					break;

				} else if (input == 2) {
					NakedMoleRat moleRat = new NakedMoleRat();
					System.out.println("What is the Mole Rat's name?");
					String mname = sc.nextLine();
					moleRat.setName(mname);
					System.out.println("What type of food to they eat?");
					String brname = sc.nextLine();
					moleRat.setFood(brname);
					sanctuary.addAnimal(moleRat);

					break;
				} else if (input == 3) {
					SugarGlider sugarGlider = new SugarGlider();
					System.out.println("What is the Sugar Glider's name?");
					String sname = sc.nextLine();
					sugarGlider.setName(sname);
					System.out.println("What type of food to they eat?");
					String bsname = sc.nextLine();
					sugarGlider.setFood(bsname);
					sanctuary.addAnimal(sugarGlider);

					break;
				} else {
					System.out.println("Please choose an animal!");
					break;
				}
			case 3:
				System.out.println("You chose to send the keeper on their rounds.");
				sanctuary.startAttendantRounds();
				break;
			case 4:
				System.out.println("You chose to leave the Sanctuary. Goodbye!");
				running = false;
				break;
			default:
				System.out.println("Invalid choice, please try again.");
			}
			System.out.println();
		}

		sc.close();
	}

	private void displayMenu() {
		System.out.println("+------------------------------------------+");
		System.out.println("|           Animal Sanctuary Menu          |");
		System.out.println("+------------------------------------------+");
		System.out.println("| 1.) Check roster of animals              |");
		System.out.println("| 2.) Add new animal to an empty lot       |");
		System.out.println("| 3.) Send the keeper on their rounds      |");
		System.out.println("| 4.) Leave the Sanctuary                  |");
		System.out.println("+------------------------------------------+");
	}

	private void animalMenu() {
		String border = "************************************";

		System.out.println(border);
		System.out.println("*        Please choose an animal: *");
		System.out.println("*  1.) Blob Fish                  *");
		System.out.println("*  2.) Naked Mole Rat             *");
		System.out.println("*  3.) Sugar Glider               *");
		System.out.println(border);
	}

}
