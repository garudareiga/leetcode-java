package lrc_cache;

import org.junit.Test;

public class LRUCacheTest {

    @Test
    public void test1() {
        System.out.println("Test 1 ...");
        LRUCache cache = new LRUCache(1);
        cache.set(2, 1);
        cache.get(2);
        cache.set(3, 2);
        cache.get(2);
        cache.get(3);
    }
    
    @Test
    public void test2() {
        System.out.println("Test 2 ...");
        LRUCache cache = new LRUCache(2);
        cache.set(2, 1);
        cache.set(2, 2);
        cache.get(2);
        cache.set(1, 1);
        cache.set(4, 1);
        cache.get(2);
    }
    
    @Test
    public void test3() {
        System.out.println("Test 3 ...");
        LRUCache cache = new LRUCache(1);
        cache.set(2, 1);
        cache.get(2);
        cache.set(3, 2);
        cache.get(2);
        cache.get(3);
    }
    
    @Test
    public void test4() {
        System.out.println("Test 4 ...");
        LRUCache cache = new LRUCache(2);
        cache.get(2);
        cache.set(2,6);
        cache.get(1);
        cache.set(1,5);
        cache.set(1,2);
        cache.get(1);
        cache.get(2);
    }
}
