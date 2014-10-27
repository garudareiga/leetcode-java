package word_ladder;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashSet;

import org.junit.Test;

public class WordLadderTest {

    @Test
    public void test1() {
        String start = "hit";
        String end = "cog";
        String[] dictArray = {"hot","dot","dog","lot","log"};
        HashSet<String> dict = new HashSet<String>(Arrays.asList(dictArray));

        WordLadder sol = new WordLadder();
        assertEquals(5, sol.ladderLength(start, end, dict));
    }
    
    @Test
    public void test2() {
        String start = "hit";
        String end = "cog";
        String[] dictArray = {"hot","dot","dog","lot","log"};
        HashSet<String> dict = new HashSet<String>(Arrays.asList(dictArray));

        WordLadder sol = new WordLadder();
        assertEquals(5, sol.ladderLength_2(start, end, dict));
    }
    
    @Test
    public void test3() {
        String start = "a";
        String end = "c";
        String[] dictArray = {"a","b","c"};
        HashSet<String> dict = new HashSet<String>(Arrays.asList(dictArray));

        WordLadder sol = new WordLadder();
        assertEquals(2, sol.ladderLength_2(start, end, dict));
    }

}
