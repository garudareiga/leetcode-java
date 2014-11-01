package sqrt_x;

/**
 * 
 * @author raychen
 * 
 * Problem:
 * Implement int sqrt(int x).
 * 
 * Compute and return the square root of x.
 */

public class SqrtX {
    public int sqrt(int x) {
        if (x < 2) return x;
        int l = 1, r = x/2;
        while (l <= r) {
            int m = (l + r)/2;
            if (x/m > m) { l = m + 1; }
            else if (x/m < m) { r = m - 1; }
            else return m;
        }
        return (l + r)/2;
    }
}
