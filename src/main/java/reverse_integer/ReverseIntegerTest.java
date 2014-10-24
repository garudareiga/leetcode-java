package reverse_integer;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseIntegerTest {

    @Test
    public void test() {
        ReverseInteger sol = new ReverseInteger();
        assertEquals(-321, sol.reverse(-123));
    }

}
