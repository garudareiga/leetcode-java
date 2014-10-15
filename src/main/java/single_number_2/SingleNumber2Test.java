package single_number_2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SingleNumber2Test {
    private single_number_2.SingleNumber2 sol = null;
    
    @Before
    public void setUp() {
        sol = new SingleNumber2();
    }
    
    @Test
    public void test1() {
        int[] A = {1, 3, 6, 1, 6, 3, 6, 1, 2, 3};
        assertEquals(2, sol.singleNumber(A));
    }

    @Test
    public void test2() {
        int[] B = {-2,-2,1,1,-3,1,-3,-3,-4,-2};
        assertEquals(-4, sol.singleNumber(B));
    }
}
