package permutations_2;

/**
 * 
 * @author raychen
 * 
 *	Problem:
 *	Given a collection of numbers that might contain duplicates, return all possible unique permutations.
 *	For example,
 *	[1,1,2] have the following unique permutations:
 *	[1,1,2], [1,2,1], and [2,1,1].
 */

import java.util.*;

public class Permutation2 {
    public ArrayList<ArrayList<Integer>> permuteUnique(int[] num) {
        /*
         * Runtime Complexity: O(n!)
         * Space Complexity: O(1)
         */
    	ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        permuteUnique(num, 0, result);
        return result;
    } 
    
    protected void permuteUnique(int[] num, int p, ArrayList<ArrayList<Integer>> result) {
    	if (p == num.length) {
    		ArrayList<Integer> perm = new ArrayList<Integer>();
    		for (int v : num) perm.add(v);
    		result.add(perm);
    		return;
    	}
    	for (int q = p; q < num.length; q++) {
    		if (containDuplicate(num, p, q)) continue; // or we can sort first
    		swap(num, p, q);
    		permuteUnique(num, p + 1, result);
    		swap(num, p, q);
    	}
    }
    
    protected void swap(int[] num, int i, int j) {
    	int tmp = num[i]; num[i] = num[j]; num[j] = tmp;
    }
    
    boolean containDuplicate(int[] num, int i, int j) {
    	for (int k = i; k < j; k++)
    		if (num[j] == num[k])
    			return true;
    	return false;
    }
}
