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
        int l = 1, r = x/2, last_m = l;
        while (l <= r) {
            int m = (l + r)/2;
            last_m = m;
            if (x/m > m) { l = m + 1; }
            else if (x/m < m) { r = m - 1; }
            else break;
        }
        return last_m;
    }
    
    final double precision = 0.01;
    
    public double sqrt(double x) {
        double l = 0.0, r = x/2.0, m = (l + r)/2;
        while (Math.abs(x/m - m) > precision) {
            if (x/m > m) l = m;
            else if (x/m < m) r = m;
            m = (l + r)/2;

        }
        return m;
    }
    
    public static void main(String[] args) {
        SqrtX sol = new SqrtX();
        System.out.println(sol.sqrt(8.8));
    }
}
