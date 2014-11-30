package construct_binary_tree_from_preorder_and_inorder_traversal;

import util.TreeNode;

/**
 * 
 * @author raychen
 * 
 * Problem
 * Given preorder and inorder traversal of a tree, construct the binary tree.
 * 
 * Note:
 * You may assume that duplicates do not exist in the tree.
 */

public class ConstructBinaryTreeFromPreorderAndInorderTraversal {	
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        /*
         * Time Complexity: O(n)
         * Space Complexity: O(log(n))
         */
        // preorder: M L R
        // inorder:  L M R
    	if (preorder.length == 0 || inorder.length == 0) return null;
    	return buildTree(preorder, 0, preorder.length, inorder, 0, inorder.length);
    }
    
    public TreeNode buildTree(int[] preorder, int pstart, int pend, int[] inorder, int istart, int iend) {
    	if (istart >= iend) return null;
    	TreeNode root = new TreeNode(preorder[pstart]);
    	for (int m = istart; m < iend; m++) {
    		if (inorder[m] == root.val) {
    			int ls = m - istart, rs = iend - istart - ls - 1;
    			root.left = buildTree(preorder, pstart + 1, pend - rs, inorder, istart, m);
    			root.right = buildTree(preorder, pend - rs, pend, inorder, m + 1, iend);
    		}
    	}
    	return root;
    }	
}
