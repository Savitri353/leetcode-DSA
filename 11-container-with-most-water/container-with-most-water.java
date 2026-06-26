class Solution {
    public int maxArea(int[] h) {

        int minHeight = 0;
        int maxWater = 0;
        int i = 0;
        int j = h.length-1;

        while(i<=j) {

            minHeight = Math.min(h[i], h[j]);
            int width = j-i;

            maxWater = Math.max(maxWater, width*minHeight);

            if(h[i]>h[j]) {
                j--;
            } else {
                i++;
            }
        }

        return maxWater;
    }
}    

      