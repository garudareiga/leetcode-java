package binary_tree_level_order_traversal_1;

import java.util.*;
import util.TreeNode;

/**
 * 
 * @author raychen
 * Problem:
 * Given a binary tree, return the level order traversal of its nodes' values. 
 * (ie, from left to right, level by level).
 * For example:
 * Given binary tree {3,9,20,#,#,15,7},
        3
       / \
      9  20
        /  \
       15   7
    return its level order traversal as:
    [
      [3],
      [9,20],
      [15,7]
    ]
 *
 */

public class BinaryTreeLevelOrderTraversal {        
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (root == null) 
        	return result;
        
        Queue<TreeNode> curr = new LinkedList<TreeNode>(),
        				next = new LinkedList<TreeNode>(),
        				temp;
        
        curr.add(root);
        while (!curr.isEmpty()) {
        	ArrayList<Integer> level = new ArrayList<Integer>();
        	while (!curr.isEmpty()) {
            	TreeNode n = curr.poll();
            	level.add(n.val);
            	if (n.left != null) next.add(n.left);
            	if (n.right != null) next.add(n.right);
        	}
        	result.add(level);
    		temp = curr;
    		curr = next;
    		next = temp;
        }
        return result;
    }
    
    public ArrayList<ArrayList<Integer>> levelOrderRecursive(TreeNode root) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        level_order_traverse_recursive(root, 1, result);
        return result;
    }  
    
    public void level_order_traverse_recursive(TreeNode root, int level, ArrayList<ArrayList<Integer>> result) {
    	if (root == null) 
    		return;
    	
        if (level > result.size())
            result.add(new ArrayList<Integer>());
        
        ArrayList<Integer> array = result.get(level);
        array.add(root.val);
        
        level_order_traverse_recursive(root.left, level + 1, result);
        level_order_traverse_recursive(root.right, level + 1, result);
    }
}