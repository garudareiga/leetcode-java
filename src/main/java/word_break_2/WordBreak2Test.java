package word_break_2;

import static org.junit.Assert.*;

import org.junit.Test;
import java.util.*;

public class WordBreak2Test {

    @Test
    public void test() {
        String s = new String("catsanddog");
        String[] dictArray = {"cat", "cats", "and", "sand", "dog"};
        HashSet<String> dict = new HashSet<String>(Arrays.asList(dictArray));
        
        WordBreak2 sol = new WordBreak2();
        ArrayList<String> results = sol.wordBreak(s, dict);
        for (String item : results) {
            System.out.println(item);
        }
        assertEquals("cat sand dog", results.get(0));
        assertEquals("cats and dog", results.get(1));
    }

}
