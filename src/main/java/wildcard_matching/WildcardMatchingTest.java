package wildcard_matching;

import static org.junit.Assert.*;

import org.junit.Test;

public class WildcardMatchingTest {
	
	@Test
	public void test() {
		WildcardMatching sol = new WildcardMatching();
		assertFalse(sol.isMatch("aa", "a"));
		assertTrue(sol.isMatch("aa", "aa"));
		assertFalse(sol.isMatch("aaa", "aa"));
		assertTrue(sol.isMatch("aa", "*"));
		assertTrue(sol.isMatch("aa", "a*"));
		assertTrue(sol.isMatch("ab", "?*"));
		assertFalse(sol.isMatch("aab", "c*a*b*"));
		assertTrue(sol.isMatch("aba", "**a"));
	}

}
