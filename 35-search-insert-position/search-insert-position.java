class Solution {
    public int searchInsert(int[] nums, int target) {

        int i=0;
        int j=nums.length-1;

        while(i<=j) {
            int mid = i+(j-i)/2;

            if(nums[mid] == target) {
                return mid;                   //l      r
            } else if(nums[mid] < target) {   //0 1 2 3 
                i=mid+1;
            } else {
                j=mid-1;
            }
        }

        return i;
    }
}      