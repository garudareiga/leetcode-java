package median_of_two_sorted_arrays;

import java.util.*;

/**
 * 
 * @author raychen
 * 
 * Problem:
 * There are two sorted arrays A and B of size m and n respectively. 
 * Find the median of the two sorted arrays. 
 * The overall run time complexity should be O(log (m+n)).
 *
 */

public class MedianOfTwoSortedArrays {
	/*
	 * Testcase 5 is not working !!!
	 */
    public double findMedianSortedArrays(int A[], int B[]) {
    	int la = A.length, lb = B.length;
    	if (la == 0 && lb == 0) return 0;
        if (la == 0 || lb == 0) {
        	A = la == 0 ? B : A;
        	la = la == 0 ? lb : la;
        	return la%2 == 1 ?
        			A[la/2] :
        			(A[la/2 - 1] + A[la/2])/2.0;
        }
        return find_median_sorted_arrays(A, 0, B, 0, (la + lb + 1)/2);
    }

	private double find_median_sorted_arrays(int[] a, int ia, int[] b, int ib, int k) {
	    if (ia + ib == k - 1) {
	    	if ((a.length + b.length) % 2 == 1)
	    		return Math.min(a[ia], b[ib]);
	    	else 
	    		return (a[ia] + b[ib])/2.0;
	    }
	    int N = (k - ia - ib);	// remove N elements from arrays
	    if (a[ia + N/2 - 1] < b[ib + N/2 - 1]) { // remove from a 
	    	ia = ia + N/2; 
	    } else if (a[ia + N/2 - 1] > b[ib + N/2 - 1]) { // remove from b
	    	ib = ib + N/2;
	    } else {
	    	ia = ia + N/2; ib = ib + N/2;
	    }
	    return find_median_sorted_arrays(a, ia, b, ib, k);
    }   
}
