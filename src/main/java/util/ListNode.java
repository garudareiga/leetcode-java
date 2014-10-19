package util;

public class ListNode {
	public int val;
	public ListNode next;
	public ListNode(int x) { val = x; next = null; }
	
	public static void printList(ListNode head) {
		StringBuilder sb = new StringBuilder();
		while (head != null) {
			sb.append(head.val + " ");
			head = head.next;
		}
		System.out.println(sb.toString());
	}
	
	public static ListNode reverse(ListNode head) {
		// reverse [head, null)
		ListNode prev = null, next = null;
		while (head != null) {
			next = head.next;
			head.next = prev;
			prev = head;
			head = next;
		}
		return prev;
	}
	
	public static ListNode reverse(ListNode head, ListNode tail) {
		// reverse [head, tail)
		ListNode curr = head, prev = null, next = null;
		while (curr != tail) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head.next = tail;
		return prev;
	}
}

