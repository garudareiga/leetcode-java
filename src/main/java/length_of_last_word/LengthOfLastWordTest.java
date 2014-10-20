package length_of_last_word;

import static org.junit.Assert.*;

import org.junit.Test;

public class LengthOfLastWordTest {

	@Test
	public void test() {
		String s = "  Hello  World  ";
		LengthOfLastWord sol = new LengthOfLastWord();
		assertEquals(5, sol.lengthOfLastWord(s));
	}

}
