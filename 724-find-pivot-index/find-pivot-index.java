class Solution {
    public int pivotIndex(int[] nums) {
        for(int i=0; i<nums.length; i++) {
            int left = 0;
            int right = 0;
            int j=i;
            
            int k=i;
            while(j>=0) {
                left += nums[j]; 
                j--; 
            }
            left-=nums[i];
            while(k<=nums.length-1) {
                right+=nums[k];
                k++;
            }

            right-=nums[i];

            if(left == right) return i;
        }  

        return -1;
    }
}