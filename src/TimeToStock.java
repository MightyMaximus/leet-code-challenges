/**
 * <h1>Leet Code: Top Interview Questions - Easy</h1>
 * <h2>Section: Arrays</h2>
 * <h3>Challenge: Best Time to Buy and Sell Stock II</h3>
 *
 * <h4>Runtime: 0ms - beats 100% Java submissions</h4>
 *
 * @author Aiyush Jain
 * @version 1.0
 * @since 2020-01-18
 * */
public class TimeToStock {
    /**
     * Calculates best method to buy and sell stocks given an array of prices per day
     * @param prices array of each day's price
     * @return int maximum profit possible using best strategy
     * */
    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices [i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }
        return profit;
    }
}
