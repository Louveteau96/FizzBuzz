package fizzbuzz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {
	private FizzBuzz fb;

	@BeforeEach
	void setUp() throws Exception {
		fb = new FizzBuzz();
	}

	@Test
	void fizzbuzz_repond_1_pour_1() {
		assertEquals("1",fb.fizzbuzz(1));
	}
	
	@Test
	void fizzbuzz_repond_2_pour_2() {
		assertEquals("2",fb.fizzbuzz(2));
	}
	
	@Test
	void fizzbuzz_repond_3_pour_3() {
		assertEquals("fizz",fb.fizzbuzz(3));
	}
	
	@Test
	void fizzbuzz_repond_un_entier() {
		assertEquals("4",fb.fizzbuzz(4));
		assertEquals("7",fb.fizzbuzz(7));
		assertEquals("13",fb.fizzbuzz(13));
	}
	
	@Test
	void fizzbuzz_repond_buzz() {
		assertEquals("buzz",fb.fizzbuzz(5));
		
	}
	
	@Test
	void fizzbuzz_repond_correctement_pour_un_multiple() {
		assertEquals("fizz",fb.fizzbuzz(6));
		assertEquals("buzz",fb.fizzbuzz(400));
	}
	
	@Test
	void fizzbuzz_repond_fizzbuzz() {
		assertEquals("fizzbuzz",fb.fizzbuzz(15));
	}

}
