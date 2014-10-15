package candy;

/**
 * 
 * @author raychen
 * 
 *  Problem:
 *  There are N children standing in a line. Each child is assigned a rating value.
 *  
 *  You are giving candies to these children subjected to the following requirements:
 *  
 *  Each child must have at least one candy.
 *  Children with a higher rating get more candies than their neighbors.
 *  What is the minimum candies you must give?
 */

public class Candy {
    public int candy(int[] ratings) {
    	/*
    	 * Time Complexity: O(n)
    	 * Space Complexity: O(n)
    	 */
        int[] numCandy = new int[ratings.length];
        // Left to right
        for (int i = 0; i < numCandy.length; i++) {
            if (i > 0 && ratings[i] > ratings[i - 1])
                numCandy[i] = numCandy[i - 1] + 1;
            else
                numCandy[i] = 1;
        }
        // Right to left
        for (int i = numCandy.length - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1] && numCandy[i] <= numCandy[i + 1])
                numCandy[i] = numCandy[i + 1] + 1;
        }
        // Sum
        int sum = 0;
        for (int num : numCandy) 
        	sum += num;
        return sum;
    }
}
