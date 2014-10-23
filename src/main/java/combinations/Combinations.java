package combinations;

/**
 * 
 * @author raychen
 * 
 * Problem
 * Given two integers n and k, return all possible combinations of k numbers out of 1 ... n.
 * 
 * For example,
 * If n = 4 and k = 2, a solution is:

	[
	  [2,4],
	  [3,4],
	  [2,3],
	  [1,2],
	  [1,3],
	  [1,4],
	]
 */

import java.util.*;

public class Combinations {
    public List<List<Integer>> combine(int n, int k) {
    	List<List<Integer>> result = new ArrayList<List<Integer>>();
    	if (k == 0 || n < k) return result;
    	Stack<Integer> stack = new Stack<Integer>();
    	combine(1, n, k, stack, result);
    	return result;
    }
    
    public void combine(int p, int n, int k, Stack<Integer> stack, List<List<Integer>> result) {
    	if (k == 0) {
    		result.add(new ArrayList<Integer>(stack));
    		return;
    	}
    	if (n - p + 1 < k) return;
    	for (int i = p; i <= n; i++) {
    		stack.push(i);
    		combine(i + 1, n, k - 1, stack, result);
    		stack.pop();
    	}
    }
}
