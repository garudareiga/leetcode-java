package interleaving_string;

import static org.junit.Assert.*;

import org.junit.Test;

public class InterleavingStringTest {

    @Test
    public void test1() {
        String s1 = "aabcc";
        String s2 = "dbbca";
        String s3 = "aadbbcbcac";
        String s4 = "aadbbbaccc";
        
        InterleavingString sol = new InterleavingString();
        assertTrue(sol.isInterleave(s1, s2, s3));
        assertFalse(sol.isInterleave(s1, s2, s4));
    }

    @Test
    public void test2() {
        String s1 = "";
        String s2 = "b";
        String s3 = "b";
        
        InterleavingString sol = new InterleavingString();
        assertTrue(sol.isInterleave(s1, s2, s3));
    }
}
