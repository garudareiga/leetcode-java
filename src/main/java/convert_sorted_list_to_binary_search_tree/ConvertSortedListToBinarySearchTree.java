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
    public TreeNode sortedListToBST(ListNode head) {
    	if (head == null) return null;
    	ListNode runNode = head;
    	int n = 0;
    	while (runNode != null) { n++; runNode = runNode.next; }
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