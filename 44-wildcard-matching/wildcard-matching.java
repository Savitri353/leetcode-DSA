class Solution {
    public boolean isMatch(String s, String p) {
        int n = s.length();
        int m = p.length();
        Boolean[][] dp = new Boolean[n+1][m+1];  // +1 for safe indexing
        return f(n-1, m-1, s, p, dp);
    }

    boolean f(int i, int j, String s, String p, Boolean[][] dp) {
        if (i < 0 && j < 0) return true;
        if (i >= 0 && j < 0) return false;
        if (i < 0 && j >= 0) {
            for (int ii = 0; ii <= j; ii++) {
                if (p.charAt(ii) != '*') return false;
            }
            return true;
        }

        if (dp[i+1][j+1] != null) return dp[i+1][j+1];

        if (i >= 0 && (s.charAt(i) == p.charAt(j) || p.charAt(j) == '?')) {
            return dp[i+1][j+1] = f(i-1, j-1, s, p, dp);
        }

        if (p.charAt(j) == '*') {
            boolean matchEmpty = f(i, j-1, s, p, dp);
            boolean matchChar = (i >= 0) && f(i-1, j, s, p, dp);
            return dp[i+1][j+1] = matchEmpty || matchChar;
        }

        return dp[i+1][j+1] = false;
    }
}
