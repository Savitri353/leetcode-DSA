class Solution {
    public int maxArea(int[] height) {
    //     //idea over here, that is as width decreasing be greedy to find..
    //     //max height by avoiding small height.
       
    //    //1.width 2.height 3.maxArea 4. decrese from which side
    //   int n=height.length;
    //   //two pointers
    //   int i=0, j=n-1;
    //   int maxA = 0;

    //   while(i<j) {
    //     int width = j-i;
    //     int minHeight = Math.min(height[i], height[j]);
    //     int area = width*minHeight;
    //     maxA = Math.max(maxA, area);

    //     if(height[i]<height[j]) { //If you move left: Width decreases, 
    //         i++;                  // BUT the height might increase
    //     } else {
    //         j--;
    //     }
    //   }

    //   return maxA;
    // }

    int j=height.length-1;
    int i=0;
    int maxArea = 0;
    while(i<j) {
        int width = j-i;
        int Minheight = Math.min(height[i], height[j]);
        maxArea = Math.max(maxArea, width*Minheight);

        if(height[i]<height[j]) {
            i++;
        } else {
            j--;
        }
    }

    return maxArea;
    }
}

//since the water is limited by the shorter line, i use two pointers starting from both ends. At each step, i calculated the area and move the pointer with smaller height, becasue moving the taller one cant increase the area.this gives O(n) solution.