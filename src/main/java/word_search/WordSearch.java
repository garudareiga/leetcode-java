package word_search;

/**
 * 
 * @author raychen
 * 
 * Problem:
 * Given a 2D board and a word, find if the word exists in the grid.
 * 
 * The word can be constructed from letters of sequentially adjacent cell, where "adjacent" cells 
 * are those horizontally or vertically neighboring. The same letter cell may not be used more than once.
 * 
 * For example,
 * Given board =
	[
	  ["ABCE"],
	  ["SFCS"],
	  ["ADEE"]
	]
 * word = "ABCCED", -> returns true,
 * word = "SEE", -> returns true,
 * word = "ABCB", -> returns false.
 */

public class WordSearch {
    public boolean exist(char[][] board, String word) {
    	if (board.length == 0 || board[0].length == 0 || word.isEmpty()) return false;
    	int nr = board.length, nc = board[0].length;
    	boolean[][] visited = new boolean[nr][nc];
    	for (int r = 0; r < nr; r++) {
    		for (int c = 0; c < nc; c++) {   			
    			if (exist(r, c, 0, board, word, visited)) 
    				return true;
    		}
    	}
    	return false;
    }
    
    public boolean exist(int r, int c, int p, char[][] board, String word, boolean[][] visited) {
    	if (p == word.length()) return true;
    	if (r < 0 || 
    		r >= board.length || 
    		c < 0 || 
    		c >= board[0].length ||
    		visited[r][c] || 
    		board[r][c] != word.charAt(p))
    		return false;
    	visited[r][c] = true;
    	boolean ret = exist(r + 1, c, p + 1, board, word, visited) ||
    			exist(r - 1, c, p + 1, board, word, visited) ||
    			exist(r, c + 1, p + 1, board, word, visited) ||
    			exist(r, c - 1, p + 1, board, word, visited);
    	visited[r][c] = false;	// Reset visited
    	return ret;
    }
}
