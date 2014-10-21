package binary_tree_postorder_traversal;

import java.util.*;
import util.TreeNode;

/**
 * 
 * @author raychen
 * Problem:
 * Given a binary tree, return the postorder traversal of its nodes' values.
 * 
 */

public class BinaryTreePostorderTraversal {    
    public ArrayList<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if (root == null) return result;
        Stack<TreeNode> s = new Stack<TreeNode>();
        TreeNode curr = root, prev;
        do {
        	while (curr != null) {	// DFS from left branch
        		s.push(curr);
        		curr = curr.left;
        	}
        	prev = null;
        	while (!s.isEmpty()) {
        		curr = s.pop();
        		if (curr.right == prev) {	// 1. right doesn't exist 2. second visit
        			s.push(curr.right);
        			prev = curr;
        		} else {
        			s.push(curr);
        			curr = curr.right;
        			break;
        		}
        	}
        } while (!s.isEmpty());
        return result;
    }
    
    public ArrayList<Integer> postorderTraversalRecursive(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        postorder_traverse_recursive(root, result);
        return result;
    }
    
    public void postorder_traverse_recursive(TreeNode root, ArrayList<Integer> result) {
        if (root == null)
            return;
        postorder_traverse_recursive(root.left, result);
        postorder_traverse_recursive(root.right, result);
        result.add(root.val);
    }
}