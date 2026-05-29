class Solution {
    public int findGCD(int[] nums) {
        
        int max=nums[0];
        int min=nums[0];

        for(int i=1; i<nums.length; i++) {
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
        }


        int a = max;
        int b = min;

        while(b!=0) {
            int b1=b;
            b = a%b;
            a = b1;
        }

        return a;
    }
}