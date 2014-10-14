package search_in_rotated_sorted_array_2;

import static org.junit.Assert.*;

import org.junit.Test;

public class SearchInRotatedSortedArray2Test {

	@Test
	public void test1() {
		int[] A = { 1, 2, 3, 1, 1 };
		SearchInRotatedSortedArray2 sol = new SearchInRotatedSortedArray2();
		assertTrue(sol.search(A, 3));
		assertFalse(sol.search(A, 4));
	}

}
