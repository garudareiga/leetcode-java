package word_ladder_2;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.Test;

public class WordLadder2Test {

    @Test
    public void test1() {
        String start = "hit";
        String end = "cog";
        String[] dictArray = {"hot","dot","dog","lot","log"};
        HashSet<String> dict = new HashSet<String>(Arrays.asList(dictArray));

        WordLadder2 sol = new WordLadder2();
        List<List<String>> result = sol.findLadders(start, end, dict);
        System.out.println(">>> TEST 1 <<<");
        for (List<String> strs : result) System.out.println(strs.toString());
        assertEquals(2, result.size());
    }

    @Test
    public void test2() {
        String start = "red";
        String end = "tax";
        String[] dictArray = {"ted","tex","red","tax","tad","den","rex","pee"};
        HashSet<String> dict = new HashSet<String>(Arrays.asList(dictArray));

        WordLadder2 sol = new WordLadder2();
        List<List<String>> result = sol.findLadders(start, end, dict);
        System.out.println(">>> TEST 2 <<<");
        for (List<String> strs : result) System.out.println(strs.toString());
        assertEquals(3, result.size());
    }
    
    @Test
    public void test3() {
        String start = "hot";
        String end = "dog";
        String[] dictArray = {"hot","dog"};
        HashSet<String> dict = new HashSet<String>(Arrays.asList(dictArray));

        WordLadder2 sol = new WordLadder2();
        List<List<String>> result = sol.findLadders(start, end, dict);
        System.out.println(">>> TEST 3 <<<");
        for (List<String> strs : result) System.out.println(strs.toString());
        assertEquals(0, result.size());
    }
}
