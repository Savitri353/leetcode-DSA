class Solution {

    public int climbStairs(int n) {
        // Integer[] dp = new Integer[46];
        // return solve(n,dp);
        if(n==1 || n==2 || n==3) {
            return n;
        }
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        for(int i=3; i<=n; i++) {
            dp[i] = dp[i-1]+dp[i-2];
        }

        return dp[n];
    }

    // public int solve(int n, Integer[] dp) {
    //     if(n<0) {
    //         return 0;
    //     }

    //     if(dp[n] != null) {
    //         return dp[n];
    //     }
    //      if(n==0) {
    //         return 1;
    //     }

    //     int one_step = solve(n-1, dp);
    //     int two_step = solve(n-2, dp);

    //     return dp[n] = one_step+two_step;
    // }
}