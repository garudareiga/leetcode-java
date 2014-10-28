package maximum_product_subarray;

/**
 * 
 * @author raychen
 * 
 * Problem:
 * Find the contiguous subarray within an array (containing at least one number) 
 * which has the largest product.
 * 
 * For example, given the array [2,3,-2,4],
 * the contiguous subarray [2,3] has the largest product = 6. 
 */ 

public class MaximumProductSubarray {
    public int maxProduct(int[] A) {
        int result = Integer.MIN_VALUE, max = 1, min = 1;
        for (int i = 0; i < A.length; i++) {
        	int prev_max = max, prev_min = min;
        	max = Math.max(A[i], Math.max(prev_max*A[i], prev_min*A[i]));
        	min = Math.min(A[i], Math.min(prev_max*A[i], prev_min*A[i]));
        	result = Math.max(result, max);
        }
        return result;
    }
}
