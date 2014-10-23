package sort_list;

import util.ListNode;

/**
 * 
 * @author raychen
 * 
 *  Problem:
 *  Sort a linked list in O(n log n) time using constant space complexity.
 *  
 */


public class SortList {  
    // merge sort
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        
        int num = 0;
        for (ListNode p = head; p != null; p = p.next) num++;
        return mergeSortList(head, num);
    }
    
    public ListNode mergeSortList(ListNode head, int num) {
        if (num == 1) {
            head.next = null;
            return head;
        }
        
        ListNode left = head, right;
        for (int i = 1; i < num/2; i++) {
        	head = head.next;
        }
        
        right = mergeSortList(head.next, num - num/2);
        head.next = null;
        left = mergeSortList(left, num/2);
        return merge(left, right);
    }
    
    public ListNode merge(ListNode left, ListNode right) {
    	ListNode dummy = new ListNode(0);
    	ListNode p = dummy;
    	while (left != null && right != null) {
    		if (left.val < right.val) {
    			p.next = left; left = left.next;
    		} else {
    			p.next = right; right = right.next;
    		}
    		p = p.next;
    	}
    	p.next = left != null ? left : right;
    	return dummy.next;
    }
}
