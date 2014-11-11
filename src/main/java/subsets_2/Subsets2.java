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
        return subsetsWithDupRecursive(S);
    }
    
	public List<List<Integer>> subsetsWithDupItertive(int[] S) {
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
	
	public List<List<Integer>> subsetsWithDupRecursive(int[] S) {
	    List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (S.length == 0) return result;
        Arrays.sort(S);
        Stack<Integer> stack = new Stack<Integer>();
        subsetsWithDupRecursive(S, 0, stack, result);
        return result;
	}

    private void subsetsWithDupRecursive(int[] S, int pos, Stack<Integer> stack,
            List<List<Integer>> result) {
        result.add(new ArrayList<Integer>(stack));
        for (int i = pos; i < S.length; i++) {
            if (i > pos && S[i] == S[i - 1]) continue;
            stack.push(S[i]);
            subsetsWithDupRecursive(S, i + 1, stack, result);
            stack.pop();
        }
    }
	        
}