class Solution {
    public int search(int[] nums, int target) {
        
        int s=0, e=nums.length;
        while(s<e) {
            int mid = (s+e)/2;

            if(nums[mid] < target) {
                s++;
            } else if(nums[mid] > target) {
                e--;
            } else {
                return mid;
            }
        }

        return -1;
    }
}