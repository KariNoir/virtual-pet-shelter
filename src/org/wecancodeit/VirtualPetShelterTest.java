package org.wecancodeit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VirtualPetShelterTest {
	VirtualPetShelter underTest = new VirtualPetShelter(10, 10, 10, 10);

	@Test
	public void giveWaterToAllPets(Integer getDrinkAll) {
		int beforeWater = underTest.getDrinkAll();
		int result = underTest.getDrinkAll();
		underTest.getDrinkAll(); 
		assertEquals(getDrinkAll, result);
	}
	
	@Test
	public void playWithAllPets() {
		int beforeplay = underTest.playWithAllPets();
		int result = underTest.playWithAllPets();
		assertEquals(playWithAllPets, result);
	}
//		@Test
//		public void playWithAllPet() {
//			// act
//			int beforePlay = underTest.getBoredom();
//			underTest.play(); // void - just eats
//			int result = underTest.getBoredom();
//			// assert
//			assertEquals(beforePlay - 1, result);
//		}
//		@Test
//		public void boredomShouldIncreaseBy1AfterTick() {
//			// Act
//			int beforePlay = underTest.getBoredom();
//			underTest.tick();
//			int result = underTest.getBoredom();
//			assertEquals(beforePlay + 1, result);
		}
		
	}
}

//	@Test
//	public void eatShouldBe10AtStart() {
//		// act
//		int result = underTest.forEat(); //
//		assertEquals(10, result);
//
//	}
//
//	@Test
//	public void sleepShouldBe10AtStart() {
//		// act
//		int result = underTest.forSleep(); //
//		assertEquals(10, result);
//	}
//
//	@Test
//	public void funShouldBe10AtStart() {
//		// act
//		int result = underTest.forFun(); //
//		assertEquals(10, result);
//	}
//	@Test
//	public void waterShouldBe10AtStart() {
//		// act
//		int result = underTest.forDrink(); //
//		assertEquals(10, result);