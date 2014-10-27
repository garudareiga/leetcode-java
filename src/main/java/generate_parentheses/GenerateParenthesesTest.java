package generate_parentheses;

import static org.junit.Assert.*;

import org.junit.Test;
import java.util.*;

public class GenerateParenthesesTest {

	@Test
	public void testCanCompleteCircuit1() {		
		GenerateParentheses sol = new GenerateParentheses();
		List<String> result = sol.generateParenthesis(3);
		for (String str : result) System.out.println(str);
		assertEquals(5, result.size());
	}

}
