class Solution {
    public int longestPalindromeSubseq(String s1) {
        // String s2 = new StringBuilder(s1).reverse().toString();

        // int n=s1.length();
        // int[][] dp = new int[n+1][n+1];

        // for(int i=0; i<=n; i++) {
        //     for(int j=0; j<=n; j++) {
        //         if(i==0 || j==0) {
        //             dp[i][j] = 0;
        //         } else if(s1.charAt(i-1) == s2.charAt(j-1)) {
        //             dp[i][j] = 1+dp[i-1][j-1];
        //         } else  {
        //             dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
        //         }
                
        //     }
        // }

        // return dp[n][n];
        int n = s1.length();
        Integer[][] dp = new Integer[n][n];
        return solve(s1, 0, n-1, dp);
    }

    public int solve(String s1, int i, int j, Integer[][] dp) {
        if(i>j) {
            return 0;
        }

        if(i==j) {
            return 1;
        } 
        
        if(dp[i][j] != null) {
            return dp[i][j];
        }

        if(s1.charAt(i) == s1.charAt(j)) {
            dp[i][j] = 2+solve(s1, i+1, j-1, dp);
        } else {
            dp[i][j] = Math.max(solve(s1, i+1, j, dp), solve(s1, i, j-1, dp));
        }

        return dp[i][j];
    }
}