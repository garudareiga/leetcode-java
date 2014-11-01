package lru_cache;

import java.util.*;

public class EasyLRUCache {
	private int capacity;
	private LinkedHashMap<Integer, Integer> hm = null;
    
    public EasyLRUCache(final int capacity) {
    	this.capacity = capacity;
        hm = new LinkedHashMap<Integer, Integer>(2*capacity) {
        	protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
        		return hm.size() > capacity;
        	}
        };
    }
    
    public int get(Integer key) {
    	if (hm.containsKey(key))
    		return hm.get(key);
        return -1;
    }
    
	public void set(Integer key, Integer value) {
		hm.put(key, value);
    }
}
