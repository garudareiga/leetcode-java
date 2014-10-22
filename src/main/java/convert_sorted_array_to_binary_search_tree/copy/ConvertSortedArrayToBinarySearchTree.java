package convert_sorted_array_to_binary_search_tree.copy;

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
    
    public TreeNode sortedArrayToBST(int[] num, int start, int end) {
    	if (start > end) return null;
    	int m = (start + end)/2;
    	TreeNode n = new TreeNode(num[m]);
    	n.left = sortedArrayToBST(num, start, m - 1);
    	n.right = sortedArrayToBST(num, m + 1, end);
    	return n;
    }
}