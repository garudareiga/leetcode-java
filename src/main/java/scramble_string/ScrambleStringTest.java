package scramble_string;

import static org.junit.Assert.*;

import org.junit.Test;

public class ScrambleStringTest {

	@Test
	public void test() {
		ScrambleString sol = new ScrambleString();
		assertTrue(sol.isScramble("aa", "aa"));
		assertFalse(sol.isScramble("ab", "aa"));
	}

}
