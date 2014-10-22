package unique_binary_search_trees;

import static org.junit.Assert.*;

import org.junit.Test;

public class UniqueBinarySearchTreesTest {

    @Test
    public void test() {
        UniqueBinarySearchTrees sol = new UniqueBinarySearchTrees();
        assertEquals(5, sol.numTrees(3));
    }

}
