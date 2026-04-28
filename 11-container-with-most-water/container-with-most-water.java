class Solution {
    public int maxArea(int[] h) {
        
        int i=0, j=h.length-1;
        int maxA = 0;

        while(i<j) {
            int width = j-i;
            int minH = Math.min(h[i], h[j]);
            int area = minH*width;
            maxA = Math.max(maxA, area);

            if(h[i] < h[j]) {
                i++;
            } else {
                j--;
            }
        }

        return maxA;
    }       
}    