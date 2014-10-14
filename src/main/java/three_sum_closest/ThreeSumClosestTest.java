package three_sum_closest;

import static org.junit.Assert.*;

import org.junit.Test;

public class ThreeSumClosestTest {

	@Test
	public void test1() {
		int[] num = { -1, 2, 1, -4 };
		int target = 1;
		
		ThreeSumClosest sol = new ThreeSumClosest();
		int result = sol.threeSumClosest(num, target);
		assertEquals(2, result);
	}

}
