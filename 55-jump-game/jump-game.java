class Solution {
    int[] dp = new int[10001];
    public boolean canJump(int[] nums) {
      
      Arrays.fill(dp, -1);
       return solve(nums, 0);
    }

    public boolean solve(int[] nums, int idx) {
        if(idx == nums.length-1) {
           
            return true;
        }

        if(dp[idx] != -1) {
            return dp[idx] == 1;
        }
        for(int i=1; i<=nums[idx]; i++) {
            
            if(solve(nums, idx+i)) {
                dp[idx] = 1;
                return true;
            } 

            
        } 

        dp[idx] = 0;
        return false;
    }
}