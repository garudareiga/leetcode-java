package divide_two_integers;

/**
 * 
 * @author raychen
 * 
 * Problem:
 * Divide two integers without using multiplication, division and mod operator.
 */

public class DivideTwoIntegers {
    public int divide(int dividend, int divisor) {
    	long a = Math.abs((long)dividend);
    	long b = Math.abs((long)divisor);
    	boolean negative = ((dividend ^ divisor) < 0);
    	int result = 0;
    	while (a >= b) {
    		long c = b;
    		for (int i = 0; a >= c; ++i, c<<=1) {
    			a -= c; result += 1<<i;
    		}
    	}
    	return negative ? -result : result;
    }
}
