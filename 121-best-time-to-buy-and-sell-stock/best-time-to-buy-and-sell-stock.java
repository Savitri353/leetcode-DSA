class Solution {
    public int maxProfit(int[] prices) {
       int maxProfit = 0;
       int minBuy = prices[0];

       for(int i=0; i<prices.length; i++) {
            int currProfit = prices[i]-minBuy;
            maxProfit = Math.max(maxProfit, currProfit);
            minBuy = Math.min(minBuy, prices[i]);
       }

       return maxProfit;
    }
}