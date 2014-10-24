package jump_game_2;

/**
 * 
 * @author raychen
 * 
 * Problem:
 * Given an array of non-negative integers, you are initially positioned at the first index of the array.
 * Each element in the array represents your maximum jump length at that position.
 * 
 * Your goal is to reach the last index in the minimum number of jumps.
 * For example:
   Given array A = [2,3,1,1,4]

   The minimum number of jumps to reach the last index is 2. 
   (Jump 1 step from index 0 to 1, then 3 steps to the last index.)
 *
 */

public class JumpGame2 {
	public int jump(int[] A) {
		if (A.length <= 1) return 0;
		// interval [l, r]
		int step = 0, l = 0, r = 0, prev_r;
		while (l <= r) {
			++step;
			prev_r = r;
			for (int i = l; i <= prev_r; i++) {
				r = Math.max(i + A[i], r);
				if (r >= A.length - 1)
					return step;
			}
			l = prev_r + 1;
		}
		return 0;
	}  
}
