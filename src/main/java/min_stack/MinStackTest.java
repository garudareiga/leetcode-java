package min_stack;

import static org.junit.Assert.*;

import org.junit.Test;

public class MinStackTest {

	@Test
	public void testAddBinary1() {
		String a = new String("11");
		String b = new String("1");
		MinStack sol = new MinStack();
		String result = sol.addBinary(a, b);
		System.out.println(a + " + " + b + " -> " + result);
		assertEquals("100", result);
	}

	@Test
	public void testAddBinary2() {
		String a = new String("1010");
		String b = new String("1011");
		MinStack sol = new MinStack();
		String result = sol.addBinary(a, b);
		System.out.println(a + " + " + b + " -> " + result);
		assertEquals("10101", result);
	}
	
	@Test
	public void testAddBinary3() {
		String a = new String("11010");
		String b = new String( "1011");
		MinStack sol = new MinStack();
		String result = sol.addBinary(a, b);
		System.out.println(a + " + " + b + " -> " + result);
		assertEquals("100101", result);
	}
	
	@Test
	public void testAddBinary4() {
		String a = new String("1");
		String b = new String("111");
		MinStack sol = new MinStack();
		String result = sol.addBinary(a, b);
		System.out.println(a + " + " + b + " -> " + result);
		assertEquals("1000", result);
	}
}
