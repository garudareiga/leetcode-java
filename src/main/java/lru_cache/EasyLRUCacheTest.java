package lru_cache;

import static org.junit.Assert.*;

import org.junit.Test;

public class EasyLRUCacheTest {

    @Test
    public void test1() {
        System.out.println("Test 1 ...");
        EasyLRUCache cache = new EasyLRUCache(1);
        cache.set(2, 1);
        assertEquals(1, cache.get(2));
        cache.set(3, 2);
        assertEquals(-1, cache.get(2));
        assertEquals(2, cache.get(3));
    }
    
    @Test
    public void test2() {
        System.out.println("Test 2 ...");
        EasyLRUCache cache = new EasyLRUCache(2);
        cache.set(2, 1);
        cache.set(2, 2);
        assertEquals(2, cache.get(2));
        cache.set(1, 1);
        cache.set(4, 4);
        cache.set(5, 5);
        assertEquals(-1, cache.get(2));
        assertEquals(5, cache.get(5));
    }
    
    @Test
    public void test3() {
        System.out.println("Test 3 ...");
        EasyLRUCache cache = new EasyLRUCache(1);
        cache.set(2, 1);
        cache.get(2);
        cache.set(3, 2);
        cache.get(2);
        cache.get(3);
    }
    
    @Test
    public void test4() {
        System.out.println("Test 4 ...");
        EasyLRUCache cache = new EasyLRUCache(2);
        cache.get(2);
        cache.set(2,6);
        cache.get(1);
        cache.set(1,5);
        cache.set(1,2);
        cache.get(1);
        cache.get(2);
    }
}
