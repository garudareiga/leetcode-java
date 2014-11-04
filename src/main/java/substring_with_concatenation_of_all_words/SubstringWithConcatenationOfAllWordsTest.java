package substring_with_concatenation_of_all_words;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.*;

public class SubstringWithConcatenationOfAllWordsTest {

	@Test
	public void test1() {
		String S = "barfoothefoobarman";
		String[] L = {"foo", "bar"};
		SubstringWithConcatenationOfAllWords sol = new SubstringWithConcatenationOfAllWords();
		List<Integer> result = sol.findSubstring(S, L);
		for (Integer v : result) 
			System.out.println(v);
		assertEquals(2, result.size());
	}
	
	@Test
	public void test2() {
		String S = "lingmindraboofooowingdingbarrwingmonkeypoundcake";
		String[] L = {"fooo","barr","wing","ding","wing"};
		SubstringWithConcatenationOfAllWords sol = new SubstringWithConcatenationOfAllWords();
		List<Integer> result = sol.findSubstring(S, L);
		for (Integer v : result) 
			System.out.println(v);
		assertEquals(1, result.size());
	}
	
}
