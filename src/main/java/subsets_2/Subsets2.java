package subsets_2;

import java.util.*;

/**
 * 
 * @author raychen
 * 
 * Problem:
 * Given a collection of integers that might contain duplicates, S, 
 * return all possible subsets.
 * 
 * Note:
 * Elements in a subset must be in non-descending order.
 * The solution set must not contain duplicate subsets.
 * For example,
 * If S = [1,2,2], a solution is:

	[
	  [2],
	  [1],
	  [1,2,2],
	  [2,2],
	  [1,2],
	  []
	]
 */

public class Subsets2 {
	public List<List<Integer>> subsetsWithDup(int[] S) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if (S.length == 0) return result;
		Arrays.sort(S);
		result.add(new ArrayList<Integer>());
		int prevSize = 0, currSize, start;
		for (int i = 0; i < S.length; i++) {
			currSize = result.size();
			start = (i > 0 && S[i] == S[i - 1]) ? prevSize : 0;
			for (int j = start; j < currSize; j++) {
				ArrayList<Integer> subset = new ArrayList<Integer>(result.get(j));
				subset.add(S[i]);
				result.add(subset);
			}
			prevSize = currSize;
		}
		return result;
	}
}