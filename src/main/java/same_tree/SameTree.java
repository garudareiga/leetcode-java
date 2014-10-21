package same_tree;

import java.util.*;
import util.TreeNode;

/**
 * 
 * @author raychen
 * 
 *  Problem:
 *  Given two binary trees, write a function to check if they are equal or not.
 *  
 *  Two binary trees are considered equal if they are structurally identical and 
 *  the nodes have the same value.
 */


public class SameTree {    
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);        
    }
    
    public boolean isSameTree_iterative(TreeNode p, TreeNode q) {
    	Stack<TreeNode> s = new Stack<TreeNode>();
    	s.push(q);
    	s.push(p);
    	while (!s.isEmpty()) {
    		p = s.pop();
    		q = s.pop();
    		if (p == null && q == null) continue;
    		if (p == null || q == null) return false;
    		if (p.val != q.val) return false;
    		
			s.push(q.right);
			s.push(p.right);
			s.push(q.left);
			s.push(p.left);
    	}
    	return true;
    }
}
