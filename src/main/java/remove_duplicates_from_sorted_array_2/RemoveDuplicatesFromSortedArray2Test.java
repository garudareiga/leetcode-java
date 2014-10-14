package remove_duplicates_from_sorted_array_2;

import static org.junit.Assert.*;

import org.junit.Test;

public class RemoveDuplicatesFromSortedArray2Test {

	@Test
	public void test() {
		int A[] = {1,1,1,2,2,3,3,3};
		RemoveDuplicatesFromSortedArray2 sol = new RemoveDuplicatesFromSortedArray2();
		int len = sol.removeDuplicates(A);
		for (int i = 0; i < len; i++) {
			System.out.print(A[i] + " ");
		}
		System.out.println();
		assertEquals(6, len);
	}
	
}
