class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        int n = nums.length;
        int[] result = new int[n];
        int[] pos = new int[n/2];
        int[] neg = new int[n/2];

        int p=0, q=0;
        for(int i=0; i<n; i++) {
            if(nums[i]>0) {
                 pos[p++] = nums[i];
            } else {
                neg[q++] = nums[i];
            }
        }

        int i=0, j=0,k=0;
        while(i<pos.length && j<neg.length) {
            result[k++] = pos[i++];
            result[k++] = neg[j++];
        }

        return result;
    }
}