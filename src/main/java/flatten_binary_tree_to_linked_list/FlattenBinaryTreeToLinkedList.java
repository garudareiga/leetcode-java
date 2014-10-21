package flatten_binary_tree_to_linked_list;

import java.util.*;
import util.TreeNode;

/**
 * 
 * @author raychen
 * 
 * Problem
 * Given a binary tree, flatten it to a linked list in-place.
 * 
 */

public class FlattenBinaryTreeToLinkedList {    
    public void flatten(TreeNode root) {
    	/*
    	 * preorder traversal: use stack
    	 */
    	if (root == null) return;
    	Stack<TreeNode> s = new Stack<TreeNode>();
    	s.push(root);
    	
    	while (!s.isEmpty()) {
    		TreeNode n = s.pop();
    		if (n.right != null) s.push(n.right);
    		if (n.left != null) s.push(n.left);
    		n.left = null;
    		n.right = s.isEmpty() ? null : s.peek();
    	}
    }
}
