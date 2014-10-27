package two_sum;

import static org.junit.Assert.*;

import org.junit.Test;

public class TwoSumTest {

	@Test
	public void test1() {
		int[] numbers = { 3, 2, 4 };
		TwoSum sol = new TwoSum();
		int[] result = sol.twoSum(numbers, 6);
		assertEquals(2, result[0]);
		assertEquals(3, result[1]);
	}

	@Test
	public void test2() {
		int[] numbers = { 0, 1, 4, 0};
		TwoSum sol = new TwoSum();
		int[] result = sol.twoSum(numbers, 0);
		assertEquals(1, result[0]);
		assertEquals(4, result[1]);
	}

	   @Test
	    public void test3() {
	        int[] numbers = { 3, 2, 4 };
	        TwoSum sol = new TwoSum();
	        int[] result = sol.twoSumHash(numbers, 6);
	        assertEquals(2, result[0]);
	        assertEquals(3, result[1]);
	    }

	    @Test
	    public void test4() {
	        int[] numbers = { 0, 1, 4, 0};
	        TwoSum sol = new TwoSum();
	        int[] result = sol.twoSumHash(numbers, 0);
	        assertEquals(1, result[0]);
	        assertEquals(4, result[1]);
	    }
}
