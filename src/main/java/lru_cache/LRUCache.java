package lru_cache;

/**
 * 
 * @author raychen
 * 
 * Problem:
 * Design and implement a data structure for Least Recently Used (LRU) cache. 
 * It should support the following operations: get and set.
 *  
 * get(key) - Get the value (will always be positive) of the key if the key 
 * exists in the cache, otherwise return -1.
 * 
 * set(key, value) - Set or insert the value if the key is not already present.
 * When the cache reached its capacity, it should invalidate the least recently 
 * used item before inserting a new item.
 *   
 */

import java.util.*;

public class LRUCache {
	public class DoublyLinkedListNode {
		int key;
		int value;
		DoublyLinkedListNode prev = null;
		DoublyLinkedListNode next = null;		
		DoublyLinkedListNode(int key, int value) {
			this.key = key;
			this.value = value;
		}
	}
	
	private int capacity;
	private int size;
	private HashMap<Integer, DoublyLinkedListNode> hm = 
			new HashMap<Integer, DoublyLinkedListNode>();
	private DoublyLinkedListNode head = null;
	private DoublyLinkedListNode tail = null;
	
	public LRUCache(int capacity) {
		this.capacity = capacity;
		this.size = 0;
	}
	
	public int get(int key) {
		int value = -1;
		if (hm.containsKey(key)) {
			DoublyLinkedListNode node = hm.get(key);
			value = node.value;
			update(node);
		}
		return value;
	}
	
	public void set(int key, int value) {
		if (hm.containsKey(key)) {
			DoublyLinkedListNode n = hm.get(key);
			n.value = value;
			update(n);
		} else {
			DoublyLinkedListNode n = new DoublyLinkedListNode(key, value);
			add(n);
		}
	}
	
	public void add(DoublyLinkedListNode n) {
		hm.put(n.key, n);
		if (head == null) head = n;
		else { n.next = head; head.prev = n; head = n; }
		if (tail == null) tail = n;
		size++;
		if (size > capacity) 			
			purge(tail);
	}
	
	private void update(DoublyLinkedListNode n) {
		if (n == head) return;
		purge(n); 
		add(n);
	}
		
	private void purge(DoublyLinkedListNode n) {
		hm.remove(n.key);
		if (n == tail) { tail = n.prev; tail.next = null; } 
		else { n.prev.next = n.next; n.next.prev = n.prev; }
		n.next = null; n.prev = null;
		size--;
	}
}