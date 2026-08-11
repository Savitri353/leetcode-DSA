class Solution {
    public int maxArea(int[] height) {
        
        int i = 0;
        int j = height.length-1;

        int maxW = 0;
        while(i<j) {
            int width = j-i;
            int h = Math.min(height[i], height[j]);
            int currW = width*h;

            maxW = Math.max(maxW, currW);

            if(height[i]<height[j]) {
                i++;
            } else {
                j--;
            }
        }

        return maxW;
    }
}