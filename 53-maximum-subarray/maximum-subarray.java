class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int curr=0;
        boolean allNeg = true;
       
        for(int i=0; i<nums.length; i++) {
            if(nums[i]>=0){
                allNeg = false;
            }
            curr+=nums[i];
            if(curr<0) {
                 curr = 0;
            } 
                maxSum = Math.max(maxSum, curr);
        }

          if(allNeg) {
             maxSum=nums[0];
             for(int i=0; i<nums.length; i++) {
               
             maxSum=Math.max(maxSum, nums[i]);
             }
          }  
        

        return maxSum;
    }
}