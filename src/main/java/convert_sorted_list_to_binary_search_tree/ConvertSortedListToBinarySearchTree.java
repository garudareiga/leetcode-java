package convert_sorted_list_to_binary_search_tree;

import util.TreeNode;
import util.ListNode;

/**
 * 
 * @author raychen
 * Problem:
 * Given a singly linked list where elements are sorted in ascending order, 
 * convert it to a height balanced BST.
 * 
 */

public class ConvertSortedListToBinarySearchTree {
    /*
     * - Naive Solution: 
     *   In each recursive call, we would have to traverse 
     *   half of the list's length to find the middle element.
     *   Time Complexity: O(NlgN)
     *   
     * - Best Solution:
     */
    public TreeNode sortedListToBST(ListNode head) {
    	if (head == null) return null;
    	ListNode p = head;
    	int n = 0;
    	while (p != null) { n++; p = p.next; }
    	return sortedListToBST(head, 0, n - 1);
    }
    
    public TreeNode sortedListToBST(ListNode head, int start, int end) {
    	if (start > end) return null;
    	int m = (start + end)/2;
    	TreeNode ln = sortedListToBST(head, start, m - 1);
    	TreeNode mn = new TreeNode(head.val);
    	head = head.next;
    	TreeNode rn = sortedListToBST(head, m + 1, end);
    	mn.left = ln;
    	mn.right = rn;
    	return mn;
    }
}