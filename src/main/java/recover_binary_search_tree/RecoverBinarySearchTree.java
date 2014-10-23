package recover_binary_search_tree;

import java.util.*;
import util.TreeNode;

/**
 * 
 * @author raychen
 * 
 * Problem:
 * Two elements of a binary search tree (BST) are swapped by mistake.
 * Recover the tree without changing its structure.
 * 
 * Note:
 * A solution using O(n) space is pretty straight forward. Could you devise a constant space solution?
 * 
 */

public class RecoverBinarySearchTree {
    ArrayList<TreeNode> nodeArrayList = new ArrayList<TreeNode>();
        
    public void recoverTree(TreeNode root) {
        // Inorder traverse
        traverse(root);
        TreeNode nodeSmall = null;
        TreeNode nodeLarge = null;
        for (int i = 0; i < nodeArrayList.size() - 1; i++) {
            if (nodeArrayList.get(i).val > nodeArrayList.get(i + 1).val) {
                if (nodeLarge == null) {
                    nodeLarge = nodeArrayList.get(i);
                    nodeSmall = nodeArrayList.get(i + 1);
                } else {
                    nodeSmall = nodeArrayList.get(i + 1);
                }
            }
        }
        
        if (nodeLarge != null && nodeSmall != null) {
            int tmp = nodeLarge.val;
            nodeLarge.val = nodeSmall.val;
            nodeSmall.val = tmp;
        }
    }
    
    public void traverse(TreeNode root) {
        if (root == null) {
            return;
        }

        traverse(root.left);
        nodeArrayList.add(root);
        traverse(root.right);
    }
}
