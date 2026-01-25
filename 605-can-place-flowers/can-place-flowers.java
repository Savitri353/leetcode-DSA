class Solution {
    public boolean canPlaceFlowers(int[] nums, int n) {
        if(nums.length == 1 && nums[0] == 0 && n>0) {
            nums[0]=1;
            n--;
        } 

        for(int i=0; i<nums.length-1; i++) {
            if(i==0 && nums[i] == 0 && nums[i+1] == 0 && n>0) {
                nums[i] = 1;
                n--;
            }

            if(i>0 && n>0 && nums[i] == 0 && nums[i+1] == 0 && nums[i-1] == 0) {
                nums[i] = 1;
                n--;
            }

            if(n==0) {
                return true;
            } 
        }

        if(nums[nums.length-1] == 0 && n>0 && nums[nums.length-2] == 0) {
                nums[nums.length-1] = 1;
                n--;
        }

        return n==0;
    }
}