package pow_x_n;

/**
 * 
 * @author raychen
 * Problem:
 * Implement pow(x, n)
 */

public class PowerXN {
    public double pow(double x, int n) {
        /*
         * Runtime complexity: O(log(n))
         */
    	if (n < 0) return power(1.0/x, -n);
    	else return power(x, n);
    }
    
    public double power(double x, int n) {
    	if (n == 0) return 1;
    	double v = pow(x, n/2);
    	return n%2 == 0 ? v*v : v*v*x;
    }
    
    public double powIterative1(double x, int n) {
        // Runtime Error Message:  Line 14: java.lang.NegativeArraySizeException
        // Last executed input:    0.00001, 2147483647
        // double[] result = new double[n + 1];
        
        if (n == 0) return 1.0;
        // Requested array size exceeds VM limit
        double[] result = new double[n];
        result[0] = x;
        for (int i = 1; i < n; i++) {
            double v = result[i/2];
            result[i] = (i % 2 == 0 ? v*v : v*v*x);
        }
        return result[n];
    }
    
    public double powIterative2(double x, int n) {
        if (n < 0) return powIterative2(1/x, -n);
        double result = 1.0;
        while (n > 0) {
            if ((n & 0x1) == 1) result *= x;
            x *= x;
            n >>= 1;
        }
        return result;
    }
}
