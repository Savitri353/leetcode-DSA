class Solution {
        int[][] dp = new int[301][5002];
    public int change(int amount, int[] coins) {
        
        for(int[] d: dp) {
          Arrays.fill(d,-1);
        }

        return solve(0, coins, amount);
    }

    public int solve(int i, int[] coins, int amount) {

        if(amount == 0) {
            return 1;
        }

        if(i == coins.length) {
            return 0;
        }

        if(dp[i][amount] != -1) {
            return dp[i][amount];
        }

        if(amount < coins[i]) {
            return dp[i][amount] = solve(i+1, coins, amount);
        }

        int take = solve(i, coins, amount-coins[i]);
        int skip = solve(i+1, coins, amount);

        return dp[i][amount] = take+skip;
    }
}