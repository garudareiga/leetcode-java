package permutation_sequence;

import static org.junit.Assert.*;

import org.junit.Test;

public class PermutationSequenceTest {

	@Test
	public void testPermute1() {
		PermutationSequence sol = new PermutationSequence();
		String result = sol.getPermutation(3, 1);
		System.out.println("result=" + result);
		assertEquals("123", result);
	}
	
	@Test
	public void testPermute2() {
		PermutationSequence sol = new PermutationSequence();
		String result = sol.getPermutation(3, 2);
		System.out.println("result=" + result);
		assertEquals("132", result);
	}
	
	@Test
	public void testPermute3() {
		PermutationSequence sol = new PermutationSequence();
		String result = sol.getPermutation(3, 3);
		System.out.println("result=" + result);
		assertEquals("213", result);
	}
}
