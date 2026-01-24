class Solution {
    public int[] runningSum(int[] nums) {
        int[] prefix = new int[nums.length];

        int prefixSum = 0;
        for(int i=0; i<nums.length; i++) {
            prefixSum+=nums[i];
            prefix[i] = prefixSum;
        }

        return prefix;
    }
}