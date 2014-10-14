package four_sum;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.Test;

public class FourSumTest {

	@Test
	public void test1() {
		int[] num = {1,0,-1,0,-2,2};
		FourSum sol = new FourSum();
		List<List<Integer>> result = sol.fourSum(num, 0);
		for (List<Integer> items : result) {
			for (Integer item : items) {
				System.out.print(item + " ");
			}
			System.out.println();
		}
		assertEquals(3, result.size());
	}

	@Test
	public void test2() {
		int[] num = {0,0,0,0};
		FourSum sol = new FourSum();
		List<List<Integer>> result = sol.fourSum(num, 0);
		for (List<Integer> items : result) {
			for (Integer item : items) {
				System.out.print(item + " ");
			}
			System.out.println();
		}
		assertEquals(1, result.size());
	}

}
