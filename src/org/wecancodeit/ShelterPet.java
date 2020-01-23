package org.wecancodeit;

public class ShelterPet {

	private int position;
	private String petName;
	private String description;

	
	public String getPetName() {
		
		return petName;
	}
	
	public int getPosition() {
		return position;
	}
	public ShelterPet(int position, String string2, String description) {
		this.position = position;
		this.petName = petName;
		this.description = description;
	}
	public void withdraw(int position) {
		position -= position;
		
	}

}
