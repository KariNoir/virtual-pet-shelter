package org.wecancodeit;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Shelter {

	Map<String, ShelterPet> pets = new HashMap<>();

	public void add(ShelterPet pet) {
		pets.put(pet.getPetName(), pet);
		
	}

	public ShelterPet findPet(String pet) {
		// TODO Auto-generated method stub
		return null;
	}

	public Collection<ShelterPet> getAllPets() {
		// TODO Auto-generated method stub
		return null;
	}

	public void close(ShelterPet pet) {
		pets.remove(pet.getPetName(), pet);
		
	}

	public void withdraw(String petName, String apet) {
		ShelterPet adoptedFromShelter = findPet(petName);
		adoptedFromShelter.withdraw(apet);
	}

	

}
