package remove_duplicates_from_sorted_array_2;

/*
 *  @author raychen
 * 
 *  Problem:
 *  Follow up for "Remove Duplicates":
 *  What if duplicates are allowed at most twice?
 *  
 *  For example,
 *  Given sorted array A = [1,1,1,2,2,3],
 *  
 *  Your function should return length = 5, and A is now [1,1,2,2,3].
 */

public class RemoveDuplicatesFromSortedArray2 {
    public int removeDuplicates(int[] A) {
    	/*
    	 * Runtime Complexity: O(n)
    	 * Space Complexity: O(1)
    	 */
    	if (A.length == 0)
    		return 0;
    	int occur = 2, pos = occur;
    	for (int i = occur; i < A.length; i++) {
    		if (A[i] != A[pos - occur])
    			A[pos++] = A[i];
    	}
    	return pos;
    }
}