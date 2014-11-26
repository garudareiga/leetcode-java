package implement_strStr;

/**
 * 
 * @author raychen
 * 
 * Problem:
 * Implement strStr().
 * 
 * Returns the index of the first occurrence of needle in haystack, 
 * or -1 if needle is not part of haystack.
 * 
 */

public class ImplementStrStr {
    public int strStr(String haystack, String needle) {
    	/* 
    	 * Brute-force
    	 * Time Complexity: O(n*m)
    	 */ 
    	if (haystack.isEmpty() && needle.isEmpty()) return 0;
    	int i, j;
    	for (i = 0; i < haystack.length(); i++) {
    		if (haystack.length() - i < needle.length()) break;
    		for (j = 0; j < needle.length(); j++)
    			if (haystack.charAt(i + j) != needle.charAt(j)) 
    				break;
    		if (j == needle.length()) return i;
    	}
    	return -1;
    }
}
