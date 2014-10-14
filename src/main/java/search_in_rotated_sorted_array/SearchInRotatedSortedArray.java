package search_in_rotated_sorted_array;

/**
 * 
 * @author raychen
 * 
 *  Problem:
 *  Suppose a sorted array is rotated at some pivot unknown to you beforehand.
 *  (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
 *  
 *  You are given a target value to search. If found in the array return its index, 
 *  otherwise return -1.
 *  
 *  You may assume no duplicate exists in the array.
 */

public class SearchInRotatedSortedArray {
    public int search(int[] A, int target) {
    	/*
    	 * Runtime Complexity: O(log(n))
    	 * Space Complexity: O(1)
    	 */
    	int l = 0, r = A.length - 1, m;
    	while (l <= r) {
    		m = (l + r)/2;
    		if (A[m] == target)
    			return m;
    		if (A[m] >= A[l]) {		// left-half sorted
    			if (target >= A[l] && target < A[m])
    				r = m - 1;
    			else
    				l = m + 1;
    		} else {				// right-half sorted
    			if (target > A[m] && target <= A[r])
    				l = m + 1;
    			else
    				r = m - 1;
    		}
    	}
    	return -1;
    }
}
