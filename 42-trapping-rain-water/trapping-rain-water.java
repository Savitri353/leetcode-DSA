class Solution {
    public int trap(int[] ht) {
        int n= ht.length;
        int[] maxLeft = new int[n];
        int[] maxRight = new int[n];

        int leftM = 0;
        for(int i=0; i<n; i++) {
            leftM = Math.max(leftM, ht[i]);
            maxLeft[i] = leftM;
        }

        int rightM=0;
        for(int i=n-1; i>=0; i--) {
            rightM = Math.max(rightM, ht[i]);
            maxRight[i] = rightM;
        }

        int water=0;
        for(int i=0; i<n; i++) {
            
            int w = Math.min(maxLeft[i], maxRight[i]) - ht[i];
            water += w;
        }

        return water;
    }
}