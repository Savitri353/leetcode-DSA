class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if(matrix.length==0) {
            return result;
        }

        int bottom=matrix.length-1; //row
        int right=matrix[0].length-1; //col
        int left = 0;
        int top=0;

       while(bottom>=top && right>=left) {
         
         //traverse horizontal, from left to right, col++
         for(int i=left; i<=right; i++) {
            result.add(matrix[top][i]);
         }
         top++;

         //traverse vertical, from top to bottom
         for(int i=top; i<=bottom; i++) {
            result.add(matrix[i][right]);
         }
        right--;

         //traverse bottom row, right to left
         if(top<=bottom) {
          for(int i=right; i>=left; i--) {
            result.add(matrix[bottom][i]);
          }
          bottom--;
         }
            

         //traverse left col
         if(left<=right) {
            for(int i=bottom; i>=top; i--) {
                result.add(matrix[i][left]);
            }
            left++;
         }
       }

       return result;
    }
}