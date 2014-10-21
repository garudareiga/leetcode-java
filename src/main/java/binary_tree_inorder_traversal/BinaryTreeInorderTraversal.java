package binary_tree_inorder_traversal;

import java.util.*;
import util.TreeNode;

/**
 * 
 * @author raychen
 * Problem:
 * Given a binary tree, return the inorder traversal of its nodes' values.
 */

public class BinaryTreeInorderTraversal {    
    public ArrayList<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if  (root == null) return result;
        Stack<TreeNode> s = new Stack<TreeNode>();
        TreeNode n = root;
        while (!s.isEmpty() || n != null) {
        	if (n != null) {
        		s.push(n);
        		n = n.left;
        	} else {
        		n = s.pop();
        		result.add(n.val);
        		n = n.right;
        	}
        }
        return result;
    }
    
    public ArrayList<Integer> inorderTraversalRecursive(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        inorder_traversal_recursive(root, result);
        return result;
    }
    
    public void inorder_traversal_recursive(TreeNode root, ArrayList<Integer> result) {
        if (root == null)
            return;
        inorder_traversal_recursive(root.left, result);
        result.add(root.val);
        inorder_traversal_recursive(root.right, result);
    }
}