package four_sum;

import java.util.*;

/**
 * 
 * @author raychen
 * 
 * Problem
 * Given an array S of n integers, are there elements a, b, c, and d in S such 
 * that a + b + c + d = target? Find all unique quadruplets in the array which 
 * gives the sum of target.
 * 
 * Note:
 * Elements in a quadruplet (a,b,c,d) must be in non-descending order. (ie, a <= b <= c <= d)
 * The solution set must not contain duplicate quadruplets.
 * For example, given array S = {1 0 -1 0 -2 2}, and target = 0.
 * A solution set is:
 * (-1,  0, 0, 1)
 * (-2, -1, 1, 2)
 * (-2,  0, 0, 2)
 */

public class FourSum {
    public List<List<Integer>> fourSum(int[] num, int target) {
    	/*
    	 * Runtime Complexity: O(n^3)
    	 * Space Complexity: O(1)
    	 */
    	List<List<Integer>> result = new ArrayList<List<Integer>>();
    	if (num.length < 4)
    		return result;
    	
    	Arrays.sort(num);
    	HashSet<ArrayList<Integer>> hs = new HashSet<ArrayList<Integer>>();
    	for (int k1 = 0; k1 < num.length; k1++) {
    		for (int k2 = k1 + 1; k2 < num.length; k2++) {
    			for (int i = k2 + 1, j = num.length - 1; i < j; ) {
    				int sum = num[k1] + num[k2] + num[i] + num[j];
    				if (sum < target) {
    					i++;
    				} else if (sum > target) {
    					j--;
    				} else {
    					ArrayList<Integer> quadruplet = new ArrayList<Integer>();
    					quadruplet.add(num[k1]);
    					quadruplet.add(num[k2]);
    					quadruplet.add(num[i]);
    					quadruplet.add(num[j]);
    					hs.add(quadruplet);
    					i++;
    					j--;
    				}
    			}
    		}
    	}
    	result.addAll(hs);
    	return result;
    }
}
