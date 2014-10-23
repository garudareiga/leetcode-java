package search_for_a_range;

import static org.junit.Assert.*;

import org.junit.Test;

public class SearchForARangeTest {

	@Test
	public void test() {
		int[] A = {5, 7, 7, 8, 8, 10};
		SearchForARange sol = new SearchForARange();
		int[] result = sol.searchRange(A, 8);
		assertEquals(3, result[0]);
		assertEquals(4, result[1]);
	}

}
