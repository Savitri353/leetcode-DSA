class Solution {
    public int maxSubArray(int[] nums) {
        // int currentSum = nums[0];
        // int maxSum = nums[0];

        // for(int i=1; i<nums.length; i++) {
        //     //either choose new subArray or keep extend the previous subArray
        //     //avoiding -sums
        //     currentSum = Math.max(nums[i], currentSum+nums[i]);

        //     //keep track of max sum found so far
        //     maxSum = Math.max(maxSum, currentSum);
        // }

        // return maxSum;

        int currentSum = nums[0];
        int maxSum = nums[0];

        for(int i=1; i<nums.length; i++) {
            //either choose new subArray or keep extend the previous subArray

            currentSum  = Math.max(currentSum+nums[i], nums[i]);
            //keep track of max sum found so far
            maxSum = Math.max(currentSum, maxSum);
        }

        return maxSum;
    }
}