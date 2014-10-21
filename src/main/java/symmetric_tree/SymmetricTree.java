package symmetric_tree;

import java.util.*;
import util.TreeNode;

/**
 * 
 * @author raychen
 * 
 * Problem:
 * Given a binary tree, check whether it is a mirror of itself 
 * (ie, symmetric around its center).
 * 
 * For example, this binary tree is symmetric:

	    1
	   / \
	  2   2
	 / \ / \
	3  4 4  3

   But the following is not:
   
	    1
	   / \
	  2   2
	   \   \
	   3    3
 * Note:
 * Bonus points if you could solve it both recursively and iteratively.
 * 
 */

public class SymmetricTree {    
    public boolean isSymmetric(TreeNode root) {
    	return root == null ? true : isSymmetric(root.left, root.right);
    }
    
    protected boolean isSymmetric(TreeNode l, TreeNode r) {
    	if (l == null && r == null) return true;
    	if (l == null || r == null) return false;
    	return l.val == r.val && isSymmetric(l.left, r.right) && isSymmetric(l.right, r.left);
    }
    
    public boolean isSymmetric_iterative(TreeNode root) {
    	if (root == null)
    		return true;
    	Stack<TreeNode> stack = new Stack<TreeNode>();
    	stack.push(root.right);
    	stack.push(root.left);
    	while (!stack.isEmpty()) {
    		TreeNode l = stack.pop();
    		TreeNode r = stack.pop();
    		if (l == null && r == null) continue;
    		if (l == null || r == null) return false;
    		if (l.val != r.val) return false;
    		stack.push(r.left);
    		stack.push(l.right);
    		stack.push(r.right);
    		stack.push(l.left);
    	}
    	return true;
    }
}