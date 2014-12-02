package balanced_binary_tree;

import util.TreeNode;

/**
 * 
 * @author raychen
 * Problem:
 * Given a binary tree, determine if it is height-balanced.
 * 
 * For this problem, a height-balanced binary tree is defined as a binary tree in 
 * which the depth of the two subtrees of every node never differ by more than 1.
 * 
 */

public class BalancedBinaryTree {        
    public boolean isBalanced(TreeNode root) {
    	return balancedHeight(root) >= 0;
    }
    
    public int balancedHeight(TreeNode root) {
    	if (root == null) return 0;
    	int left = balancedHeight(root.left);
    	int right = balancedHeight(root.right);
    	if (left < 0 || right < 0 || Math.abs(left - right) > 1) return -1;	// branch pruning
    	return Math.max(left, right) + 1;
    }
}