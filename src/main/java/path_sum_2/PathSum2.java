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
    	/*
    	 * Time Complexity: O(n)
    	 * Space Complexity: O(log(n))
    	 */
    	List<List<Integer>> result = new ArrayList<List<Integer>>();
        Stack<Integer> stack = new Stack<Integer>();
        pathSum_(root, sum, stack, result);
        return result;
    }
    
    void pathSum_(TreeNode root, int sum, Stack<Integer> stack, List<List<Integer>> result) {
    	if (root == null) return;
    	if (root.left == null && root.right == null) {
    		if (root.val == sum) {
    			ArrayList<Integer> next = new ArrayList<Integer>(stack);
    			next.add(root.val);
    			result.add(next);
    		}
    		return;
    	}
    	
    	stack.push(root.val);
    	pathSum_(root.left, sum - root.val, stack, result);
    	pathSum_(root.right, sum - root.val, stack, result);
    	stack.pop();
    }
}
