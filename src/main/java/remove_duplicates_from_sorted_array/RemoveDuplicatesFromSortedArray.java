package remove_duplicates_from_sorted_array;

/*
 *  @author raychen
 * 
 *  Problem:
 *  Given a sorted array, remove the duplicates in place such that each element appear 
 *  only once and return the new length. Do not allocate extra space for another array, 
 *  you must do this in place with constant memory.
 *  
 *  For example,
 *  Given input array A = [1,1,2],
 *  Your function should return length = 2, and A is now [1,2].
 *  
 */

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] A) {
    	/*
    	 * Runtime Complexity: O(n)
    	 * Space Complexity: O(1)
    	 */
    	if (A.length == 0)
    		return 0;
    	int occur = 1, pos = occur;
    	for (int i = occur; i < A.length; i++) {
    		if (A[i] != A[pos - occur])
    			A[pos++] = A[i];
    	}
    	return pos;
    }
}
