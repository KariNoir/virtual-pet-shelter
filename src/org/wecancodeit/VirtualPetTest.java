package org.wecancodeit;

import static org.junit.Assert.assertThat;

import java.util.Collection;

import static org.hamcrest.CoreMatchers.is;

import org.junit.Before;
import org.junit.jupiter.api.Test;



class VirtualPetTest {
	
	Shelter underTest;
	ShelterPet pet1;
	ShelterPet pet2;
	ShelterPet pet3;
	
	@Before
	public void setUp() {
		underTest = new Shelter();
			pet1 = new ShelterPet(1, "Thor", "Dog: Brown and friendly");
			pet2 = new ShelterPet(2, "Cotton", "Cat: Fat and Fluffy");
			pet3 = new ShelterPet(3, "Red", "Turtle: green and mean");
			
	}
	
	@Test
	public void shouldBeAbleToAddPet() {
		underTest.add(pet1);
		ShelterPet retrievedPet = underTest.findPet("Thor");
		assertThat(retrievedPet, is(pet1));

}
	
	@Test
	public void shouldBeAbleToAddTwoPets() {
		underTest.add(pet1);
		underTest.add(pet2);
		Collection<ShelterPet> allPets = underTest.getAllPets();
		assertThat(allPets, contains(pet1,pet2));
	}
		@Test
	public void adoptAPet() {
			underTest.add(pet1);
			underTest.close(pet1);
			ShelterPet retrievedPet = underTest.findPet(pet1.getPetName());
			assertThat(retrievedPet, is(nullValue()));
		}	
		@Test
		public void shouldAdopt() {
		
		underTest.add(pet1);
		underTest.withdraw(pet1.getPetName(), "petName");
		
		
}
private Object contains(ShelterPet pet12, ShelterPet pet22) {
	
		return null;
	}

private void assertThat(Collection<ShelterPet> allPets, Object object) {
		// TODO Auto-generated method stub
		
	}

//
//	private void assertThat(ShelterPet retrievedPet, Object object) {
//	}
//
	private Object is(ShelterPet account12) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
}
	
	
	
////arrange	
//	VirtualPet underTest = new VirtualPet(10, 10, 10, 10); // calling default constructor
//
//	@Test
//	public void eatShouldBe10AtStart() {
//		// act
//		int result = underTest.forEat(); // makes a method in VP class
//		// assert
//		assertEquals(10, result);
//	}
//
//	@Test
//	public void sleepShouldBe10AtStart() {
//		// act
//		int result = underTest.forSleep(); // makes a method in VP class
//		// assert
//		assertEquals(10, result);
//	}
//
//	@Test
//	public void funShouldBe10AtStart() {
//		// act
//		int result = underTest.forFun(); // makes a method in VP class
//		// assert
//		assertEquals(10, result);
//	}
//
//	@Test
//	public void pottyShouldBe10AtStart() {
//		// act
//		int result = underTest.forPotty(); // makes a method in VP class
//		// assert
//		assertEquals(10, result);
//	}
//
//	@Test
//	public void eatShouldIncreaseBy1AfterEat() {
//		// act
//		int afterEat = underTest.forEat();
//		underTest.forEat(); // void - just eats
//		int result = underTest.forEat();
//		// assert
//		assertEquals(afterEat, result);
//	}
//	
//	@Test
//	public void eatShouldIncreaseBy1AfterEat() {
//		// act
//		int afterEat = underTest.forEat();
//		underTest.forEat(); // void - just eats
//		int result = underTest.forEat();
//		// assert
//		assertEquals(afterEat, result);
//	}
//	@Test
//	public void eatShouldIncreaseBy1AfterEat() {
//		// act
//		int afterEat = underTest.forEat();
//		underTest.forEat(); // void - just eats
//		int result = underTest.forEat();
//		// assert
//		assertEquals(afterEat, result);
//	}
	
	
	
	
}