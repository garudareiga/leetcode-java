package remove_duplicates_from_sorted_array;

import static org.junit.Assert.*;

import org.junit.Test;

public class RemoveDuplicatesFromSortedArrayTest {

	@Test
	public void test() {
		int[] array = {1, 1, 2, 3, 3};
		RemoveDuplicatesFromSortedArray sol = new RemoveDuplicatesFromSortedArray();
		int len = sol.removeDuplicates(array);
		assertEquals(len, 3);
	}

}
