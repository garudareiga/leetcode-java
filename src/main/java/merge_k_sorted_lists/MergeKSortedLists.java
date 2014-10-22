package merge_k_sorted_lists;

import java.util.*;
import util.ListNode;

/**
 * 
 * @author raychen
 * 
 * Problem:
 * Merge k sorted linked lists and return it as one sorted list. 
 * Analyze and describe its complexity.
 */

public class MergeKSortedLists {	
	Comparator<ListNode> comparator = new Comparator<ListNode>() {
		public int compare(ListNode n1, ListNode n2) {
			return n1.val - n2.val;
		}
	};
	
	public ListNode mergeKLists(List<ListNode> lists) {
		if (lists.size() == 0) return null;
		PriorityQueue<ListNode> pq = new PriorityQueue<ListNode>(lists.size()*10, comparator);
    	ListIterator<ListNode> iter = lists.listIterator();
    	while (iter.hasNext()) {
    		ListNode n = iter.next();
    		if (n != null) pq.add(n);
    	}
		ListNode dummy = new ListNode(0), p = dummy;
		while (!pq.isEmpty()) {
			ListNode min = pq.poll();
			if (min.next != null) pq.add(min.next);
			p.next = min;
			p = p.next;
		}
		return dummy.next;
	}
	
    public ListNode mergeKLists_TLE(List<ListNode> lists) {
    	if (lists.size() == 0) return null;
    	ListIterator<ListNode> iter = lists.listIterator();
    	ListNode n = iter.next();
    	while (iter.hasNext())
    		n = mergeTwoLists(n, iter.next());
    	return n;
    }
    
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    	ListNode dummyNode = new ListNode(0), runNode = dummyNode;
    	while (l1 != null && l2 != null) {
			if (l1.val <= l2.val) {
				runNode.next = l1; l1 = l1.next;
			} else {
				runNode.next = l2; l2 = l2.next;
			}
    		runNode = runNode.next;
    	}
    	runNode.next = l1 != null ? l1 : l2;
    	return dummyNode.next;
    }
}
