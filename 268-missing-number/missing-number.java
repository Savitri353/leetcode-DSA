class Solution {
    public int missingNumber(int[] nums) {
        int i=0;

        while(i<nums.length) {
            int corr=nums[i];
            if(nums[i] != nums.length && nums[i] != nums[corr]) {
                int temp = nums[i];
                nums[i] = nums[corr];
                nums[corr] = temp;
            } else {
                i++;
            }
        }


        for(i=0; i<nums.length; i++) {
            if(nums[i] != i) {
                return i;
            }
        }
        return nums.length;
    }
}