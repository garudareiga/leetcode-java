package partition_list;

/**
 * 
 * @author raychen
 * Problem:
Given a linked list and a value x, partition it such that all nodes less than x come before 
nodes greater than or equal to x.

You should preserve the original relative order of the nodes in each of the two partitions.

For example,
Given 1->4->3->2->5->2 and x = 3,
return 1->2->2->4->3->5.
*/

public class Solution {
	public static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; next = null; }
	}
	
    public ListNode partition(ListNode head, int x) {
    	if (head == null || head.next == null)
    		return head;
    	ListNode dummy_1 = new ListNode(0);
    	ListNode dummy_2 = new ListNode(0);
    	ListNode currNode_1 = dummy_1, currNode_2 = dummy_2;
    	while (head != null) {
    		if (head.val < x) {
    			currNode_1.next = head;
    			currNode_1 = head;
    		} else {
    			currNode_2.next = head;
    			currNode_2 = head;
    		}
    		head = head.next;
    	}
    	currNode_1.next = dummy_2.next;
    	currNode_2.next = null;		// very importance !!!
    	return dummy_1.next;
    }	
}
