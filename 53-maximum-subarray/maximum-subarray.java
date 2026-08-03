class Solution {
    public int maxSubArray(int[] nums) {
        
        int curruntSum = nums[0];
        int maxSum = nums[0];

        for(int i=1; i<nums.length; i++) {
            curruntSum = Math.max(curruntSum+nums[i], nums[i]);

            maxSum = Math.max(maxSum, curruntSum);
        }

        return maxSum;
    }
}