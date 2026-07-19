class Solution {
    public int trap(int[] ht) {
        
        int n = ht.length;

        //1. find left max for each bar

        int[] lMax = new int[n];
        int leftM = 0;

        for(int i=0; i<n; i++) {
           leftM  = Math.max(ht[i], leftM);
           lMax[i] = leftM;
        }

        //2 find right left max for each bar

        int rightM = 0;
        int[] rMax = new int[n];

        for(int i=n-1; i>=0; i--) {
            rightM = Math.max(rightM, ht[i]);
            rMax[i] = rightM;
        }

        int w=0;
        for(int i=0; i<n; i++) {
            int water = Math.min(lMax[i], rMax[i]) - ht[i];
            w+= water;
        }

        return w;
    }
}