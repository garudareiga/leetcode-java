package search_for_a_range;

/**
 * 
 * @author raychen
 * 
 * Problem:
 * Given a sorted array of integers, find the starting and ending position of a given target value.
 * 
 * Your algorithm's runtime complexity must be in the order of O(log n).
 * 
 * If the target is not found in the array, return [-1, -1].
 * 
 * For example,
 * Given [5, 7, 7, 8, 8, 10] and target value 8,
 * return [3, 4].
 * 
 */

public class SearchForARange {
    public int[] searchRange(int[] A, int target) {
    	int[] result = {-1, -1};
    	searchRange(A, 0, A.length - 1, target, result);
    	return result;
    }
    
    public void searchRange(int[] A, int l, int r, int target, int[] result) {
    	if (l > r) return;
    	int m = (l + r)/2;
    	if (A[m] > target) {			// left half
    		searchRange(A, l, m - 1, target, result);
    	} else if (A[m] < target) {		// right half
    		searchRange(A, m + 1, r, target, result);
    	} else {						// A[mid] == target
    		result[0] = result[0] == -1 ? m : Math.min(result[0], m);
    		result[1] = result[1] == -1 ? m : Math.max(result[1], m);
    		searchRange(A, l, m - 1, target, result);
    		searchRange(A, m + 1, r, target, result);
    	}
    }
}
