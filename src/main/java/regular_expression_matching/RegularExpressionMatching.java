package regular_expression_matching;

/**
 * 
 * @author raychen
 * 
 * Problem:
 * Implement regular expression matching with support for '.' and '*'.
 * 
 * '.' Matches any single character.
 * '*' Matches zero or more of the preceding element.
 * 
 * The matching should cover the entire input string (not partial).
 * 
 * The function prototype should be:
    bool isMatch(const char *s, const char *p)
    
    Some examples:
    isMatch("aa","a")  false
    isMatch("aa","aa")  true
    isMatch("aaa","aa")  false
    isMatch("aa", "a*") true
    isMatch("aa", ".*") true
    isMatch("ab", ".*") true
    isMatch("aab", "c*a*b") true
 *
 */

public class RegularExpressionMatching {
    public boolean isMatch(String s, String p) {
    	return isMatch(s, 0, p, 0);
        //return isMatchDP(s, p);
    }
    
    public boolean isMatch(String s, int is, String p, int ip) {
        /*
         * Time complexity: O(n)
         * Space complexity: O(1)
         */
        int slen = s.length(), plen = p.length();
        if (ip == plen) return is == slen;
        if (is == slen) return plen - ip >= 2 && p.charAt(ip + 1) == '*' && isMatch(s, is, p, ip + 2);
         
        if (plen - ip >= 2 && p.charAt(ip + 1) == '*') {
            // The next sub-pattern has '*'
            if (isMatch(s, is, p, ip + 2)) return true;
            if (s.charAt(is) == p.charAt(ip) || p.charAt(ip) == '.') return isMatch(s, is + 1, p, ip); 
            return false;
        } else {
            // The next sub-pattern doesn't have '*'
            return (s.charAt(is) == p.charAt(ip) || p.charAt(ip) == '.') && isMatch(s, is + 1, p, ip + 1);
        }
    }
    
    public boolean isMatchDP(String s, String p) {
        if (p.isEmpty()) return s.isEmpty();
        int slen = s.length(), plen = p.length();
        boolean[][] match = new boolean[slen + 1][plen + 1];
        match[0][0] = true;
        for (int ip = 1; ip <= plen; ip++) {
            if (p.charAt(ip - 1) == '*')
                match[0][ip] = match[0][ip - 2];
        }
        for (int is = 1; is <= slen; is++) {
            for (int ip = 1; ip <= plen; ip++) {
                if (p.charAt(ip - 1) != '*') {
                    match[is][ip] = (p.charAt(ip - 1) == s.charAt(is - 1) || p.charAt(ip - 1) == '.') &&
                        match[is - 1][ip - 1];
                } else { 
                    // Skip * pattern
                    match[is][ip] |= match[is][ip - 2];
                    // Use * pattern
                    if (p.charAt(ip - 2) == '.' || p.charAt(ip - 2) == s.charAt(is - 1))
                        match[is][ip] |= match[is - 1][ip];
                }
            }
        }
        return match[slen][plen];
    }
}
