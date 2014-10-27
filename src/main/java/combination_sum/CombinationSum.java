package combination_sum;

/**
 * 
 * @author raychen
 * 
 * Problem
 * Given a set of candidate numbers (C) and a target number (T), find all unique 
 * combinations in C where the candidate numbers sums to T.
 * The same repeated number may be chosen from C *unlimited* number of times.
 * 
 * Note:
 * All numbers (including target) will be positive integers.
 * Elements in a combination (a1, a2, ... , ak) must be in non-descending order. (ie, a1<=a2<= ... <= ak).
 * The solution set must not contain duplicate combinations.
 * 
 * For example, given candidate set 2,3,6,7 and target 7, 
 * A solution set is: 
 * [7] 
 * [2, 2, 3]
 */

import java.util.*;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ArrayList<List<Integer> > result = new ArrayList<List<Integer> >();
        if (candidates.length == 0) return result;
        Arrays.sort(candidates);
        Stack<Integer> stack = new Stack<Integer>();
        combination_sum(0, stack, candidates, target, result);
        return result;
    }
    
    public void combination_sum(int p, Stack<Integer> stack, int[] candidates, 
    		int target, ArrayList<List<Integer> > result) {
    	if (target == 0) {
    		List<Integer> obj = new ArrayList<Integer>(stack);
    		result.add(obj);
    		return;
    	}
    	for (int i = p; i < candidates.length; i++) {
    		if (candidates[i] > target) return;		// prune
    		// Let's assume no duplicates in candidates, since each number can
    		// be chosen multiple times.
    		//if (i > 0 && candidates[i] == candidates[i - 1]) continue;
    		stack.push(candidates[i]);
    		combination_sum(i, stack, candidates, target - candidates[i], result);
    		stack.pop();
    	}
    }
}
