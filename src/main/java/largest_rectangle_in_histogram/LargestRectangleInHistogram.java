package largest_rectangle_in_histogram;

import java.util.*;

/**
 * 
 * @author raychen
 * 
 * Problem:
 * Given n non-negative integers representing the histogram's bar height where the width
 * of each bar is 1, find the area of largest rectangle in the histogram.
 * 
 * Above is a histogram where width of each bar is 1, given height = [2,1,5,6,2,3].
 * The largest rectangle is shown in the shaded area, which has area = 10 unit.
 * 
 * For example,
 * Given height = [2,1,5,6,2,3],	
 * return 10.
 *
 */

public class LargestRectangleInHistogram {
    public int largestRectangleArea(int[] height) {
    	int[] heights = new int[height.length + 1];
    	for (int i = 0; i < height.length; i++)
    		heights[i] = height[i];
    	heights[height.length] = 0;
    	
    	int maxArea = 0;
    	Stack<Integer> stack = new Stack<Integer>();
    	for (int r = 0; r < heights.length; ) {
    		if (stack.isEmpty() || heights[r] >= heights[stack.peek()]) {
    			stack.push(r); r++;
    		} else {
				int l = stack.pop();
				maxArea = Math.max(maxArea, heights[l]*(stack.isEmpty() ? r : r - stack.peek() - 1));    			
    		}
    	}
    	return maxArea;
    }
   
    
    public int largestRectangleArea_TLE(int[] height) {
    	int result = Integer.MIN_VALUE;
        for (int i = 0; i < height.length; i++) {
        	int minHeight = Integer.MAX_VALUE;
        	for (int j = i; j < height.length; j++) {
        		// pruning
        		if (j > 0 && height[j] >= height[j - 1])
        			continue;
        		minHeight = Math.min(minHeight, height[j]);
        		result = Math.max(result, (j - i + 1)*minHeight);
        	}
        }
        return result;
    }
}
