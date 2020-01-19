import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class VirtualPetTest {
//arrange	
	VirtualPet underTest = new VirtualPet(10, 10, 10, 10); // calling default constructor

	@Test
	public void eatShouldBe10AtStart() {
		// act
		int result = underTest.forEat(); // makes a method in VP class
		// assert
		assertEquals(10, result);
	}

	@Test
	public void sleepShouldBe10AtStart() {
		// act
		int result = underTest.forSleep(); // makes a method in VP class
		// assert
		assertEquals(10, result);
	}

	@Test
	public void funShouldBe10AtStart() {
		// act
		int result = underTest.forFun(); // makes a method in VP class
		// assert
		assertEquals(10, result);
	}

	@Test
	public void pottyShouldBe10AtStart() {
		// act
		int result = underTest.forPotty(); // makes a method in VP class
		// assert
		assertEquals(10, result);
	}

@Test
public void eatShouldIncreaseBy1AfterEat() {
	// act
	int afterEat = underTest.forEat();
	//underTest.forEat(); // void - just eats
	int result = underTest.forEat();
	// assert
	assertEquals(afterEat, result);
}
}