class Solution {
    public int trap(int[] ht) {
        int n = ht.length;

        int[] leftM = new int[n];
        int[] rightM = new int[n];

        //find the left M 
        int leftMax=0;
        for(int i=0; i<n; i++) {
            leftMax = Math.max(leftMax, ht[i]);
            leftM[i] = leftMax;
        }

        //find the RightM
        int rightMax = 0;
        for(int i=n-1; i>=0; i--) {
            rightMax = Math.max(rightMax, ht[i]);
            rightM[i] = rightMax;
        }

        //calculate total water
        int w=0;
        for(int i=0; i<n; i++) {
            w += (    Math.min(rightM[i], leftM[i])   - ht[i] );
        }

        return w;
    }
}