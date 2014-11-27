package longest_substring_without_repeating_characters;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LongestSubstringWithoutRepeatingCharactersTest {
	LongestSubstringWithoutRepeatingCharacters sol = null;

	@Before
	public void setUp() throws Exception {
		sol = new LongestSubstringWithoutRepeatingCharacters();
	}

	@Test
	public void test() {
		assertEquals(1, sol.lengthOfLongestSubstring("a"));
		assertEquals(3, sol.lengthOfLongestSubstring("abcabcbb"));
		assertEquals(1, sol.lengthOfLongestSubstring("bbbb"));
		assertEquals(12, sol.lengthOfLongestSubstring("wlrbbmqbhcdarzowkkyhiddqscdxrjmowfrxsjybldbefsarcbynecdyggxxpklorellnmpapqfwkhopkmco"));
	}

}
