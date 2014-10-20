package string_to_integer;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringToIntegerTest {

	@Test
	public void test() {
		StringToInteger sol = new StringToInteger();
		assertEquals(0, sol.atoi("+-2"));
		assertEquals(Integer.MAX_VALUE, sol.atoi("2147483648"));
		assertEquals(Integer.MAX_VALUE, sol.atoi("2147483649"));
		assertEquals(Integer.MIN_VALUE, sol.atoi("-2147483649"));
	}
}
