class Solution {
    public int maxSubArray(int[] nums) {

        int MaxSum = nums[0];
        int curruntSum = nums[0];

        for(int i=1; i<nums.length; i++) {
            curruntSum = Math.max(curruntSum+nums[i], nums[i]);

            MaxSum = Math.max(MaxSum, curruntSum);
        }

        return MaxSum;
    }
}       