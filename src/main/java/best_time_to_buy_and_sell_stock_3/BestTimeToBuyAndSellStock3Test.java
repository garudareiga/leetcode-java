package best_time_to_buy_and_sell_stock_3;

import static org.junit.Assert.*;

import org.junit.Test;

public class BestTimeToBuyAndSellStock3Test {

    @Test
    public void test1() {
        int[] prices = {1, 4, 2};
        BestTimeToBuyAndSellStock3 sol = new BestTimeToBuyAndSellStock3();
        assertEquals(3, sol.maxProfit(prices));
    }
    
    @Test
    public void test2() {
        int[] prices = {1,2,4,2,5,7,2,4,9,0};
        BestTimeToBuyAndSellStock3 sol = new BestTimeToBuyAndSellStock3();
        assertEquals(13, sol.maxProfit(prices));
    }
    
    @Test
    public void test3() {
        int[] prices = {3,2,6,5,0,3};
        BestTimeToBuyAndSellStock3 sol = new BestTimeToBuyAndSellStock3();
        assertEquals(7, sol.maxProfit(prices));
    }

}
