//for the shelter
package org.wecancodeit;

import java.util.HashMap;
import java.util.Map;

public class VirtualPet {

	// private String petName;
	private int eat = 10;
	private int sleep = 10;
	private int fun = 10;
	private int water = 10;
	private String petName;
	private String petDescription;
 
	public VirtualPet(String petNameParameter, String petDescriptionParameter) {
		this.petName = petNameParameter;
		this.petDescription = petDescriptionParameter;
	}
	public VirtualPet() {
		// default constructor - was invisible before it had friends
	}
	public VirtualPet(String petNameParameter, String petDescriptionParameter, int eatParameter, 
			int sleepParameter, int funParameter, int waterParameter) {
		this.petName = petNameParameter;
		this.petDescription = petDescriptionParameter;
		this.eat = eatParameter;
		this.water = waterParameter;
		this.fun = funParameter;
	}

	public VirtualPet(int eat, int sleep, int fun, int water) {
		this.eat = eat;
		this.sleep = sleep;
		this.fun = fun;
		this.water = water;
	}

	public VirtualPet(String[] args) {
		// TODO Auto-generated method stub
	
	Map<String, String> pets = new HashMap<String, String>();

	pets.put("Red", "Green Turtle with red stripes.  She likes to sun bath");
	pets.put("Thor", "Big brown dog.  He loves to sit in your lap!");
	pets.put("Cotton", "Fat gray cat.  She loves to cuddle.");
	}
	//System.out.println("The shelter pets are " + pets);
	
	
	public void tick() {
		eat--;
		sleep--;
		fun--;
		water--;
	}

	public int forEat() {
		return eat;
	}

	public int forSleep() {
		return sleep;
	}

	public int forFun() {
		return fun;
	}

	public int forDrink() {
		return water;
	}

	public void fedPet() {
			this.eat += 3;
			this.sleep += 1;
			this.water -= 4;
		return;
	}

	public void getDrink() {
			this.eat -= 2;
			this.fun += 2;
			this.water += 4;
		return;
	}

	public void haveFun() {
			this.sleep -= 3;
			this.eat -= 2;
			this.fun += 4;
		return;

	}

	public void getSleep() {
			this.sleep += 2;
			this.water -=2;
			this.eat += 2;
		return;
	}



	public String getPetName() {
		return this.petName;
	}

	public String getPetDescription() {
		return this.petDescription;
	}

}


