class Solution {
    public int pivotIndex(int[] nums) {
        
        int n=nums.length;
        int totalSum = 0;
        //find total sum
        for(int i=0; i<n; i++) {
            totalSum+=nums[i];
        }

        int leftSum=0;
        int rightSum=0;
        for(int i=0; i<n; i++) {
           rightSum=totalSum-leftSum-nums[i];
           if(leftSum == rightSum) return i;
           leftSum+=nums[i];
           
        }

        return -1;
    }
}

    // for(int i=0; i<nums.length; i++) {
    //         int left = 0;
    //         int right = 0;
    //         int j=i;
            
    //         int k=i;
    //         while(j>=0) {
    //             left += nums[j]; 
    //             j--; 
    //         }
    //         left-=nums[i];
    //         while(k<=nums.length-1) {
    //             right+=nums[k];
    //             k++;
    //         }

    //         right-=nums[i];

    //         if(left == right) return i;
    //     }  

    //     return -1;