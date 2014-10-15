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
}

