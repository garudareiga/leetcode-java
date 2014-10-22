package unique_binary_search_tree_2;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.Test;

import util.TreeNode;

public class UniqueBinarySearchTrees2Test {

	@Test
	public void testGenerateTrees() {
		UniqueBinarySearchTrees2 sol = new UniqueBinarySearchTrees2();
		List<TreeNode> treeList = sol.generateTrees(3);
		for (int i = 0; i < treeList.size(); i++) {
			TreeNode.printTree(treeList.get(i));
		}
		assertEquals(5, treeList.size());
	}

}
