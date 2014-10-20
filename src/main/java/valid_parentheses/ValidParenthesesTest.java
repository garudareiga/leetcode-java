package valid_parentheses;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValidParenthesesTest {

	@Test
	public void test() {
		ValidParentheses sol = new ValidParentheses();
		assertTrue(sol.isValid("()"));
		assertTrue(sol.isValid("([])"));
	}

}
