package binary_tree_maximum_path_sum;

import static org.junit.Assert.*;

import org.junit.Test;
import binary_tree_maximum_path_sum.BinaryTreeMaximumPathSum.TreeNode;

public class BinaryTreeMaximumPathSumTest {

    @Test
    public void test1() {
        TreeNode node_1 = new TreeNode(1);
        TreeNode node_2 = new TreeNode(2);
        TreeNode node_3 = new TreeNode(3);
        node_1.left = node_2;
        node_1.right = node_3;
        
        BinaryTreeMaximumPathSum sol = new BinaryTreeMaximumPathSum();
        assertEquals(6, sol.maxPathSum(node_1));
    }
    
    @Test
    public void test2() {
        TreeNode node_1 = new TreeNode(-1);
        TreeNode node_2 = new TreeNode(1);
        TreeNode node_3 = new TreeNode(3);
        node_1.left = node_2;
        node_1.right = node_3;
        
        BinaryTreeMaximumPathSum sol = new BinaryTreeMaximumPathSum();
        assertEquals(3, sol.maxPathSum(node_1));
    }

}
