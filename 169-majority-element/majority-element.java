class Solution {
    public int majorityElement(int[] nums) {

        // int n = nums.length;

        //  Arrays.sort(nums);

        //  return nums[n/2];


        int candidate = 0;
        int count = 0;

        for(int num:nums) {

            if(count == 0) {
                candidate = num; //assign the num
            }

            if(candidate == num) {  // increase the count
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }
}      