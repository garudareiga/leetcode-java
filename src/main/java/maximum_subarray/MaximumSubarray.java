package maximum_subarray;

/**
 * 
 * @author raychen
 * 
 *  Problem:
 *  Find the contiguous subarray within an array (containing at least one
 *  number) which has the largest sum.
 *  For example, given the array [-2,1,-3,4,-1,2,1,-5,4]
 *  the contiguous subarray [4,-1,2,1] has the largest sum = 6.
 *  
 *  If you have figured out the O(n) solution, try coding another solution
 *  using the divide and conquer approach, which is more subtle.
 */

public class MaximumSubarray {
    public int maxSubArray(int[] A) {
    	/* 
    	 * Time Complexity: O(n) 
    	 * Space Complexity: O(1)
    	 */
    	if (A.length == 0) return 0;
    	// sum: the maximum sum of subarray ending at i
    	int result = Integer.MIN_VALUE, sum = 0;
    	for (int i = 0; i < A.length; i++) {
    		sum = Math.max(sum + A[i], A[i]);
    		result = Math.max(result, sum);
    	}
    	return result;
    }
        
    /*
     * The maximum sun can be in the left half, or in the right half,
     * or across the mid of the array.
     */   
    public int max_subarray_divide_and_conquer(int[] A) {
        return max_subarray_divide_and_conquer_(A, 0, A.length - 1);
    }
    
    public int max_subarray_divide_and_conquer_(int[] A, int i, int j) {
        if (i > j) 
            return Integer.MIN_VALUE;
        
        int mid = (i + j)/2;
        int leftMax = max_subarray_divide_and_conquer_(A, i, mid - 1);
        int rightMax = max_subarray_divide_and_conquer_(A, mid + 1, j);
        
        int mlmax = Integer.MIN_VALUE, mlsum = 0;
        for (int k = mid; k >= i; k--) {
            mlsum += A[k];
            mlmax = Math.max(mlmax, mlsum);
        }
        
        int mrmax = Integer.MIN_VALUE, mrsum = 0;
        for (int k = mid; k <= j; k++) {
            mrsum += A[k];
            mrmax = Math.max(mrmax, mrsum);
        }
        
        int result = A[mid];
        result = Math.max(result, mlmax);
        result = Math.max(result, mrmax);
        result = Math.max(result, mlmax + mrmax - A[mid]);
        result = Math.max(result, leftMax);
        result = Math.max(result, rightMax);
        return result;
    }
}
