package substring_with_concatenation_of_all_words;

import java.util.*;

/**
 * 
 * @author raychen
 * 
 * Problem:
 * You are given a string, S, and a list of words, L, that are all of 
 * the same length. Find all starting indices of substring(s) in S that 
 * is a concatenation of each word in L exactly once and without any 
 * intervening characters.

	For example, given:
	S: "barfoothefoobarman"
	L: ["foo", "bar"]

 * You should return the indices: [0,9].
 * (order does not matter).
 */ 

public class SubstringWithConcatenationOfAllWords {
    public List<Integer> findSubstring(String S, String[] L) {
        List<Integer> result = new ArrayList<Integer>();
        if (S.isEmpty() || L.length == 0) return result;
        
        HashMap<String, Integer> wordsToFound = new HashMap<String, Integer>();
        HashMap<String, Integer> wordsHasFound = new HashMap<String, Integer>();
        for (String str : L) {
        	if (!wordsToFound.containsKey(str))
        		wordsToFound.put(str, 1);
        	else
        		wordsToFound.put(str, wordsToFound.get(str) + 1);
        }
        
        int wordLen = L[0].length();
        int totalLen = L.length*wordLen;
        for (int i = 0; i <= S.length() - totalLen; i++) {
        	boolean violation = false;
        	if (!wordsHasFound.isEmpty()) wordsHasFound.clear();
        	for (int j = i; j < i + totalLen; j += wordLen) {
        		String substr = S.substring(j, j + wordLen);
        		if (!wordsToFound.containsKey(substr) ||
        			(wordsHasFound.containsKey(substr) && 
        			 wordsToFound.get(substr) == wordsHasFound.get(substr))) {
        			violation = true;
        			break;
        		}
        		if (!wordsHasFound.containsKey(substr))
        			wordsHasFound.put(substr, 1);
        		else
        			wordsHasFound.put(substr, wordsHasFound.get(substr) + 1);
        	}
        	if (!violation) result.add(i);
        }
        return result;
    }
}
