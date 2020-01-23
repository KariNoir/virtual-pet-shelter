package org.wecancodeit;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VirtualPetShelterApp {

	private static Object thePet;
	private static VirtualPetShelterApp techPet;
	private static String menuOption;

	public VirtualPetShelterApp(int i, int j, int k, int l) {

	}

	public static void main(String[] args) {
				Scanner input = new Scanner(System.in);
				
				VirtualPetShelterApp techPet = new VirtualPetShelterApp(6, 6, 6, 6);
		//name your pet

				System.out.println("Hi, name your pet");
				Scanner petName = new Scanner(System.in);
				String yourpet = petName.nextLine();
			
				//start loopin'
				
				while (true) {
					
					
				System.out.println(yourpet +"'s tummy meter is on " + techPet.forEat());
				System.out.println(yourpet +"'s fun meter is on " + techPet.forFun());
				System.out.println(yourpet +"'s sleep meter is on " + techPet.forSleep());
				System.out.println(yourpet +"'s water meter is on " + techPet.forDrink();
				
				System.out.println("Pick a number from 1-4.)");
				System.out.println("()()()(");
				
				
				String menuOption = input.nextLine();

	private static void menuOption() {
		System.out.println("1 to fed");
		System.out.println("2 to give water");
		System.out.println("3 to let rest");
		System.out.println("4 to play");
		System.out.println("5 Adopt a pet");
		System.out.println("6 Leave a new pet");
		System.out.println("7 to END");

		if (menuOption.contentEquals("help")) {
			menuOption();
			continue;
		} else if (menuOption.contentEquals("1")) {
			System.out.println("Yummy! This is great!");
			techPet.eat();
		} else if (menuOption.contentEquals("2")) {
			System.out.println("Thanks, that hit the spot!");
			techPet.drink();
		} else if (menuOption.contentEquals("3")) {
			System.out.println("Rested");
			techPet.sleep();
		} else if (menuOption.contentEquals("4")) {
			System.out.println("This was fun!!");
			techPet.play();
		} else {
			System.out.println("No, No, No...from 1-4");
		}

		thePet.tickAllPets();

	}input.close();

	private static void printMenu() {
		// TODO Auto-generated method stub

	}

	private void eat() {
		// TODO Auto-generated method stub

	}

	private void drink() {
		// TODO Auto-generated method stub

	}

	private void sleep() {
		// TODO Auto-generated method stub

	}

	private void play() {
		// TODO Auto-generated method stub

	}
//			
//			public static void printMenu() {
				
//				System.out.println("Press 1 to feed me");
//				System.out.println("Press 2 to give me water");
//				System.out.println("Press 3 to play with me");
//				System.out.println("To see menu, type \"help\".");
//			private void tick() {
//	

//
//			private String haveFun() {
//				// TODO Auto-generated method stub
//				String fun;
//				return fun;
//			}
//
//			private String getDrink() {
//				// TODO Auto-generated method stub
//				return null;
//			}

}
