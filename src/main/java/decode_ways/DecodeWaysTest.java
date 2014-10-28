package decode_ways;

import static org.junit.Assert.*;

import org.junit.Test;

public class DecodeWaysTest {

    @Test
    public void test1() {
        DecodeWays sol = new DecodeWays();
        assertEquals(2, sol.numDecodings("12"));
    }

    @Test
    public void test2() {
        DecodeWays sol = new DecodeWays();
        assertEquals(1, sol.numDecodings("10"));
    }
    
    @Test
    public void test3() {
        DecodeWays sol = new DecodeWays();
        assertEquals(1, sol.numDecodings("101"));
    }
    
    @Test
    public void test4() {
        DecodeWays sol = new DecodeWays();
        assertEquals(0, sol.numDecodings("0"));
    }
}
