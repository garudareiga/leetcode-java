package evaluate_reverse_polish_notation;

import static org.junit.Assert.*;

import org.junit.Test;

public class EvaluationReversePolishNotationTest {

	@Test
	public void testEvalRPN1() {
		String[] tokens = {
			new String("2"),
			new String("1"),
			new String("+"),
			new String("3"),
			new String("*")
		};
		EvaluationReversePolishNotation sol = new EvaluationReversePolishNotation();
		assertEquals(9, sol.evalRPN(tokens));
	}

	@Test
	public void testEvalRPN2() {
		String[] tokens = {
			new String("4"),
			new String("13"),
			new String("5"),
			new String("/"),
			new String("+")
		};
		EvaluationReversePolishNotation sol = new EvaluationReversePolishNotation();
		assertEquals(6, sol.evalRPN(tokens));
	}
	
	@Test
	public void testEvalRPN3() {
		String[] tokens = {
			new String("4"),
			new String("-1"),
			new String("-")
		};
		EvaluationReversePolishNotation sol = new EvaluationReversePolishNotation();
		assertEquals(5, sol.evalRPN(tokens));
	}
}
