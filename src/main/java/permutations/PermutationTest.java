package permutations;

import static org.junit.Assert.*;

import org.junit.Test;
import java.util.*;

public class PermutationTest {

	@Test
	public void testPermute1() {
		Permutation sol = new Permutation();
		int[] A = {1,2,3};
		ArrayList<ArrayList<Integer>> result = sol.permute(A);
		System.out.println(">>> Test 1 <<<");
		for (ArrayList<Integer> perm : result)
			System.out.println(perm.toString());
		assertEquals(6, result.size());
	}
}
