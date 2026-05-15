class Solution {
    public int maxProfit(int[] prices) {
       int maxProfit = 0;
       int minBuy = prices[0];

       for(int i=1; i<prices.length; i++) {
            int currentPrice = prices[i]-minBuy;
            maxProfit = Math.max(maxProfit, currentPrice);
            minBuy = Math.min(prices[i], minBuy);
       }

       return maxProfit;
    }
}