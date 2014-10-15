package single_number;

import static org.junit.Assert.*;

import org.junit.Test;

public class SingleNumberTest {

    @Test
    public void test() {
        int[] A = {1, 3, 6, 6, 1, 2, 3};
        
        SingleNumber sol = new SingleNumber();
        assertEquals(2, sol.singleNumber(A));
    }

}
