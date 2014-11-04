package wildcard_matching;

/**
 * 
 * @author raychen
 * 
 * Problem:
 * Implement wildcard pattern matching with support for '?' and '*'.

	'?' Matches any single character.
	'*' Matches any sequence of characters (including the empty sequence).

 * The matching should cover the entire input string (not partial).

 * The function prototype should be:
	bool isMatch(const char *s, const char *p)

	Some examples:
	isMatch("aa","a") -> false
	isMatch("aa","aa") -> true
	isMatch("aaa","aa") -> false
	isMatch("aa", "*") -> true
	isMatch("aa", "a*") -> true
	isMatch("ab", "?*") -> true
	isMatch("aab", "c*a*b") -> false
 *	
 */	

public class WildcardMatching {
    public boolean isMatch(String s, String p) {
    	/*
    	 * Using greedy algorithm
    	 */
    	int slen = s.length(), plen = p.length(), is = 0, ip = 0; 
        int mp = -1;  
        int ms = -1;  
        while (is < slen) {  
            if (ip < plen && (p.charAt(ip) == '?' || p.charAt(ip) == s.charAt(is))) {  
                ++is;
                ++ip;  
            } else if (ip < plen && p.charAt(ip) == '*') {  
            	while (ip < plen && p.charAt(ip) == '*')
            		ip++;
            	if (ip == plen) return true;
                mp = ip;  
                ms = is;  
            } else if (mp != -1) {  
                ip = mp;  
                is = ++ms;  
            } else 
                return false;  
        }  
        while (ip < p.length() && p.charAt(ip) == '*') 
            ++ip;   
        return ip == p.length();  
    }
}
