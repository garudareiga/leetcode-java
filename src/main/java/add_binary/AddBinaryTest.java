package add_binary;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddBinaryTest {

	@Test
	public void testAddBinary1() {
		String a = new String("11");
		String b = new String("1");
		AddBinary sol = new AddBinary();
		String result = sol.addBinary(a, b);
		System.out.println(a + " + " + b + " -> " + result);
		assertEquals("100", result);
	}

	@Test
	public void testAddBinary2() {
		String a = new String("1010");
		String b = new String("1011");
		AddBinary sol = new AddBinary();
		String result = sol.addBinary(a, b);
		System.out.println(a + " + " + b + " -> " + result);
		assertEquals("10101", result);
	}
	
	@Test
	public void testAddBinary3() {
		String a = new String("11010");
		String b = new String( "1011");
		AddBinary sol = new AddBinary();
		String result = sol.addBinary(a, b);
		System.out.println(a + " + " + b + " -> " + result);
		assertEquals("100101", result);
	}
	
	@Test
	public void testAddBinary4() {
		String a = new String("1");
		String b = new String("111");
		AddBinary sol = new AddBinary();
		String result = sol.addBinary(a, b);
		System.out.println(a + " + " + b + " -> " + result);
		assertEquals("1000", result);
	}
}
