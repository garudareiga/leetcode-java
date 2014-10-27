package combination_sum_2;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.*;

public class CombinationSumTest2 {

	@Test
	public void testCombinationSum() {
		int[] A = {10,1,2,7,6,1,5};
		CombinationSum2 sol = new CombinationSum2();
		List<List<Integer>> result = sol.combinationSum2(A, 8);
		for (List<Integer> combination : result)
			System.out.println(combination.toString());
		assertEquals(4, result.size());
	}

}
