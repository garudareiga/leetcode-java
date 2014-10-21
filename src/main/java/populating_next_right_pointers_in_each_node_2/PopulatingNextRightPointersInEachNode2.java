package populating_next_right_pointers_in_each_node_2;

import util.TreeLinkNode;

/**
 * 
 * @author raychen
 * 
 * Problem:
 * Follow up for problem "Populating Next Right Pointers in Each Node".
 * 
 * What if the given tree could be any binary tree? Would your previous solution still work?
 * 
 * Note:
 * You may only use constant extra space.
 *
 */

public class PopulatingNextRightPointersInEachNode2 {
	public void connect(TreeLinkNode root) {
		/* 
		 * Recursive solution
		 * Time Complexity: O(n)
		 * Space Complexity: O(1)
		 */
		if (root == null) return;
		TreeLinkNode dummy = new TreeLinkNode(0);
		TreeLinkNode prev = dummy;
		for (TreeLinkNode curr = root; curr != null; curr = curr.next) {
			if (curr.left != null) {
				prev.next = curr.left;
				prev = curr.left;
			}
			if (curr.right != null) {
				prev.next = curr.right;
				prev = curr.right;
			}
		}
		connect(dummy.next);
	}
	
    public void connect_iterative(TreeLinkNode root) {
    	/*
    	 * Iterative solution
    	 * Time Complexity: O(n)
    	 * Space Complexity: O(1)
    	 */
    	while (root != null) {
    		TreeLinkNode prev = null,	// previous node in the same level 
    				next = null;		// first node in the next level
    		for (; root != null; root = root.next) {
    			if (next == null) next = root.left != null ? root.left : root.right;
    			
    			if (root.left != null) {
    				if (prev != null) prev.next = root.left;
    				prev = root.left;
    			}
    			if (root.right != null) {
    				if (prev != null) prev.next = root.right;
    				prev = root.right;
    			}
    		}
    		root = next;
    	}
    }
}
