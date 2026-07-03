class Solution {

    int dp[][] = new int[2501][2501];
    public int lengthOfLIS(int[] nums) {
         
        for(int[] e:dp) {
            Arrays.fill(e, -1);
        }
      return solve(nums, 0, -1);
    }

      int solve(int arr[], int i, int p) {
        
        if(i >= arr.length) {
            return 0;
        }
        
        if(p != -1 && dp[i][p] != -1) {
            return dp[i][p];
        }
        
        int take = 0;
        
        if(p == -1 || arr[p]<arr[i]) {
            take = 1+solve(arr, i+1, i);
        }
        
        int skip = solve(arr, i+1, p);
        
         if(p != -1) {
             dp[i][p] = Math.max(take, skip);
         } 
        return Math.max(take, skip);
    }
}