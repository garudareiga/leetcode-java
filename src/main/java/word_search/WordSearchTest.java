package word_search;

import static org.junit.Assert.*;

import org.junit.Test;


public class WordSearchTest {

    @Test
    public void test() {
    	char[][] board = {
    		{'A', 'B', 'C', 'D'},
    		{'S', 'F', 'C', 'S'},
    		{'A', 'D', 'E', 'E'}
    	};
    	WordSearch sol = new WordSearch();
    	assertTrue(sol.exist(board, "ABCCED"));
    	assertTrue(sol.exist(board, "SEE"));
    	assertFalse(sol.exist(board, "ABCB"));
    }

}
