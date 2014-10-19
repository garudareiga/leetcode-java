package lrc_cache;

/**
 * 
 * @author raychen
 * 
 *  Problem:
 *  Design and implement a data structure for Least Recently Used (LRU) cache. It should support the following operations: 
 *  get and set.
 *  
 *  get(key) - Get the value (will always be positive) of the key if the key exists in the cache, otherwise return -1.
 *  set(key, value) - Set or insert the value if the key is not already present. When the cache reached its capacity, 
 *  it should invalidate the least recently used item before inserting a new item.
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
	private HashMap<Integer, DoublyLinkedListNode> kvmap = 
			new HashMap<Integer, DoublyLinkedListNode>();
	private DoublyLinkedListNode head = null;
	private DoublyLinkedListNode tail = null;
	
	public LRUCache(int capacity) {
		this.capacity = capacity;
		this.size = 0;
	}
	
	public int get(int key) {
		int value = -1;
		if (kvmap.containsKey(key)) {
			DoublyLinkedListNode node = kvmap.get(key);
			value = node.value;
			updateNode(node);
		}
		return value;
	}
	
	public void set(int key, int value) {
		DoublyLinkedListNode node = null;
		if (kvmap.containsKey(key)) {
			node = kvmap.get(key);
			node.value = value;
			updateNode(node);
		} else {
			node = new DoublyLinkedListNode(key, value);
			kvmap.put(key, node);
			addNode(node);
		}
	}
	
	public void addNode(DoublyLinkedListNode node) {
		size++;
		if (head == null && tail == null) {
			head = node;
			tail = node;
		} else {
			tail.next = node;
			node.prev = tail;
			tail = node;
		}
		
		if (size > capacity) {
			kvmap.remove(head.key);
			DoublyLinkedListNode newHead = head.next;
			head.next = null;
			newHead.prev = null;
			head = newHead;
		}
	}
	
	public void updateNode(DoublyLinkedListNode node) {
		if (node == tail)
			return;
		if (node == head) {
			head = node.next;
			head.prev = null;
		} else {
			node.prev.next = node.next;
			node.next.prev = node.prev;
		}
		node.prev = null;
		node.next = null;
		tail.next = node;
		node.prev = tail;
		tail = node;
	}
	

	
	/*
	// Using LinkedHashMap 
	int capacity;
	LinkedHashMap<Integer, Integer> kvmap = null;
    
    public LRUCache(int capacity) {
    	this.capacity = capacity;
        kvmap = new LinkedHashMap<Integer, Integer>(2*capacity);
    }
    
    public int get(int key) {
    	if (kvmap.containsKey(key)) {
    		return kvmap.get(key);
    	}
        return -1;
    }
    
	public void set(int key, int value) {
		kvmap.put(key, value);
    }
	
	protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
		return kvmap.size() > capacity;
	}
	*/
}