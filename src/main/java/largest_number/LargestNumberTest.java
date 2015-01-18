package largest_number;

import static org.junit.Assert.*;

import org.junit.Test;

public class LargestNumberTest {

    @Test
    public void test() {
        int[] num = {3, 30, 34, 5, 9};
        LargestNumber ln = new LargestNumber();
        assertEquals("9534330", ln.largestNumber(num));
    }

}
