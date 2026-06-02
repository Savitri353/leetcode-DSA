class Solution {
    public int maxSubArray(int[] nums) {

        int curruntSum = nums[0];
        int maxSum = nums[0];

        for(int i=1; i<nums.length; i++) {
            //either choose new subArray or keep extend the previous subArray
            //avoiding -sums
            curruntSum = Math.max(nums[i], curruntSum+nums[i]);

            //keep track of max sum found so far
            maxSum = Math.max(maxSum, curruntSum);
        }

        return maxSum;

    }
}