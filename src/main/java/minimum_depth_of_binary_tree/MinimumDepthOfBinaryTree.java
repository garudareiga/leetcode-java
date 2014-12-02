package minimum_depth_of_binary_tree;

import util.TreeNode;

/**
 * 
 * @author raychen
 * 
 *  Problem:
 *  Given a binary tree, find its maximum depth.
 *  
 *  The maximum depth is the number of nodes along the longest path from the root 
 *  node down to the farthest leaf node.
 *  
 */

public class MinimumDepthOfBinaryTree {    
    public int minDepth(TreeNode root) {
    	return minDepth(root, false);
    }
    
    public int minDepth(TreeNode root, boolean hasSibling) {
    	if (root == null) return hasSibling ? Integer.MAX_VALUE : 0;
    	return Math.min(minDepth(root.left, root.right != null), 
    			minDepth(root.right, root.left != null)) + 1;
    }   
    
    public int minDepthEasy(TreeNode root) {
    	if (root == null) return 0;
    	if (root.left == null) return minDepthEasy(root.right) + 1;
    	if (root.right == null) return minDepthEasy(root.left) + 1;
    	return Math.min(minDepthEasy(root.left), minDepthEasy(root.right)) + 1;
    } 
}
