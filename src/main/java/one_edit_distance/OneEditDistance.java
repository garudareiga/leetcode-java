package one_edit_distance;

/**
 * 
 * @author raychen
 * 
 * Problem:
 * Given two strings S and T, determine if they are both one edit distance apart.
 */ 

public class OneEditDistance {
    public boolean isOneEditDistance(String s, String t) {
        /*
         * Runtime Complexity: O(n)
         * Space Complexity: O(1)
         */
        int slen = s.length(), tlen = t.length();
        if (slen < tlen) return isOneEditDistance(t, s);
        if (slen - tlen > 1) return false;
        int p = 0;
        while (p < tlen && s.charAt(p) == t.charAt(p)) p++;
        if (p == tlen) return true;
        int i, j;
        if (slen == tlen) { i = j = p + 1; }
        else { i = p + 1; j = p; }
        while (j < tlen && s.charAt(i) == t.charAt(j)) { i++; j++; }
        return j == tlen;
        
// Previous solution: clean code but less runtime optimized        
//        if (slen == tlen) {
//            for (int i = 0; i < slen; i++)
//                if ((s.substring(0, i) + s.substring(i + 1)).
//                    equals(t.substring(0, i) + t.substring(i + 1))) 
//                    return true;
//        } else {
//            for (int i = 0; i < slen; i++)
//                if (t.equals(s.substring(0, i) + s.substring(i + 1)))
//                    return true;
//        }
//        return false;
    }
}