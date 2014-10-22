package merge_sorted_array;

/**
 * 
 * @author raychen
 * 
 * Problem:
 * Given two sorted integer arrays A and B, merge B into A as one sorted array.
 * 
 * Note:
 * You may assume that A has enough space (size that is greater or equal to m + n) 
 * to hold additional elements from B. 
 * The number of elements initialized in A and B are m and n respectively.
 */

public class MergeSortedArray {
    public void merge(int A[], int m, int B[], int n) {
    	int ia = m - 1, ib = n - 1, icurr = m + n - 1;
    	while (ia >= 0 && ib >= 0)
    		A[icurr--] = A[ia] >= B[ib] ? A[ia--] : B[ib--];
    	while (ib >= 0) 
    		A[icurr--] = B[ib--];
    }
}
