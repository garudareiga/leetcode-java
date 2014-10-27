package combination_sum_2;

/**
 * 
 * @author raychen
 * 
 * Problem
 * Given a collection of candidate numbers (C) and a target number (T), find all unique combinations 
 * in C where the candidate numbers sums to T.
 * 
 * Each number in C may only be used *once* in the combination.
 * 
 * Note:
 * All numbers (including target) will be positive integers.
 * Elements in a combination (a1, a2, ... , ak) must be in non-descending order. (ie, a1 <= a2 <= ... <= ak).
 * The solution set must not contain duplicate combinations.
 * For example, given candidate set 10,1,2,7,6,1,5 and target 8, 
 * A solution set is: 
	[1, 7] 
	[1, 2, 5] 
	[2, 6] 
	[1, 1, 6] 
 */

import java.util.*;

public class CombinationSum2 {
    public List<List<Integer>> combinationSum2(int[] num, int target) {
        ArrayList<List<Integer> > result = new ArrayList<List<Integer> >();
        if (num.length == 0) return result;
        Arrays.sort(num);
        Stack<Integer> stack = new Stack<Integer>();
        combination_sum(0, stack, num, target, result);
        return result;
    }
    
    public void combination_sum(int p, Stack<Integer> stack, int[] num, 
    		int target, ArrayList<List<Integer> > result) {
    	if (target == 0) {
    		List<Integer> obj = new ArrayList<Integer>(stack);
    		result.add(obj);
    		return;
    	}
    	for (int i = p; i < num.length; i++) {
    		if (num[i] > target) return; // prune
    		if (i > p && num[i] == num[i - 1]) continue;
    		stack.push(num[i]);
    		combination_sum(i + 1, stack, num, target - num[i], result);
    		stack.pop();
    	}
    }
}
