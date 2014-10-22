package construct_binary_tree_from_inorder_and_postorder_traversal;

import org.junit.Test;

import util.TreeNode;

public class ConstructBinaryTreeFromInorderAndPostorderTraversalTest {

	@Test
	public void testBuildTree1() {
		ConstructBinaryTreeFromInorderAndPostorderTraversal sol = new ConstructBinaryTreeFromInorderAndPostorderTraversal();
		int[] inorder = {4,2,5,1,6,3,7};
		int[] postorder = {4,5,2,6,7,3,1};
		TreeNode root = sol.buildTree(inorder, postorder);
		System.out.print("Print 1234567 ? ");
		TreeNode.printTree(root);
	}
	
	@Test
	public void testBuildTree2() {
		ConstructBinaryTreeFromInorderAndPostorderTraversal sol = new ConstructBinaryTreeFromInorderAndPostorderTraversal();
		int[] inorder = {2,5,1,6,3};
		int[] postorder = {5,2,6,3,1};
		TreeNode root = sol.buildTree(inorder, postorder);
		System.out.print("Print 123#56# ? ");
		TreeNode.printTree(root);
	}
}
