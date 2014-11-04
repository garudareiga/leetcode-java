package text_justification;

import java.util.*;

/**
 * 
 * @author raychen
 * 
 * Problem:
 * Given an array of words and a length L, format the text such that 
 * each line has exactly L characters and is fully (left and right) justified.
 * 
 * You should pack your words in a greedy approach; that is, pack as many 
 * words as you can in each line. Pad extra spaces ' ' when necessary so 
 * that each line has exactly L characters.
 * 
 * Extra spaces between words should be distributed as evenly as possible. 
 * If the number of spaces on a line do not divide evenly between words, 
 * the empty slots on the left will be assigned more spaces than the slots 
 * on the right.
 * 
 * For the last line of text, it should be left justified and no extra space 
 * is inserted between words.

	For example,
	words: ["This", "is", "an", "example", "of", "text", "justification."]
	L: 16.
	
	Return the formatted lines as:
	[
	   "This    is    an",
	   "example  of text",
	   "justification.  "
	]
	
 * Note: Each word is guaranteed not to exceed L in length.
 * 
 * click to show corner cases.
 * 
 * Corner Cases: A line other than the last line might contain only one word. 
 * What should you do in this case? In this case, that line should be left-justified.
 */

public class TextJustification {
    public List<String> fullJustify(String[] words, int L) {
    	List<String> result = new ArrayList<String>();
    	if (words.length == 0) return result;
    	full_justify(words, 0, L, result);
    	return result;
    }
    
    void full_justify(String[] words, int p, int L, List<String> result) {
    	if (p == words.length) return;
    	
    	int q, len = words[p].length();
    	for (q = p + 1; q < words.length; q++) {
    		if (len + words[q].length() + 1 > L)
    			break;
    		len += words[q].length() + 1;
    	}
    	
    	// current line [p, q), then justify
    	StringBuilder sb = new StringBuilder();
    	if (q == words.length) { // last line
    		for (int i = p; i < q - 1; i++) sb.append(words[i] + " ");
    		sb.append(words[q - 1]);
    	} else {
	    	if (q - p == 1) { // only one word in the current line
	    		sb.append(words[p]);	    		
	    	} else {
	        	len = 0;
	        	for (int i = p; i < q; i++) len += words[i].length();
	        	int spaceLen = (L - len) / (q - p - 1),
	        	    extraSpaceNum = (L - len) % (q - p - 1);
	        	for (int i = 1; i<= q - p - 1; i++) {
	        		sb.append(words[p + i - 1]);
	        		for (int j = 0; j < spaceLen; j++)
	        			sb.append(' ');
	        		if (i <= extraSpaceNum)
	        			sb.append(' ');
	        	}
	        	sb.append(words[q - 1]);
	    	}
    	}
    	while (sb.length() < L) sb.append(' ');
    	result.add(sb.toString());
    	full_justify(words, q, L, result);
    }
}
