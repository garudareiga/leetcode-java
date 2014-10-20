package length_of_last_word;

/**
 * 
 * @author raychen
 * 
 * Problem:
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', 
 * return the length of last word in the string.
 * 
 * If the last word does not exist, return 0.
 * Note: A word is defined as a character sequence consists of non-space characters only.
 * 
 * For example, 
 * Given s = "Hello World",
 * return 5.
 * 
 */

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String[] strs = s.trim().split(" ");
        for (int i = strs.length - 1; i >= 0; i--) {
        	if ("".equals(strs[i]) == false)
        		return strs[i].length();
        }
        return 0;
    }
}
