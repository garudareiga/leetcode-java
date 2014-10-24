package container_with_most_water;

/**
 * 
 * @author raychen
 * 
 * Problem
 * Given n non-negative integers a1, a2, ..., an, where each represents 
 * a point at coordinate (i, ai). n vertical lines are drawn such that 
 * the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, 
 * which together with x-axis forms a container, such that the container 
 * contains the most water.
 * 
 * Note: You may not slant the container.
 */

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        if (height.length == 0) return 0;
        int maxArea = 0, l = 0, r = height.length - 1;
        while (l < r) {
        	maxArea = Math.max(maxArea, Math.min(height[l], height[r])*(r - l));
        	if (height[l] <= height[r])
        		l++;
        	else
        		r--;
        }
        return maxArea;
    }
}
