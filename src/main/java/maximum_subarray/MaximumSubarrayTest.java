package maximum_subarray;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaximumSubarrayTest {

	@Test
	public void test() {
		int[] A = {-2,1,-3,4,-1,2,1,-5,4};
		MaximumSubarray sol = new MaximumSubarray();
		assertEquals(6, sol.maxSubArray(A));
	}

}
