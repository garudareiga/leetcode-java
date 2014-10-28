package find_minimum_in_rotated_sorted_array;

import static org.junit.Assert.*;

import org.junit.Test;

public class FindMinimumInRotatedSortedArrayTest {

	@Test
	public void test() {
		int[] num = {4, 5, 6, 7, 0, 1, 2};
		FindMinimumInRotatedSortedArray sol = new FindMinimumInRotatedSortedArray();
		assertEquals(0, sol.findMin(num));
	}

}
