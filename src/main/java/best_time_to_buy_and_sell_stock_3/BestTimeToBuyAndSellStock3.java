package best_time_to_buy_and_sell_stock_3;

/**
 * 
 * @author raychen
 * 
 *  Problem:
 *  Say you have an array for which the ith element is the price of a given stock on day i.
 *  
 *  Design an algorithm to find the maximum profit. You may complete at most two transactions.
 *  
 *  Note:
 *  You may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).
 */

public class BestTimeToBuyAndSellStock3 {
    public int maxProfit(int[] prices) {
        // forwardProfts[i]: maximum profit buying & selling [0, i]
        // backwardProfits[i]: maxium proft buy & selling [i...]
        int[] forwardProfits = new int[prices.length];
        int[] backwardProfits = new int[prices.length];
        
        int maxProfit = 0, minPrice = Integer.MAX_VALUE, maxPrice = Integer.MIN_VALUE;
        for (int i = 0; i < prices.length; i++) {
            minPrice = Math.min(minPrice, prices[i]);            
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
            forwardProfits[i] = maxProfit;
        }
        maxProfit = 0;
        for (int i = prices.length - 1; i >= 0; i--) {
            maxPrice = Math.max(maxPrice, prices[i]);            
            maxProfit = Math.max(maxProfit, maxPrice - prices[i]);
            backwardProfits[i] = maxProfit;
        }

        maxProfit = 0;
        for (int i = 0; i < prices.length; i++)
            maxProfit = Math.max(maxProfit, forwardProfits[i] + backwardProfits[i]);
        return maxProfit;
    }
}
