package median_of_two_sorted_arrays;

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
     * Time Complexity: O(m + n)
     */
    public double findMedianSortedArrays(int A[], int B[]) {
        int alen = A.length, blen = B.length, total = alen + blen;
        if (alen == 0 && blen == 0) return 0.0;
        return total % 2 == 0 ?
                (findKth(A, 0, B, 0, total/2) + findKth(A, 0, B, 0, total/2 + 1))/2.0 :
                findKth(A, 0, B, 0, (total + 1)/2);
    }

    private int findKth(int[] A, int ia, int[] B, int ib, int k) {
        int alen = A.length, blen = B.length;
        // A always has more elements left to check
        if (alen - ia < blen - ib) return findKth(B, ib, A, ia, k);
        if (ib == blen) return A[ia + k - 1];
        else if (k == 1) return Math.min(A[ia], B[ib]);
        // delete k/2 elements
        int iia = ia + k/2,
            iib = Math.min(ib + k - k/2, blen);
        if (A[iia - 1] < B[iib - 1]) return findKth(A, iia, B, ib, k - (iia - ia));
        else if (A[iia - 1] > B[iib - 1]) return findKth(A, ia, B, iib, k - (iib -ib));
        return A[iia - 1];
    }  
}
