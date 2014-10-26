package regular_expression_matching;

import static org.junit.Assert.*;

import org.junit.Test;

public class RegularExpressionMatchingTest {

	@Test
	public void test1() {
		RegularExpressionMatching sol = new RegularExpressionMatching();
		assertFalse(sol.isMatch("ab", ".*c"));
	}

	@Test
    public void test2() {
        RegularExpressionMatching sol = new RegularExpressionMatching();
        assertTrue(sol.isMatch("aaa", "a*a"));
    }
	
   @Test
    public void test3() {
        RegularExpressionMatching sol = new RegularExpressionMatching();
        assertTrue(sol.isMatch("aab", "c*a*b"));
    }
   
   @Test
   public void test4() {
       RegularExpressionMatching sol = new RegularExpressionMatching();
       assertFalse(sol.isMatch("aaa", "ab*a"));
   }
   
   @Test
   public void test5() {
       RegularExpressionMatching sol = new RegularExpressionMatching();
       assertFalse(sol.isMatch("aaa", "aaaa"));
   }
}
