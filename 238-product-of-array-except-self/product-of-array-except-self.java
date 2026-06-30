class Solution {
    public int[] productExceptSelf(int[] nums) {

        int pre = 1;
        int[] prefix = new int[nums.length];

        for(int i=0; i<nums.length; i++) {
            prefix[i] = pre;
            pre*=nums[i];
        }

           int suffix = 1;
          for(int i=nums.length-1; i>=0; i--) {
            prefix[i]*=suffix;
            suffix*=nums[i];
        }

        return prefix;
    }
}    