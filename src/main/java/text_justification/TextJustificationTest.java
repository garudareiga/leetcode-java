package text_justification;

import org.junit.Test;
import java.util.*;

public class TextJustificationTest {

	@Test
	public void test1() {
		
		String[] words = {"This", "is", "an", "example", "of", "text", "justification."};
		int L = 16;
		TextJustification sol = new TextJustification();
		List<String> result = sol.fullJustify(words, L);
		for (String str : result) {
			System.out.println(str);
		}
	}

	@Test
	public void test2() {
		
		String[] words = {"What","must","be","shall","be."};
		int L = 12;
		TextJustification sol = new TextJustification();
		List<String> result = sol.fullJustify(words, L);
		for (String str : result) {
			System.out.println(str);
		}
	}
}
