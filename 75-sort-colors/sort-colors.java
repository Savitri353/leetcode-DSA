class Solution {
    public void sortColors(int[] nums) {

        // approach 1
        //first calculate the frequency of each color
        int zero=0, one=0, two=0;
        for(int num:nums) {

            if(num == 0) zero++;
            if(num == 1) one++;
            if(num == 2) two++;
        }

        //then build new nums in-place according to frequency
        int i=0;
        while(zero != 0) {
            nums[i++] = 0;
            zero--;
        }

        while(one != 0) {
            nums[i++] = 1;
            one--;
        }

        while(two != 0) {
            nums[i++] = 2;
            two--;
        }

        //approach 2

        // int mid = 0;
        // int low = 0;
        // int high = nums.length-1;

        // while(mid <= high) {

        //     if(nums[mid] == 1) {

        //         mid++;
        //     } else if(nums[mid] == 0) {

        //         int temp = nums[mid];
        //         nums[mid] = nums[low];
        //         nums[low] = temp;
        //         low++;
        //         mid++;

        //     } else {
        //         int temp = nums[mid];
        //         nums[mid] = nums[high];
        //         nums[high] = temp;
        //         high--;
        //     }
        // }
    }
}        