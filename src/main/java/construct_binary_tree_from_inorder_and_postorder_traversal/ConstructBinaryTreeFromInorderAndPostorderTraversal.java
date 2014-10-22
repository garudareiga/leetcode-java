package construct_binary_tree_from_inorder_and_postorder_traversal;

import java.util.*;
import util.TreeNode;

/**
 * 
 * @author raychen
 * 
 * Problem
 * Given inorder and postorder traversal of a tree, construct the binary tree.
 * 
 * Note:
 * You may assume that duplicates do not exist in the tree.
 */

public class ConstructBinaryTreeFromInorderAndPostorderTraversal {
	public TreeNode buildTree(int[] inorder, int[] postorder) {
        // inorder:   L M R
        // postorder: L R M
    	if (inorder.length == 0 || postorder.length == 0) return null;
    	return buildTree(inorder, 0, inorder.length, postorder, 0, postorder.length);
    }
    
    public TreeNode buildTree(int[] inorder, int istart, int iend, int[] postorder, int pstart, int pend) {
    	if (istart >= iend) return null;
    	TreeNode root = new TreeNode(postorder[pend - 1]);
    	for (int m = istart; m < iend; m++) {
    		if (inorder[m] == root.val) {
    			int ls = m - istart;
    			root.left = buildTree(inorder, istart, m, postorder, pstart, pstart + ls);
    			root.right = buildTree(inorder, m + 1, iend, postorder, pstart + ls, pend - 1);
    		}
    	}
    	return root;
    }
	
    public TreeNode buildTree_easy(int[] inorder, int[] postorder) {
    	if (inorder.length == 0 && postorder.length == 0)
    		return null;
    	TreeNode root = new TreeNode(postorder[postorder.length - 1]);
    	for (int i = 0; i < inorder.length; i++) {
    		if (inorder[i] == root.val) {
    			int ls = i;	// left branch size
    			int rs = inorder.length - 1 - ls; // right branch size
    			
    			if (ls > 0)
    				root.left = buildTree(Arrays.copyOfRange(inorder, 0, ls), Arrays.copyOfRange(postorder, 0, ls));
    			else
    				root.left = null;
    			
    			if (rs > 0)
    				root.right = buildTree(Arrays.copyOfRange(inorder, i + 1, i + 1 + rs), Arrays.copyOfRange(postorder, i, i + rs));
    			else
    				root.right = null;
    		}
    	}
    	return root;
    }
}
