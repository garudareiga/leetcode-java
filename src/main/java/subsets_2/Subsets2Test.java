package subsets_2;

import static org.junit.Assert.*;
import java.util.*;

import org.junit.Test;

public class Subsets2Test {

	@Test
	public void test() {
		int[] S = {1, 2, 2};
		Subsets2 sol = new Subsets2();
		List<List<Integer>> result = sol.subsetsWithDup(S);
		for (List<Integer> array: result) {
			for (Integer v : array)
				System.out.print(v);
			System.out.println();
		}
		assertEquals(6, result.size());
	}

}
