package palindrome_partitioning;

import static org.junit.Assert.*;

import org.junit.Test;
import java.util.*;

public class PalindromePartitioningTest {

	@Test
	public void testPartition1() {
		String s = new String("aab");
		PalindromePartitioning sol = new PalindromePartitioning();
		List<List<String>> pars = sol.partition(s);
		for (List<String> par : pars) System.out.println(par.toString());
		assertEquals(2, pars.size());
	}
	
	@Test
	public void testPartition2() {
		String s = new String("bb");
		PalindromePartitioning sol = new PalindromePartitioning();
		List<List<String>> pars = sol.partition(s);
		for (List<String> par : pars) System.out.println(par.toString());
		assertEquals(2, pars.size());
	}
}
