package pow_x_n;

import static org.junit.Assert.*;

import org.junit.Test;

public class PowerXNTest {

    @Test
    public void test1() {
        PowerXN sol = new PowerXN();
        sol.pow(0.00001, 2147483647);
        assertTrue(Math.abs(-51.536 - sol.pow(-2.2, 5)) < 0.001);
    }

    @Test
    public void test2() {
        PowerXN sol = new PowerXN();
        sol.pow(0.00001, 2147483647);
        assertTrue(Math.abs(-51.536 - sol.pow(-2.2, 5)) < 0.001);
    }
}
