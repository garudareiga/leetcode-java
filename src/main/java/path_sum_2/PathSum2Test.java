package path_sum_2;

import static org.junit.Assert.*;
import util.TreeNode;

import org.junit.Test;

public class PathSum2Test {
	@Test
	public void test() {
		TreeNode node1 = new TreeNode(1);
		PathSum2 sol = new PathSum2();
		assertEquals(1, sol.pathSum(node1, 1).size());
	}		
}
