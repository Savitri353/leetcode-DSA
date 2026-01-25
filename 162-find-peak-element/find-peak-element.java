class Solution {
    public int findPeakElement(int[] nums) {
      
      int s=0, e=nums.length-1;

        while(s<=e) {
            int mid = s+(e-s)/2;

            boolean leftSmall = (mid==0)||nums[mid-1]<nums[mid];
            boolean rightSmall = (mid==nums.length-1) || nums[mid+1]<nums[mid];

            if(leftSmall && rightSmall) {
                return mid;
            }
             
            if(leftSmall) {
                s = mid+1;
            } else {
                e = mid-1;
            }
        }

        return -1;
    }
}