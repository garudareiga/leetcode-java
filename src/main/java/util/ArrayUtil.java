package util;

public class ArrayUtil {
    public static void swap(int[] A, int i, int j) {
        int temp = A[i]; A[i] = A[j]; A[j] = temp;
    }
}
