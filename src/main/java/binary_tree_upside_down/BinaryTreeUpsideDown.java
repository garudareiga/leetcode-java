package binary_tree_upside_down;

import util.*;

/**
 * 
 * @author raychen
 * 
 * Problem:
 * 
 * Given a binary tree where all the right nodes are leaf nodes with a sibling or empty, 
 * flip it upside down and turn it into a tree where the original right nodes turned into
 * left leaf nodes. Return the new root.
 * 
 *          1                    1
 *         / \                  /
 *        2   3                2 - 3
 *       / \                  /
 *      4   5                4 - 5
 *     / \                  /
 *    6   7                6 - 7
 *    
 */

public class BinaryTreeUpsideDown {
    public TreeNode upsideDown(TreeNode root) {
        if (root == null) return null;
        return upsideDownBottomUp(root);
        //return upsideDownTopDown(root);
    }
    
    public TreeNode upsideDownTopDown(TreeNode root) {
        /* Top-down Approach */
        TreeNode parent = null, rightOfParent = null;
        while (root != null) {
            TreeNode nextRoot = root.left;
            root.left = rightOfParent;
            rightOfParent = root.right;
            root.right = parent;          
            parent = root;
            root = nextRoot;
        }
        return parent;
    }
    
    public TreeNode upsideDownBottomUp(TreeNode root) {
        return upsideDownBottomUp(root, null);
    }
    
    public TreeNode upsideDownBottomUp(TreeNode root, TreeNode parent) {
        if (root == null) return parent;
        TreeNode newRoot = upsideDownBottomUp(root.left, root);
        root.left = parent == null ? null : parent.right;
        root.right = parent;
        return newRoot;
    }
    
//    public TreeNode upsideDownBottomUp(TreeNode root) {
//        /* Bottom-up Approach */
//        if (root.left == null) return root;
//        TreeNode newRoot = upsideDownBottomUp(root.left);
//        root.left.left = root.right;
//        root.left.right = root;
//        root.left = null; // flaw: easy to forget
//        root.right = null; // flaw: easy to forget
//        return newRoot;
//    } 
    
    public TreeNode upsideDownRecursive(TreeNode root, TreeNode ln, TreeNode rn) {
        if (root == null) return rn;
        TreeNode nextLeft = root.left, nextRight = root.right;
        root.left = ln;
        root.right = rn;
        return upsideDownRecursive(nextLeft, nextRight, root);
    }
}
