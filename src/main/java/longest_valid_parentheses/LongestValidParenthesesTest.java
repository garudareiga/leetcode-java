package longest_valid_parentheses;

import static org.junit.Assert.*;

import org.junit.Test;

public class LongestValidParenthesesTest {

	@Test
	public void test() {
		LongestValidParentheses sol = new LongestValidParentheses();
		assertEquals(2, sol.longestValidParentheses("()"));
	}

}
