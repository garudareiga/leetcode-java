package maximum_product_subarray;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MaximumProductSubarrayTest {
	MaximumProductSubarray sol = null;
	
	@Before
	public void setUp() throws Exception {
		sol = new MaximumProductSubarray();
	}

	@Test
	public void test1() {
		int[] A = {2,3,-2,4};
		assertEquals(6, sol.maxProduct(A));
	}
	
	@Test
	public void test2() {
		int[] A = {-2,3,-4};
		assertEquals(24, sol.maxProduct(A));
	}
	
	@Test
	public void test3() {
		int[] A = {-2,-3,7};
		assertEquals(42, sol.maxProduct(A));
	}
	
	@Test
	public void test4() {
		int[] A = {-4,-3,-2};
		assertEquals(12, sol.maxProduct(A));
	}

	@Test
	public void test5() {
		int[] A = {0,-20,0,0};
		assertEquals(0, sol.maxProduct(A));
	}
}
