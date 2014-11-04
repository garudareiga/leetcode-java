package minimum_window_substring;

import static org.junit.Assert.*;

import org.junit.Test;

public class MinimumWindowSubstringTest {

	@Test
	public void test() {
	    String S = "ADOBECODEBANC",
	    	   T = "ABC";
	    MinimumWindowSubstring sol = new MinimumWindowSubstring();
	    assertEquals("BANC", sol.minWindow(S, T));
	}

}
