package search_in_rotated_sorted_array_2;

/**
 * 
 * @author raychen
 * 
 *  Problem:
 *  Follow up for "Search in Rotated Sorted Array":
 *  What if duplicates are allowed?
 *  
 *  Would this affect the run-time complexity? How and why?
 *  
 *  Write a function to determine if a given target is in the array.
 *  
 */

public class SearchInRotatedSortedArray2 {
    /*
     * Allow duplicates -> we can not judge if sorted by A[l] <= A[mid]
     * for example 1, 2, 1 | 1, 1
     */
	
    public boolean search(int[] A, int target) {
    	/*
    	 * Runtime Complexity: O(log(n))
    	 * Space Complexity: O(1)
    	 */
    	int l = 0, r = A.length - 1, m;
    	while (l <= r) {
    		m = (l + r)/2;
    		if (A[m] == target)
    			return true;

    		if (A[l] == A[m]) {
    			l++;
    		} else if (A[r] == A[m]) {
    			r--;
    		} else if (A[l] < A[m]) {		// left half sorted
    			if (target >= A[l] && target < A[m]) 
    				r = m - 1;
    			else
    				l = m + 1;
    		} else {						// right half sorted
    			if (target > A[m] && target <= A[r])
    				l = m + 1;
    			else
    				r = m - 1;
    		}
    	}
    	return false;
    }
}