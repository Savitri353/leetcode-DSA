class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int prefix = 1;
        int[] prefixA = new int[nums.length];

        for(int i=0; i<nums.length; i++) {
            prefixA[i] = prefix;
            prefix *= nums[i];
        }

        int suffix = 1;
        

        for(int i=nums.length-1; i>=0; i--) {
            prefixA[i]*=suffix;
            suffix *= nums[i];
        }

        return prefixA;
    }
}