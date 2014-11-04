package minimum_window_substring;

import java.util.*;

/**
 * 
 * @author raychen
 * 
 * Problem:
 * Given a string S and a string T, find the minimum window in S which will 
 * contain all the characters in T in complexity O(n).
 * 
 * For example,
    S = "ADOBECODEBANC"
    T = "ABC"
    Minimum window is "BANC".

 * Note:
 * If there is no such window in S that covers all characters in T, return 
 * the emtpy string "".
 * 
 * If there are multiple such windows, you are guaranteed that there will 
 * always be only one unique minimum window in S.
 */ 

public class MinimumWindowSubstring {
    public String minWindow(String S, String T) {
    	int slen = S.length(), tlen = T.length();
    	int[] needToFound = new int[256];
    	int[] hasFound = new int[256];
    	
    	for (int i = 0; i < T.length(); i++)
    		needToFound[T.charAt(i)]++;
    	
    	int matchCount = 0;
    	int lw = 0, rw, minLen = Integer.MAX_VALUE;
    	String result = "";
    	for (rw = 0; rw < slen; rw++) {
    		char rc = S.charAt(rw);
    		if (needToFound[rc] == 0) continue;
			hasFound[rc]++;
			if (hasFound[rc] <= needToFound[rc])
				matchCount++;
			if (matchCount == tlen) {				
				// find a window, then shrink lw
				while (true) {
					char lc = S.charAt(lw);
					if (needToFound[lc] > 0 &&
						hasFound[lc] == needToFound[lc])
						break;
					hasFound[lc]--;
					lw++;
				}
				if (minLen > rw - lw + 1) {
					minLen = rw - lw + 1;
					result = S.substring(lw, rw + 1);
				}
			}   		
    	}
    	return result;
    }
}
