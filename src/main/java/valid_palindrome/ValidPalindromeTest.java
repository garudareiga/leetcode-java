package valid_palindrome;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValidPalindromeTest {

    @Test
    public void test() {
        String str1 = new String("A man, a plan, a canal: Panama");
        String str2 = new String("race a car");
        String str3 = new String("1a2");
        ValidPalindrome sol = new ValidPalindrome();
        assertTrue(sol.isPalindrome(str1));
        assertFalse(sol.isPalindrome(str2));
        assertFalse(sol.isPalindrome(str3));
    }

}
