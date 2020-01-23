package org.wecancodeit;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VirtualPetShelterApp {

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
				System.out.println("(1 to fed me)(2 to give me water)(3 to let me rest)(4 to play");
				
				
				String menuOption = input.nextLine();

				if(menuOption.contentEquals("help")) {
					printMenu();
					continue;
				}else if (menuOption.contentEquals("1")) {
					System.out.println("Yummy! This is great!");
					techPet.eat();
				}else if (menuOption.contentEquals("2")) {
					System.out.println("Thanks, that hit the spot!");
					techPet.drink();
				}else if (menuOption.contentEquals("3")) {
					System.out.println("Rested");
					techPet.play();
				}else if (menuOption.contentEquals("4")) {
					System.out.println("This was fun!!");
					techPet.play();
				}else {
					System.out.println("WTF! Say that again...from 1-3");
				}
				
				
				techPet.tick();
				
				
				}

	
			

	}
//			
//			public static void printMenu() {
//				
//				System.out.println("Press 1 to feed me");
//				System.out.println("Press 2 to give me water");
//				System.out.println("Press 3 to play with me");
//				System.out.println("To see menu, type \"help\".");
//			private void tick() {
				// TODO Auto-generated method stub
			

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

}
