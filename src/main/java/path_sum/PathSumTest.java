package path_sum;

import static org.junit.Assert.*;
import util.TreeNode;

import org.junit.Test;

public class PathSumTest {
	@Test
	public void test() {
		TreeNode node5 = new TreeNode(5);
		TreeNode node4 = new TreeNode(4);
		TreeNode node8 = new TreeNode(8);
		TreeNode node11 = new TreeNode(11);
		TreeNode node13 = new TreeNode(13);
		TreeNode node4_1 = new TreeNode(4);
		TreeNode node7 = new TreeNode(7);
		TreeNode node2 = new TreeNode(2);
		TreeNode node1 = new TreeNode(1);
		node5.left = node4;
		node5.right = node8;
		node4.left = node11;
		node8.left = node13;
		node8.right = node4;
		node11.left = node7;
		node11.right = node2;
		node4_1.right = node1;
		
		PathSum sol = new PathSum();
		assertTrue(sol.hasPathSum(node5, 22));
	}		
}
