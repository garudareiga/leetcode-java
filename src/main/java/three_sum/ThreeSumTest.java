package three_sum;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.Test;

public class ThreeSumTest {

	@Test
	public void test1() {
		int[] num = { -1, 0, 1, 2, -1, -4 };
		ThreeSum sol = new ThreeSum();
		List<List<Integer>> result = sol.threeSum(num);
		for (List<Integer> items : result) {
			for (Integer item : items) {
				System.out.print(item + " ");
			}
			System.out.println();
		}
		assertEquals(2, result.size());
	}

	@Test
	public void test2() {
		int[] num = { -2, 0, 0, 2, 2 };
		ThreeSum sol = new ThreeSum();
		List<List<Integer>> result = sol.threeSum(num);
		for (List<Integer> items : result) {
			for (Integer item : items) {
				System.out.print(item + " ");
			}
			System.out.println();
		}
		assertEquals(1, result.size());
	}
	
	@Test
	public void test3() {
		int[] num = { 0, 0, 0 };
		ThreeSum sol = new ThreeSum();
		List<List<Integer>> result = sol.threeSum(num);
		for (List<Integer> items : result) {
			for (Integer item : items) {
				System.out.print(item + " ");
			}
			System.out.println();
		}
		assertEquals(1, result.size());
	}

}
