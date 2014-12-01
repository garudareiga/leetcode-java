package three_sum;

import java.util.*;

/**
 * 
 * @author raychen
 * 
 * Problem
 * Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0 ?
 * Find all unique triplets in the array which gives the sum of zero.
 * 
 * Note:
 * Elements in a triplet (a,b,c) must be in non-descending order. (ie, a <= b <= c)
 * The solution set must not contain duplicate triplets.
 * For example, given array S = {-1 0 1 2 -1 -4},
 * 
 * A solution set is:
 * (-1, 0, 1)
 * (-1, -1, 2)
 */

public class ThreeSum {
	public List<List<Integer>> threeSum(int[] num) {
    	/*
    	 * Runtime Complexity: O(n^2)
    	 * Space Complexity: O(1)
    	 */
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if (num.length < 3)
			return result;
		
		Arrays.sort(num);
		for (int k = 0; k < num.length; k++) {
		    if (k > 0 && num[k] == num[k - 1]) continue;
		    for (int i = k + 1, j = num.length - 1; i < j; ) {
		        if (i > k + 1 && num[i] == num[i - 1]) { i++; continue; }
		        if (j < num.length - 1 && num[j] == num[j + 1]) { j--; continue; }
		        int sum = num[k] + num[i] + num[j];
		        if (sum < 0) i++;
		        else if (sum > 0) j--;
		        else {
                  ArrayList<Integer> triple = new ArrayList<Integer>();
                  triple.add(num[k]);
                  triple.add(num[i]);
                  triple.add(num[j]);
                  result.add(triple);     
                  i++;
                  j--;		            
		        }
		    }
		}
		return result;
//		HashSet<ArrayList<Integer>> hs = new HashSet<ArrayList<Integer>>();
//		for (int k = 0; k < num.length - 2; k++) {
//		    if (k > 0 && num[k] == num[k - 1]) continue;
//			for (int i = k + 1, j = num.length - 1; i < j; ) {
//				int sum = num[k] + num[i] + num[j];
//				if (sum < 0) {
//					i++;
//				} else if (sum > 0) {
//					j--;
//				} else {
//					ArrayList<Integer> triple = new ArrayList<Integer>();
//					triple.add(num[k]);
//					triple.add(num[i]);
//					triple.add(num[j]);
//					hs.add(triple);		
//					i++;
//					j--;
//				}
//			}
//		}
//		result.addAll(hs);
//		return result;
	}
}
