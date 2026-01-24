class Solution {
    public boolean check(int[] nums) {
        

        //we know in the sorted and rotated array , there will be only point where nums[i]>nums[i+1] condition breaks, not more then one

        int count = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i]>nums[(i+1)%nums.length]) {
                count++;
            }
        }

        if(count>1) {
            return false;
        } else {
            return true;
        }
    }
}