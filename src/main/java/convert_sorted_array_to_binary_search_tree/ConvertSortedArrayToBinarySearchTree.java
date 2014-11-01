package convert_sorted_array_to_binary_search_tree;

import util.TreeNode;

/**
 * 
 * @author raychen
 * Problem:
 * Given an array where elements are sorted in ascending order, 
 * convert it to a height balanced BST.
 *
 */

public class ConvertSortedArrayToBinarySearchTree {   
    public TreeNode sortedArrayToBST(int[] num) {
    	return sortedArrayToBST(num, 0, num.length - 1);
    }
    
    public TreeNode sortedArrayToBST(int[] num, int l, int r) {
    	if (l > r) return null;
    	int m = (l + r)/2;
    	TreeNode n = new TreeNode(num[m]);
    	n.left = sortedArrayToBST(num, l, m - 1);
    	n.right = sortedArrayToBST(num, m + 1, r);
    	return n;
    }
}