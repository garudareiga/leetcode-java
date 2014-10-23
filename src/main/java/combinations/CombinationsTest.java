package combinations;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.*;

public class CombinationsTest {

	@Test
	public void testCombinationSum() {
		Combinations sol = new Combinations();
		List<List<Integer>> result = sol.combine(4, 2);
		for (List<Integer> combination : result)
			System.out.println(combination.toString());
		assertEquals(6, result.size());
	}

}
