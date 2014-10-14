package search_in_rotated_sorted_array;

import static org.junit.Assert.*;

import org.junit.Test;

public class SearchInRotatedSortedArrayTest {

	@Test
	public void test1() {
		int[] A = { 5, 6, 1, 2, 3 };
		SearchInRotatedSortedArray sol = new SearchInRotatedSortedArray();
		assertEquals(3, sol.search(A, 2));
		assertEquals(-1, sol.search(A, 4));
	}

}
