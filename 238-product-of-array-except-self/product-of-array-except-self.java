class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] prefix = new int[n];
        // int[] suffix = new int[n];

        int pref = 1;
        for(int i=0; i<n; i++) {
            prefix[i] = pref;
            pref*=nums[i];
        }

        int suff = 1;
        for(int i=n-1; i>=0; i--) {
            prefix[i]*=suff;
            suff*=nums[i];
        }

        return prefix;
    }
}