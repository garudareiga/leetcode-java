package best_time_to_buy_and_sell_stock_2;

/**
 * 
 * @author raychen
 * 
 *  Problem:
 *  Say you have an array for which the ith element is the price of a given stock on day i.
 *  Design an algorithm to find the maximum profit. You may complete as many transactions as 
 *  you like (ie, buy one and sell one share of the stock multiple times). However, you may 
 *  not engage in multiple transactions at the same time (ie, you must sell the stock before 
 *  you buy again).
 *  
 */

public class BestTimeToBuyAndSellStock2 {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++)
            maxProfit += Math.max(prices[i] - prices[i-1], 0);
        return maxProfit;
    }
}
