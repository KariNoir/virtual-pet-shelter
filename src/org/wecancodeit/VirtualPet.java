//for the shelter
package org.wecancodeit;

public class VirtualPet {

	// private String petName;
	private int eat = 10;
	private int sleep = 10;
	private int fun = 10;
	private int potty = 10;
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
			int sleepParameter, int funParameter, int pottyParameter) {
		this.petName = petNameParameter;
		this.petDescription = petDescriptionParameter;
		this.eat = eatParameter;
		this.potty = pottyParameter;
		this.fun = funParameter;
	}

	public VirtualPet(int eat, int sleep, int fun, int potty) {
		this.eat = eat;
		this.sleep = sleep;
		this.fun = fun;
		this.potty = potty;
	}

	public void tick() {
		eat--;
		sleep--;
		fun--;
		potty--;
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

	public int forPotty() {
		return potty;
	}

	public void fedPet() {
//			return this.eat += 3;
//			return this.sleep += 1;
//			return this.potty -= 4;
		return;
	}

	public void goPotty() {
//			return this.eat -= 2;
//			return this.fun += 2;
//			return this.potty += 4;
		return;
	}

	public void haveFun() {
//			return this.sleep -= 3;
//			return this.eat -= 2;
//			return this.fun += 4;
		return;

	}

	public void getSleep() {
//			return this.sleep += 2;
//			return this.potty -=2;
//			return this.eat += 2;
		return;
	}



	public String getPetName() {
		return this.petName;
	}

	public String getPetDescription() {
		return this.petDescription;
	}

}
