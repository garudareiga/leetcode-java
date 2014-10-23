package subsets;

import java.util.*;

/**
 * 
 * @author raychen
 * 
 * Problem:
 * Given a set of distinct integers, S, return all possible subsets.
 * 
 * Note:
 * Elements in a subset must be in non-descending order.
 * The solution set must not contain duplicate subsets.
 * For example,
 * If S = [1,2,3], a solution is:

	[
	  [3],
	  [1],
	  [2],
	  [1,2,3],
	  [1,3],
	  [2,3],
	  [1,2],
	  []
	]
 *
 */

public class Subsets {
	public List<List<Integer>> subsets(int[] S) {
		/*
		 * Iterative solution
		 * Time complexity: O(n^2)
		 * Space complexity: O(1)
		 */
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if (S.length == 0) return result;
		Arrays.sort(S);
		result.add(new ArrayList<Integer>());
		for (int i = 0; i < S.length; i++) {
			int size = result.size();
			for (int j = 0; j < size; j++) {
				List<Integer> subset = new ArrayList<Integer>(result.get(j));
				subset.add(S[i]);
				result.add(subset);
			}
		}
		return result;
	}
	
	public List<List<Integer>> subsetsRecursive(int[] S) {
		/*
		 * Recursive solution
		 * Time complexity: O(n^2)
		 * Space complexity: O(1)
		 */		
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if (S.length == 0) return result;
		Arrays.sort(S);
		Stack<Integer> subset = new Stack<Integer>();
		subsets_recursive(S, 0, subset, result);
		return result;
	}
	
	public void subsets_recursive(int[] S, int pos, Stack<Integer> subset, List<List<Integer>> result) {
		if (pos == S.length) {
			result.add(new ArrayList<Integer>(subset));
			return;
		}
		// Skip S[pos]
		subsets_recursive(S, pos + 1, subset, result);
		// Include S[pos]
		subset.push(S[pos]);
		subsets_recursive(S, pos + 1, subset, result);
		subset.pop();
	}
}