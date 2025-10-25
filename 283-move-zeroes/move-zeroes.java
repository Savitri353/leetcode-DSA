class Solution {
    public void moveZeroes(int[] nums) {
        int nextNonZeroFoundAt = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i]!=0) {
                nums[nextNonZeroFoundAt++] = nums[i];
            }
        }

        for(int j=nextNonZeroFoundAt; j<nums.length; j++) {
            nums[j] = 0;
        }

    
    }
}