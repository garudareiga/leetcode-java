package multiply_strings;

import static org.junit.Assert.*;

import org.junit.Test;

public class MultiplyStringsTest {

	@Test
	public void test() {
		String num1 = "123", num2 = "21";
		MultiplyStrings sol = new MultiplyStrings();
		String res = sol.multiply(num1, num2);
		System.out.println(num1 + "*" + num2 + " -> " + res);
		assertEquals("2583", res);
	}

}
