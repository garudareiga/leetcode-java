package palindrome_number;

import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromeNumberTest {

	@Test
	public void test() {
		PalindromeNumber sol = new PalindromeNumber();
		assertTrue(sol.isPalindrome(3445443));
		assertTrue(sol.isPalindrome(3));
		assertFalse(sol.isPalindrome(3445543));
	}

}
