package word_break_2;

import java.util.*;

/**
 * 
 * @author raychen
 * 
 * Problem:
 * Given a string s and a dictionary of words dict, add spaces in s to construct a sentence 
 * where each word is a valid dictionary word.
 *  
 * Return all such possible sentences.
 *  
 * For example, given
 *  
 * s = "catsanddog",
 * dict = ["cat", "cats", "and", "sand", "dog"].
 *  
 * A solution is ["cats and dog", "cat sand dog"].
 */


public class WordBreak2 {   
    /* 
     * Straight Dynamic Programming => Time Limit Exceed!
     * Check if having valid word break first, pass TLE.
     */
	ArrayList<String> wordBreak(String s, Set<String> dict) {
	    boolean[] match = new boolean[s.length() + 1];
	    match[0] = true;
	    for (int i = 1; i <= s.length(); i++) {
	        for (String word : dict) {
	            if (i >= word.length() &&
	                match[i - word.length()] &&
	                word.equals(s.substring(i - word.length(), i))) {
	                match[i] = true;
	                break;
	            }
	        }
	    }
	    if (!match[s.length()]) return new ArrayList<String>();
	    
	    ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();	    
	    for (int i = 0; i <= s.length(); i++) result.add(new ArrayList<String>());
	    result.get(0).add("");
	    for (int i = 1; i <= s.length(); i++) {
	    	if (!match[i]) continue;
 	        for (String word : dict) {
	            if (i >= word.length() &&
		            match[i - word.length()] &&
		            word.equals(s.substring(i - word.length(), i))) {	 
	                ArrayList<String> sentences = result.get(i);
	                for (String prev : result.get(i - word.length())) {
	                    String curr = prev.isEmpty() ? word : prev + " " + word;
	                    sentences.add(curr);
	                }
	            }
	        }
	    }
	    return result.get(s.length());
	}
	
	/* 
	 * Dynamic Programming Time Limite Exceed Version 
	 */
	ArrayList<String> wordBreakTLE(String s, Set<String> dict) {
	    boolean[] match = new boolean[s.length() + 1];
	    ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
	    match[0] = true;
	    for (int i = 0; i <= s.length(); i++) result.add(new ArrayList<String>());
	    result.get(0).add("");
	    for (int i = 1; i <= s.length(); i++) {
	        for (String word : dict) {
	            if (i >= word.length() &&
	                match[i - word.length()] &&
	                word.equals(s.substring(i - word.length(), i))) {
	                match[i] |= true;
	                ArrayList<String> sentences = result.get(i);
	                for (String prev : result.get(i - word.length())) {
	                    String curr = prev.isEmpty() ? word : prev + " " + word;
	                    sentences.add(curr);
	                }
	            }
	        }
	    }
	    return result.get(s.length());
	}
}
