package practice.java.leetcode.array;

public class BestTimeToSellStock {

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
        int buyValue = prices[0];
        int profit =  0;

        for(int i = 1; i< prices.length; i++) {
            if(prices[i] <= buyValue) {
                buyValue =  prices[i];
            } else if(prices[i] - buyValue > profit) {
                profit = prices[i] -  buyValue;
            }
        }
       return profit;
    }
}
