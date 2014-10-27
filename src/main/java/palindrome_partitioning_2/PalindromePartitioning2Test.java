package palindrome_partitioning_2;

import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromePartitioning2Test {

    @Test
    public void test1() {
        String s = new String("aab");
        PalindromePartitioning2 sol = new PalindromePartitioning2();
        assertEquals(1, sol.minCut(s));
    }
    
    @Test
    public void test2() {
        String s = new String("acccca");
        PalindromePartitioning2 sol = new PalindromePartitioning2();
        assertEquals(0, sol.minCut(s));
    }

    @Test
    public void test3() {
        String s = new String("bacccca");
        PalindromePartitioning2 sol = new PalindromePartitioning2();
        assertEquals(1, sol.minCut(s));
    }
    
    @Test
    public void test4() {       
        String s = new String("abaacccca");
        PalindromePartitioning2 sol = new PalindromePartitioning2();
        assertEquals(1, sol.minCut(s));
    }
}
