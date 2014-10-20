package anagrams;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class AnagramsTest {

	@Test
	public void testAnagrams() {
		String[] strs = {"and", "dan", "aand", "dam"};
		Anagrams sol = new Anagrams();
		List<String> result = sol.anagrams(strs);
		assertEquals(2, result.size());
	}

}
