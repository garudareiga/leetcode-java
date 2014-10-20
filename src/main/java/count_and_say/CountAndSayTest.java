package count_and_say;

import static org.junit.Assert.*;

import org.junit.Test;

public class CountAndSayTest {

	@Test
	public void testCountAndSay1() {
		CountAndSay sol = new CountAndSay();
		String result = sol.countAndSay(1);
		System.out.println("1 -> " + result);
		assertTrue("1".equals(result));
	}

	@Test
	public void testCountAndSay2() {
		CountAndSay sol = new CountAndSay();
		String result = sol.countAndSay(2);
		System.out.println("2 -> " + result);
		assertTrue("11".equals(result));
	}

	@Test
	public void testCountAndSay5() {
		CountAndSay sol = new CountAndSay();
		String result = sol.countAndSay(5);
		System.out.println("5 -> " + result);
		assertTrue("111221".equals(result));
	}
}
