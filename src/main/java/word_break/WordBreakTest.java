package word_break;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.Test;


public class WordBreakTest {

    @Test
    public void test() {
        String s = new String("leetcode");
        Set<String> dict = new HashSet<String>();
        dict.add("leet");
        dict.add("code");
        
        WordBreak sol = new WordBreak();
        assertEquals(true, sol.wordBreak(s, dict));
    }

}
