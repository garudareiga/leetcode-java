package binary_tree_zigzag_level_order_traversal;

import java.util.*;

import util.TreeNode;

/**
 * 
 * @author raychen
 * Problem:
 * Given a binary tree, return the zigzag level order traversal of its nodes' values. 
 * (ie, from left to right, then right to left for the next level and alternate between).
 * For example:
   Given binary tree {3,9,20,#,#,15,7},
        3
       / \
      9  20
        /  \
       15   7
    return its zigzag level order traversal as:
    [
      [3],
      [20,9],
      [15,7]
    ]
 *
 */

public class BinaryTreeZigZagLevelOrderTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (root == null) 
        	return result;
        
        Queue<TreeNode> curr = new LinkedList<TreeNode>(),
        				next = new LinkedList<TreeNode>(),
        				temp;
               
        curr.add(root);
        int level = 0;
        while (!curr.isEmpty()) {
        	ArrayList<Integer> values = new ArrayList<Integer>();
        	while (!curr.isEmpty()) {
            	TreeNode n = curr.poll();
            	values.add(n.val);
            	if (n.left != null) next.add(n.left);
            	if (n.right != null) next.add(n.right);
        	}
        	if (level % 2 == 1)
        		Collections.reverse(values);
        	level++;
        	result.add(values);
    		temp = curr;
    		curr = next;
    		next = temp;
        }
        return result;
    }
    	
    public List<List<Integer>> zigzagLevelOrderBFS(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (root == null) 
        	return result;
        ArrayList<TreeNode> current = new ArrayList<TreeNode>();
        current.add(root);
        zigzag_level_order_bfs_traversal(current, 0, result);
        return result;
    }
    
    public void zigzag_level_order_bfs_traversal(ArrayList<TreeNode> current, int level, List<List<Integer>> result) {
        ArrayList<TreeNode> next = new ArrayList<TreeNode>();
        ArrayList<Integer> values = new ArrayList<Integer>();
        for (TreeNode node : current) {
            values.add(node.val);
            if (node.left != null) next.add(node.left);
            if (node.right != null) next.add(node.right);
        }
        if (level % 2 == 1) 
        	Collections.reverse(values);
        result.add(values);
        if (!next.isEmpty())
        	zigzag_level_order_bfs_traversal(next, level + 1, result); 
    }
}