class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        //sliding window
        int n=nums.length-1;
        int i=0, j=0;

        int sum=0;
        int minL = Integer.MAX_VALUE;
        while(j<=n) {
            sum+=nums[j];

            while(sum>=target) {
                minL = Math.min(minL, j-i+1);
                sum-=nums[i];
                i++;
            }

            j++;
        }

        return minL==Integer.MAX_VALUE?0:minL;
    }
}

//Since all elements are positive, I used a sliding window to expand until the sum reaches the target and shrink it to find the minimum length
//O(n)