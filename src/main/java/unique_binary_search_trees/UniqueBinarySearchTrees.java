package unique_binary_search_trees;

/**
 * 
 * @author raychen
 * 
 *  Problem:
 *  Given n, how many structurally unique BST's (binary search trees)
 *  that store values 1...n?
 *  
 *  For example,
 *  Given n = 3, there are a total of 5 unique BST's.
 *
 *      1         3     3      2      1
 *       \       /     /      / \      \
 *        3     2     1      1   3      2
 *       /     /       \                 \
 *      2     1         2                 3
 */

public class UniqueBinarySearchTrees {
    public int numTrees(int n) {
    	// Dynamic Programming
        int[] uniqueBSTNum = new int[n + 1];
        uniqueBSTNum[0] = 1;    // n = 0
        uniqueBSTNum[1] = 1;    // n = 1
        for (int numNodes = 2; numNodes <= n; numNodes++) {
            for (int leftNumNodes = 0; leftNumNodes < numNodes; leftNumNodes++) {
                uniqueBSTNum[numNodes] += uniqueBSTNum[leftNumNodes]*uniqueBSTNum[numNodes - 1 - leftNumNodes];
            }
        }
        return uniqueBSTNum[n];
    }
    
    public int numTrees_recursive(int n) {
    	// recursive: not runtime efficient
    	if (n <= 0) return 1;
    	int result = 0;
    	for (int i = 1; i <= n; i++)
    		result = numTrees(i - 1)*numTrees(n - i);
    	return result;
    }
}
