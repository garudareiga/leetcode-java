package binary_tree_maximum_path_sum;

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
    
    static public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; left = null; right = null; }
    }
    
    public int maxPathSum(TreeNode root) {
        dfs(root);
        return maxSum;
    }
    
    public int dfs(TreeNode root) { 
        if (root == null) return 0;
        int leftMaxSum = Math.max(0, dfs(root.left));
        int rightMaxSum = Math.max(0, dfs(root.right));
        maxSum = Math.max(root.val + leftMaxSum + rightMaxSum, maxSum);
        return root.val + Math.max(leftMaxSum, rightMaxSum);
    }
}