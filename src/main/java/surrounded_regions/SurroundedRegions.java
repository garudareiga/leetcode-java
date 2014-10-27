package surrounded_regions;

import java.util.*;

/**
 * 
 * @author raychen
 * 
 *  Problem:
 *  Given a 2D board containing 'X' and 'O', capture all regions surrounded by 'X'.
 *  
 *  A region is captured by flipping all 'O's into 'X's in that surrounded region.
 *  
 *  For example,
 *  X X X X
 *  X O O X
 *  X X O X
 *  X O X X
 *  
 *  After running your function, the board should be:
 *  X X X X
 *  X X X X
 *  X X X X
 *  X O X X
 */

public class SurroundedRegions {
    class Position {
        int row;
        int column;
        
        public Position(int row,  int column) {
            this.row = row;
            this.column = column;
        }
    }
    
    public void solve(char[][] board) {
        if (board.length == 0 || board[0].length ==0)
            return;
        
        int nr = board.length, nc = board[0].length;
        boolean[][] flip = new boolean[nr][nc];
        for (int r = 0; r < nr; r++)
        	for (int c = 0; c < nc; c++)
        		flip[r][c] = true;
        Queue<Position> queue = new LinkedList<Position>();
        for (int r = 0; r < nr; r++)
        	for (int c = 0; c < nc; c++)
        		if ((r == 0 || c == 0 || r == nr - 1 || c == nc - 1) && board[r][c] == 'O')
        			queue.add(new Position(r, c));
        			// Recursion causes stack overflow issue! 
        			//dfs(r, c, nr, nc, flip, board);
        
        while (!queue.isEmpty()) {
        	Position p = queue.poll();
        	if (flip[p.row][p.column] == false) continue;
        	flip[p.row][p.column] = false;
        	if (p.row > 0 && board[p.row - 1][p.column] == 'O') 
        		queue.add(new Position(p.row - 1, p.column));
        	if (p.row < nr - 1 && board[p.row + 1][p.column] == 'O') 
        		queue.add(new Position(p.row + 1, p.column));
        	if (p.column > 0 && board[p.row][p.column - 1] == 'O') 
        		queue.add(new Position(p.row, p.column - 1));
        	if (p.column < nc - 1 && board[p.row][p.column + 1] == 'O') 
        		queue.add(new Position(p.row, p.column + 1));
        }
        for (int r = 0; r < nr; r++)
        	for (int c = 0; c < nc; c++) 
        		if (board[r][c] == 'O' && flip[r][c])
        			board[r][c] = 'X';
    }
    
    void dfs(int r, int c, int nr, int nc, boolean[][] flip, char[][] board) {
    	if (r < 0 || r >= nr || c < 0 || c >= nc) return;
    	if (board[r][c] == 'X' || !flip[r][c]) return;
    	flip[r][c] = false;
    	dfs(r - 1, c, nr, nc, flip, board);
    	dfs(r + 1, c, nr, nc, flip, board);
    	dfs(r, c - 1, nr, nc, flip, board);
    	dfs(r, c + 1, nr, nc, flip, board);
    }
}
