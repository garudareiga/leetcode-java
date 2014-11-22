package one_edit_distance;

import static org.junit.Assert.*;

import org.junit.Test;

public class OneEditDistanceTest {

    @Test
    public void test() {
        OneEditDistance sol = new OneEditDistance();
        assertTrue(sol.isOneEditDistance("abcde", "abXde"));
        assertTrue(sol.isOneEditDistance("abcde", "abcXde"));
        assertTrue(sol.isOneEditDistance("abcdeX", "abcde"));
    }

}
