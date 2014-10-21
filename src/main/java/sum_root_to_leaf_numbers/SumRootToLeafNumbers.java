package sum_root_to_leaf_numbers;

import util.TreeNode;

/**
 * 
 * @author raychen
 * 
 * Problem:
 * Given a binary tree containing digits from 0-9 only, each root-to-leaf path could 
 * represent a number.
 * 
 * An example is the root-to-leaf path 1->2->3 which represents the number 123.
 * 
 * Find the total sum of all root-to-leaf numbers.
 * For example,

	    1
	   / \
	  2   3

   The root-to-leaf path 1->2 represents the number 12.
   The root-to-leaf path 1->3 represents the number 13.

   Return the sum = 12 + 13 = 25
 *
 */

public class SumRootToLeafNumbers {
    public int sumNumbers(TreeNode root) {
    	return sumNumbers_dfs(root, 0);
    }
    
    public int sumNumbers_dfs(TreeNode root, int current) {
    	if (root == null) return 0;
    	if (root.left == null && root.right == null)
    		return current*10 + root.val;
    	return sumNumbers_dfs(root.left, current*10 + root.val) + 
    			sumNumbers_dfs(root.right, current*10 + root.val);
    }
       
}
