package unique_binary_search_tree_2;

import util.TreeNode;

/**
 * 
 * @author raychen
 * 
 * Problem
 * Given n, generate all structurally unique BST's (binary search trees) that 
 * store values 1...n.
 * 
 * For example,
 * Given n = 3, your program should return all 5 unique BST's shown below.
 *   1         3     3      2      1
 *    \       /     /      / \      \
 *     3     2     1      1   3      2
 *    /     /       \                 \
 *   2     1         2                 3
 *   
 */

import java.util.*;

public class UniqueBinarySearchTrees2 { 
	public List<TreeNode> generateTrees(int n) {
		return generateTrees(1, n);
	}
	
	public ArrayList<TreeNode> generateTrees(int l, int r) {
		ArrayList<TreeNode> result = new ArrayList<TreeNode>();
		if (l > r) {
			result.add(null);
			return result;
		}
		for (int k = l; k <= r; k++) {
			ArrayList<TreeNode> left = generateTrees(l, k - 1);
			ArrayList<TreeNode> right = generateTrees(k + 1, r);
			for (int i = 0; i < left.size(); i++) {
				for (int j = 0; j < right.size(); j++) {
					TreeNode root = new TreeNode(k);
					root.left = left.get(i);
					root.right = right.get(j);
					result.add(root);
				}
			}
		}
		return result;
	}
}
