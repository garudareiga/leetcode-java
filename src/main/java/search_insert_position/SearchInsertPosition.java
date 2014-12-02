package search_insert_position;

/**
 * 
 * @author raychen
 * 
 * Problem:
 * Given a sorted array and a target value, return the index if the target is found.
 * If not, return the index where it would be if it were inserted in order.
 * 
 * You may assume no duplicates in the array.
 */

public class SearchInsertPosition {
    public int searchInsert(int[] A, int target) {
    	int l = 0, r = A.length - 1;
    	while (l <= r) {
    		int m = (l + r)/2;
    		if (target < A[m]) r = m - 1;
    		else if (target > A[m]) l = m + 1;
    		else return m;
    	}
    	return l;
//    	while (l <= r) {
//    		if (target < A[l]) return l;
//    		if (target > A[r]) return r + 1;
//    		int m = (l + r)/2;
//    		if (target == A[m]) return m;
//    		else if (target > A[m]) l = m + 1;
//    		else r = m - 1;
//    	}
//    	return 0;
    }
    
    public int searchInsert_recursive(int[] A, int target) {
    	return search_insert(A, 0, A.length  - 1, target);
    }
    
    public int search_insert(int[] A, int i, int j, int target) {
        if (A[i] > target) return i;
        if (A[j] < target) return j + 1;
        
        int m = (i + j)/2;
        if (A[m] == target) return m;
        else if (A[m] > target) return search_insert(A, i, m - 1, target);
        else return search_insert(A, m + 1, j, target);
    }
}
