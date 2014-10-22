package construct_binary_tree_from_preorder_and_inorder_traversal;

import org.junit.Test;
import util.TreeNode;

public class ConstructBinaryTreeFromInorderAndPostorderTraversalTest {

	@Test
	public void testBuildTree1() {
		ConstructBinaryTreeFromPreorderAndInorderTraversal sol = new ConstructBinaryTreeFromPreorderAndInorderTraversal();
		int[] preorder = {1,2,4,5,3,6,7};
		int[] inorder = {4,2,5,1,6,3,7};
		TreeNode root = sol.buildTree(preorder, inorder);
		System.out.print("Print 1234567 ? ");
		TreeNode.printTree(root);
	}
	
	@Test
	public void testBuildTree2() {
		ConstructBinaryTreeFromPreorderAndInorderTraversal sol = new ConstructBinaryTreeFromPreorderAndInorderTraversal();
		int[] preorder = {1,2,5,3,6};
		int[] inorder = {2,5,1,6,3};
		TreeNode root = sol.buildTree(preorder, inorder);
		System.out.print("Print 123#56# ? ");
		TreeNode.printTree(root);
	}
	
	@Test
	public void testBuildTree3() {
		ConstructBinaryTreeFromPreorderAndInorderTraversal sol = new ConstructBinaryTreeFromPreorderAndInorderTraversal();
		int[] preorder = {1,2,3};
		int[] inorder  = {2,3,1};
		TreeNode root = sol.buildTree(preorder, inorder);
		System.out.print("Print 12##3 ? ");
		TreeNode.printTree(root);
	}
}
