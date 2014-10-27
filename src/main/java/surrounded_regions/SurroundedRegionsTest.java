package surrounded_regions;

import org.junit.Test;

public class SurroundedRegionsTest {

    @Test
    public void test1() {
        char[][] board = {{'X','X','X','X'}, 
                          {'X','O','O','X'},
                          {'X','X','O','X'},
                          {'X','O','X','X'}};
        
        System.out.println(">>>--- Test 1 ---<<<");
        System.out.println("Before:");
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {
                System.out.print(String.format("%c,", board[r][c]));
            }
            System.out.println();
        }
        
        SurroundedRegions sol = new SurroundedRegions();
        sol.solve(board);
        
        System.out.println("After:");
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {
                System.out.print(String.format("%c,", board[r][c]));
            }
            System.out.println();
        }
    }

    @Test
    public void test2() {
        char[][] board = {{'O','X','X','O','X'}, 
                          {'X','O','O','X','O'},
                          {'X','O','X','O','X'},
                          {'O','X','O','O','O'},
                          {'X','X','O','X','O'}};
        
        System.out.println(">>>--- Test 2 ---<<<");
        System.out.println("Before:");
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {
                System.out.print(String.format("%c,", board[r][c]));
            }
            System.out.println();
        }
        
        SurroundedRegions sol = new SurroundedRegions();
        sol.solve(board);
        
        System.out.println("After:");
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {
                System.out.print(String.format("%c,", board[r][c]));
            }
            System.out.println();
        }
    }
    
    @Test
    public void test3() {
        char[][] board = {{'X','O','X','O','X','O'}, 
        				  {'O','X','O','X','O','X'},
        				  {'X','O','X','O','X','O'}, 
        				  {'O','X','O','X','O','X'},
                   		 };
        
        System.out.println(">>>--- Test 3 ---<<<");
        System.out.println("Before:");
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {
                System.out.print(String.format("%c,", board[r][c]));
            }
            System.out.println();
        }
        
        SurroundedRegions sol = new SurroundedRegions();
        sol.solve(board);
        
        System.out.println("After:");
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {
                System.out.print(String.format("%c,", board[r][c]));
            }
            System.out.println();
        }
    }   
    
}
