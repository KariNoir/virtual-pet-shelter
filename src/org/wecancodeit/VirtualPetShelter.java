package org.wecancodeit;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;



public class VirtualPetShelter {

//	include appropriate instance variable(s) to store the pets who reside at the shelter
//	include methods that:
//	return a Collection of all of the pets in the shelter
//	return a specific VirtualPet given its name
//	allow intake of a homeless pet
//	allow adoption of a homeless pet
//	feed all of the pets in the shelter
//	water all of the pets in the shelter
//	plays (or performs some other interaction(s)) with an individual pet in the shelter
//	include a tick method that calls the tick method for each of the pets in the shelter, updating their needs
	
	
	
	
	
	
	
	
	
private static Object ShelterPet;

public static void main(String[] args) {
		
		
	Map<String, String> pets = new HashMap<String, String>();

		pets.put("Thor", "Big and brown and loves to sit on your lap");
		pets.put("Red", "Green and brown with a red stripe on the side of her face");
		pets.put("Cotton", "Fat, gray cat that loves to cuddle");
		//System.out.println("The students are " + students);
		

		Map<String, ShelterPet> pets = new HashMap<>();

		public void add(ShelterPet pets) {
			ShelterPet pet;
			pets.put(pet.getPetName(), pet);
			
		}

		ShelterPet findPet(String pets) {
			// TODO Auto-generated method stub
			return null;
		}

		Collection<ShelterPet> getAllPets() {
			// TODO Auto-generated method stub
			return;
		}

		public void close(ShelterPet, pet) {
			pets.remove(pet.getPetName(), pet);
			
		}

		public void withdraw(String petName, int position) {
			ShelterPet adoptedFromShelter = findPet(petName);
			adoptedFromShelter.withdraw(position);
		}

	
		
	
}

private static ShelterPet findPet(String petName) {
	// TODO Auto-generated method stub
	return null;
}
}