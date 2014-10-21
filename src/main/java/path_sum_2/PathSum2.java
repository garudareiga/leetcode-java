package path_sum_2;

import util.TreeNode;

/**
 * 
 * @author raychen
 * Problem:
 * Given a binary tree and a sum, find all root-to-leaf paths where each path's sum 
 * equals the given sum.
 * 
 * For example:
 * Given the below binary tree and sum = 22,
          5
         / \
        4   8
       /   / \
      11  13  4
     /  \    / \
    7    2  5   1
    
	return
	[
	   [5,4,11,2],
	   [5,8,4,5]
	]
 *
 */

import java.util.*;

public class PathSum2 {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
    	List<List<Integer>> result = new ArrayList<List<Integer>>();
        Stack<Integer> current = new Stack<Integer>();
        pathSum_(root, sum, current, result);
        return result;
    }
    
    void pathSum_(TreeNode root, int sum, Stack<Integer> current, List<List<Integer>> result) {
    	if (root == null) return;
    	if (root.left == null && root.right == null) {
    		if (root.val == sum) {
    			ArrayList<Integer> next = new ArrayList<Integer>(current);
    			next.add(root.val);
    			result.add(next);
    		}
    		return;
    	}
    	
    	current.push(root.val);
    	pathSum_(root.left, sum - root.val, current, result);
    	pathSum_(root.right, sum - root.val, current, result);
    	current.pop();
    }
}
