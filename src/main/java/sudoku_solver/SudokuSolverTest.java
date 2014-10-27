package sudoku_solver;

import static org.junit.Assert.*;

import org.junit.Test;

import valid_sudoku.ValidSudoku;

public class SudokuSolverTest {

	@Test
	public void test1() {
		char[][] board = {
			{'5','3','.','.','7','.','.','.','.'},
			{'6','.','.','1','9','5','.','.','.'},
			{'.','9','8','.','.','.','.','6','.'},
			{'8','.','.','.','6','.','.','.','3'},
			{'4','.','.','8','.','3','.','.','1'},
			{'7','.','.','.','2','.','.','.','6'},
			{'.','6','.','.','.','.','2','8','.'},
			{'.','.','.','4','1','9','.','.','5'},
			{'.','.','.','.','8','.','.','7','9'}
		};
		SudokuSolver sol = new SudokuSolver();
		sol.solveSudoku(board);
		System.out.println("----- TEST 1 -----");
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
		ValidSudoku v = new ValidSudoku();
		assertTrue(v.isValidSudoku(board));
	}
	
	@Test
	public void test2() {
		char[][] board = {
			{'.','.','9','7','4','8','.','.','.'},
			{'7','.','.','.','.','.','.','.','.'},
			{'.','2','.','1','.','9','.','.','.'},
			{'.','.','7','.','.','.','2','4','.'},
			{'.','6','4','.','1','.','5','9','.'},
			{'.','9','8','.','.','.','3','.','.'},
			{'.','.','.','8','.','3','.','2','.'},
			{'.','.','.','.','.','.','.','.','6'},
			{'.','.','.','2','7','5','9','.','.'}
		};
		SudokuSolver sol = new SudokuSolver();
		sol.solveSudoku(board);
		System.out.println("----- TEST 2 -----");
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
		ValidSudoku v = new ValidSudoku();
		assertTrue(v.isValidSudoku(board));
	}
}
