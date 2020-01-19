import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class VirtualPetTest {
	
VirtualPet underTest = new VirtualPet(10, 10, 10, 10); // calling default constructor

@Test
public void eatShouldBe10AtStart() {
	// act
	int result = underTest.fedPet(); // makes a method in VP class
	// assert
	assertEquals(0, result);
}
//@Test
//public void hungerShouldDecreaseBy1AfterEat() {
//	// act
//	int beforeEat = underTest.getHunger();
//	underTest.eat(); // void - just eats
//	int result = underTest.getHunger();
//	// assert
//	assertEquals(beforeEat - 1, result);
//}
@Test
public void thirstShouldBe0AtStart() {
	// act
	int result = underTest.getThirst(); // makes a method in VP2 class
	// assert
	assertEquals(0, result);
}
}