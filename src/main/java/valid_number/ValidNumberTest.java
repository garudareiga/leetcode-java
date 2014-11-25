package valid_number;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValidNumberTest {

	@Test
	public void test() {				
		ValidNumber sol = new ValidNumber();
		assertTrue(sol.isNumber("0"));
		assertTrue(sol.isNumber(" 0.1"));
		assertFalse(sol.isNumber("abc"));
		assertFalse(sol.isNumber("1 a"));
		assertFalse(sol.isNumber("."));
		//assertTrue(sol.isNumber("2e10"));
		//assertTrue(sol.isNumber("959440.94f"));
	}

}