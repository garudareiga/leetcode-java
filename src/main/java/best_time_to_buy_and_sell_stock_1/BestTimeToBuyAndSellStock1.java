package best_time_to_buy_and_sell_stock_1;

/**
 * 
 * @author raychen
 * 
 *  Problem:
 *  Say you have an array for which the ith element is the price of a given stock on day i.
 *  If you were only permitted to complete at most one transaction (ie, buy one and sell one 
 *  share of the stock), design an algorithm to find the maximum profit.
 */

public class BestTimeToBuyAndSellStock1 {
    public int maxProfit(int[] prices) {      
        int lowestPrice = Integer.MAX_VALUE, maxProfit = 0;
        for (int price : prices) {
            lowestPrice = Math.min(lowestPrice, price);
            maxProfit = Math.max(maxProfit, price - lowestPrice);
        }
        return maxProfit;
    }
}
