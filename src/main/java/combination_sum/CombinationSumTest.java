package combination_sum;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.*;

public class CombinationSumTest {

	@Test
	public void testCombinationSum1() {
		CombinationSum sol = new CombinationSum();
		int[] A = {2,3,6,7};
		List<List<Integer>> result = sol.combinationSum(A, 7);
		for (List<Integer> combination : result)
			System.out.println(combination.toString());
		assertEquals(2, result.size());
	}
	
	@Test
	public void testCombinationSum2() {
		CombinationSum sol = new CombinationSum();
		int[] A = {2,3,3,6,7};
		List<List<Integer>> result = sol.combinationSum(A, 7);
		for (List<Integer> combination : result)
			System.out.println(combination.toString());
		assertEquals(2, result.size());
	}

}
