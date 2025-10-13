class Solution {

    public int climbStairs(int n) {
        Integer[] dp = new Integer[46];
        return solve(n,dp);
    }

    public int solve(int n, Integer[] dp) {
        if(n<0) {
            return 0;
        }

        if(dp[n] != null) {
            return dp[n];
        }
         if(n==0) {
            return 1;
        }

        int one_step = solve(n-1, dp);
        int two_step = solve(n-2, dp);

        return dp[n] = one_step+two_step;
    }
}