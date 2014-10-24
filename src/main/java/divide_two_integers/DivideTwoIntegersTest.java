package divide_two_integers;

import static org.junit.Assert.*;

import org.junit.Test;

public class DivideTwoIntegersTest {

    @Test
    public void test1() {
        DivideTwoIntegers sol = new DivideTwoIntegers();
        assertEquals(3, sol.divide(10, 3));
        assertEquals(20, sol.divide(100, 5));
    }
}
