package binary_tree_maximum_path_sum;

import util.TreeNode;

/**
 * 
 * @author raychen
 * Given a binary tree, find the maximum path sum.
 * 
 * The path may start and end at any node in the tree.
 * 
 * For example:
 * Given the below binary tree,
 *
 *      1
 *     / \
 *    2   3
 *    
 * Return 6.
 */

public class BinaryTreeMaximumPathSum {   
    int maxSum = Integer.MIN_VALUE;
    
    public int maxPathSum(TreeNode root) {
        maxPathSum_(root);
        return maxSum;
    }
    public int maxPathSum_(TreeNode root) {
        if (root == null) return 0;
        int lps = Math.max(0, maxPathSum_(root.left)),
            rps = Math.max(0, maxPathSum_(root.right));
        maxSum = Math.max(maxSum, root.val + lps + rps);
        return root.val + Math.max(lps, rps);                 
    }
}