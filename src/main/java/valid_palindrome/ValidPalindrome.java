package valid_palindrome;

/**
 * 
 * @author raychen
 * 
 *  Problem:
 *  Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 *  
 *  For example,
 *  "A man, a plan, a canal: Panama" is a palindrome.
 *  "race a car" is not a palindrome.
 *  
 *  Note:
 *  Have you consider that the string might be empty? This is a good question to ask during an interview.
 *  For the purpose of this problem, we define empty string as valid palindrome.
 */

public class ValidPalindrome {
	public boolean isPalindrome(String s) { 
		if (s.isEmpty()) return true;
		s = s.toLowerCase();
		int i = 0, j = s.length() - 1;
		while (i < j) {
			char a = s.charAt(i), b = s.charAt(j);
			if (!Character.isLetterOrDigit(a) == false) i++;
			else if (!Character.isLetterOrDigit(b)) j--;
			else {
			    if (a != b) return false;
				i++; j--;
			}
		}
		return true;
	}
}
