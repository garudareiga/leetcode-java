package trapping_rain_water;

/**
 * 
 * @author raychen
 * 
 *	Problem:
 *	Given n non-negative integers representing an elevation map where the width of each bar is 1, 
 *	compute how much water it is able to trap after raining.
 *	For example, 
 *	Given [0,1,0,2,1,0,1,3,2,1,2,1], return 6.
 */

public class TrappingRainWater {
	public int trap(int[] A) {
		/*
		 * For each bar, find the maximum height at the left and right side. 
		 * The water trapped by this bar is min(max_left, max_right) - height.
		 * Time Complexity O(n)
		 * Space Complexity O(n)
		 */
		int currMaxLeft = 0, currMaxRight = 0, waterTrapped = 0;
		
		int[] maxLeft = new int[A.length];
		for (int i = 0; i < A.length; i++) {
			currMaxLeft = Math.max(currMaxLeft, A[i]);
			maxLeft[i] = currMaxLeft;
		}
		for (int i = A.length - 1; i >= 0; i--) {
			currMaxRight = Math.max(currMaxRight, A[i]);
			int height = Math.min(maxLeft[i], currMaxRight);
			if (height > A[i])
				waterTrapped += height - A[i];
		}
		return waterTrapped;
	}
}
