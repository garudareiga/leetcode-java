package binary_tree_level_order_traversal_2;

import java.util.*;

import util.TreeNode;

/**
 * 
 * @author raychen
 * Problem:
 * Given a binary tree, return the bottom-up level order traversal 
 * of its nodes' values. (ie, from left to right, level by level 
 * from leaf to root).

    For example:
    Given binary tree {3,9,20,#,#,15,7},
        3
       / \
      9  20
        /  \
       15   7
    return its bottom-up level order traversal as:
    [
      [15,7]
      [9,20],
      [3],
    ]
 */

public class BinaryTreeLevelOrderTraversal2 {    
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
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
        Collections.reverse(result);
        return result;
    } 
    
    /*
     * bfs is a better choice compared to dfs
     */
    public List<List<Integer>> level_order_bottom_bfs(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (root == null) 
        	return result;
        
        ArrayList<TreeNode> current = new ArrayList<TreeNode>();
        current.add(root);
        bfs_traverse(current, result);
        return result;
    } 
    
    public ArrayList<ArrayList<Integer>> level_order_bottom_dfs(TreeNode root) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        dfs_traverse(root, 1, result);
        Collections.reverse(result);
        return result;
    }  
    
    public void bfs_traverse(ArrayList<TreeNode> current, List<List<Integer>> result) {
        ArrayList<TreeNode> next = new ArrayList<TreeNode>();
        ArrayList<Integer> level = new ArrayList<Integer>();
        for (TreeNode node : current) {
            level.add(node.val);
            if (node.left != null) { next.add(node.left); }
            if (node.right != null) { next.add(node.right); }
        }
        if (!next.isEmpty()) bfs_traverse(next, result); 
        result.add(level);
    }
    
    public void dfs_traverse(TreeNode root, int level, ArrayList<ArrayList<Integer>> result) {
        if (root == null)
            return;
        ArrayList<Integer> array = null;
        if (level > result.size()) {
            array = new ArrayList<Integer>();
            result.add(array);
        } else
            array = result.get(level);
        
        array.add(root.val);
        dfs_traverse(root.left, level + 1, result);
        dfs_traverse(root.right, level + 1, result);
    }
}