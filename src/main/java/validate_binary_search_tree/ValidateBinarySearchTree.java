package validate_binary_search_tree;

import util.TreeNode;

/**
 * 
 * @author raychen
 * 
 * Problem:
 * Given a binary tree, determine if it is a valid binary search tree (BST).
 * Assume a BST is defined as follows:
 * - The left subtree of a node contains only nodes with keys less than the node's key.
 * - The right subtree of a node contains only nodes with keys greater than the node's key.
 * - Both the left and right subtrees must also be binary search trees.
 */

public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
    	return isValidBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    
    protected boolean isValidBST(TreeNode root, int min, int max) {
    	if (root == null) return true;
    	return (root.val > min &&
    		root.val < max &&
    		isValidBST(root.left, min, root.val) &&
    		isValidBST(root.right, root.val, max));
    }
}
