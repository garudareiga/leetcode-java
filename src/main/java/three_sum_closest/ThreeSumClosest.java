package three_sum_closest;

import java.util.*;

/**
 * 
 * @author raychen
 * 
 * Problem
 * Given an array S of n integers, find three integers in S such that the sum is 
 * closest to a given number, target. Return the sum of the three integers. You may 
 * assume that each input would have exactly one solution.
 * 
 * For example, given array S = {-1 2 1 -4}, and target = 1.
 * The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 * 
 */

public class ThreeSumClosest {
	public int threeSumClosest(int[] num, int target) {
    	/*
    	 * Runtime Complexity: O(n^2)
    	 * Space Complexity: O(1)
    	 */
		int closetSum = 0, minDist = Integer.MAX_VALUE;
		Arrays.sort(num);
		for (int k = 0; k < num.length - 2; k++) {
			for (int i = k + 1, j = num.length - 1; i < j; ) {
				int currSum = num[i] + num[k] + num[j];
				if (minDist >  Math.abs(target - currSum)) {
					minDist = Math.abs(target - currSum);
					closetSum = currSum;
				}
				
				if (currSum < target) {
					i++;
				} else if (currSum > target) {
					j--;
				} else {
					break;
				}
			}
		}
		return closetSum;
	}	
}