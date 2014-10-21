package binary_tree_preorder_traversal;

import java.util.*;
import util.TreeNode;

/**
 * 
 * @author raychen
 * Problem:
 * Given a binary tree, return the preorder traversal of its nodes' values.
 * 
 */

public class BinaryTreePreorderTraversal {    
    public ArrayList<Integer> preorderTraversal(TreeNode root) {
    	/*
    	 * Iterative Solution
    	 */
        ArrayList<Integer> result = new ArrayList<Integer>();
        if (root == null) return result;
        Stack<TreeNode> s = new Stack<TreeNode>();
        s.push(root);
        while (!s.isEmpty()) {
        	TreeNode n = s.pop();
        	result.add(n.val);
        	if (n.right != null) s.push(n.right);
        	if (n.left != null) s.push(n.left);
        }
        return result;
    }
    
    public ArrayList<Integer> preorderTraversalRecursive(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        preorder_traverse_recursive(root, result);
        return result;
    }
    
    public void preorder_traverse_recursive(TreeNode root, ArrayList<Integer> result) {
        if (root == null)
            return;
        result.add(root.val);
        preorder_traverse_recursive(root.left, result);
        preorder_traverse_recursive(root.right, result);
    }
        
}