class Solution {
    public int maxArea(int[] height) {
        //idea over here, that is as width decreasing be greedy to find..
        //max heigh by avoiding small height.
       
       //1.width 2.height 3.maxArea 4. decrese from which side
        int n = height.length;
          //by two pointers
        int i=0, j=n-1;

        int maxA = 0;
        
       while(i<j) {
            int width = j-i;
            int minHeight = Math.min(height[i], height[j]);
            int A = width*minHeight;
            maxA = Math.max(maxA, A);
            if(height[i]<height[j]) {
                i++;
            } else {
                j--;
            }
       }

       return maxA;
    }
}