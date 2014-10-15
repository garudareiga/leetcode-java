package climbing_stairs;

/**
 * 
 * @author raychen
 * 
 *  Problem:
 *  You are climbing a stair case. It takes n steps to reach to the top.
 *  
 *  Each time you can either climb 1 or 2 steps. In how many distinct ways 
 *  can you climb to the top?
 *  
 */

public class ClimbingStairs {
    public int climbStairs(int n) {
    	/*
    	 * Runtime Complexity: O(n)
    	 * Space Complexity: O(1)
    	 */
    	int prev = 0, curr = 1;
    	for (int i = 0; i < n; i++) {
    		int temp = curr;
    		curr += prev;
    		prev = temp; 		
    	}
    	return curr;
    }
}
