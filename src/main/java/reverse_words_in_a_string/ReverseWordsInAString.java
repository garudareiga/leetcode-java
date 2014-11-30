package reverse_words_in_a_string;

import java.util.ArrayList;
import java.util.Collections;

import com.google.common.base.Joiner;

/**
 * 
 * @author raychen
 * 
 * Problem:
 * Given an input string, reverse the string word by word.
 * 
 * For example,
 * Given s = "the sky is blue",
 * return "blue is sky the".
 * 
 * What constitutes a word?
 * A sequence of non-space characters constitutes a word.
 * 
 * Could the input string contain leading or trailing spaces?
 * Yes. However, your reversed string should not contain leading or trailing spaces.
 * 
 * How about multiple spaces between two words?
 * Reduce them to a single space in the reversed string.
 * 
 * Follow up:
 * 1)
 * If the input string does not contain leading or trailing spaces and the words are
 * seperated by a single space, could you do it in-place without allocating extra space?
 * 
 * 2)
 * Rotate a sentence to the right by k characters without allocating extra space
 * For example, s = "the sky is blue" and k = 6,
 * the result is "s bluethe skey i"
 */

public class ReverseWordsInAString {
    public String reverseWords(String s) {
        s = s.trim();
        if (s.isEmpty()) return s;
    	ArrayList<String> array = new ArrayList<String>();
        int r = s.length();
        for (int l = s.length() - 1; l >= 0; l--) {
        	if (s.charAt(l) == ' ') r = l;
        	else if (l == 0 || s.charAt(l - 1) == ' ') array.add(s.substring(l, r));
        }
        return Joiner.on(' ').join(array);
    }
    
    public void reverseWords(char[] s) {
    	// Reverse in place
    	if (s.length == 0) return;
    	reverse(s, 0, s.length - 1);
    	int l = 0;
    	for (int r = 0; r < s.length; r++) {
    		if (s[r] == ' ') l = r + 1;
    		else if (r == s.length - 1 || s[r + 1] == ' ') reverse(s, l, r);
    	}
    }
    
    public void reverseWordsSpecial(char[] s) {
    	// Reverse in place, if not leading/tailing space, seprated by one single space
    	if (s.length == 0) return;
    	reverse(s, 0, s.length - 1);
    	for (int i = 0, j = 0; j <= s.length; j++) {
    		if (j == s.length || s[j] == ' ') {
    			reverse(s, i, j - 1);
    			i = j + 1;
    		}
    	}
    }

	private void reverse(char[] s, int lo, int hi) {
		while (lo < hi) { char t = s[lo]; s[lo] = s[hi]; s[hi] = t; lo++; hi--; } 
	}
}
