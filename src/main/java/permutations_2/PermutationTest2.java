package permutations_2;

import static org.junit.Assert.*;

import org.junit.Test;
import java.util.*;

public class PermutationTest2 {

	@Test
	public void testPermuteUnique1() {
		Permutation2 sol = new Permutation2();
		int[] A = {1,1,2};
		ArrayList<ArrayList<Integer>> result = sol.permuteUnique(A);
		System.out.println(">>> Test 1 <<<");
		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i).toString());
		}
		assertEquals(3, result.size());
	}

	@Test
	public void testPermuteUnique2() {
		Permutation2 sol = new Permutation2();
		int[] A = {1,2,3};
		ArrayList<ArrayList<Integer>> result = sol.permuteUnique(A);
		System.out.println(">>> Test 2 <<<");
		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i).toString());
		}
		assertEquals(6, result.size());
	}
	
	@Test
	public void testPermuteUnique3() {
		Permutation2 sol = new Permutation2();
		int[] A = {-1,-1,3,-1};
		ArrayList<ArrayList<Integer>> result = sol.permuteUnique(A);
		System.out.println(">>> Test 3 <<<");
		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i).toString());
		}
		assertEquals(4, result.size());
	}
	
	@Test
	public void testPermuteUnique4() {
		Permutation2 sol = new Permutation2();
		int[] A = {2,2,1,1};
		ArrayList<ArrayList<Integer>> result = sol.permuteUnique(A);
		System.out.println(">>> Test 4 <<<");
		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i).toString());
		}
		assertEquals(6, result.size());
	}
	
	@Test
	public void testPermuteUnique5() {
		Permutation2 sol = new Permutation2();
		int[] A = {0,1,0,0,9};
		ArrayList<ArrayList<Integer>> result = sol.permuteUnique(A);
		System.out.println(">>> Test 5 <<<");
		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i).toString());
		}
		assertEquals(20, result.size());
	}
}
