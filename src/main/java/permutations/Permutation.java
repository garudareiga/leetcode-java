package permutations;

/**
 * 
 * @author raychen
 * 
 *	Problem:
 *	Given a collection of numbers, return all possible permutations.
 *	For example,
 *	[1,2,3] have the following permutations:
 *	[1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], and [3,2,1].
 */

import java.util.*;

public class Permutation {
	
    public ArrayList<ArrayList<Integer>> permute(int[] num) {
    	ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        permute(num, 0, result);
        return result;
    } 
    
    protected void permute(int[] num, int p, ArrayList<ArrayList<Integer>> result) {
    	if (p == num.length) {
    		ArrayList<Integer> perm = new ArrayList<Integer>();
    		for (int v : num) perm.add(v);
    		result.add(perm);
    		return;
    	}
    	for (int q = p; q < num.length; q++) {
    		swap(num, p, q);
    		permute(num, p + 1, result);
    		swap(num, p, q);
    	}
    }
    
    protected void swap(int[] num, int i, int j) {
    	int tmp = num[i]; num[i] = num[j]; num[j] = tmp;
    }

}
