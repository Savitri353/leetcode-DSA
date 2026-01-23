class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
       List<Integer> list = new ArrayList<>();

       int m=matrix.length-1; //row
       int n=matrix[0].length-1;//col

       int top=0;
       int right=n;
       int bottom=m;
       int left=0;

       while(top<=bottom && left<=right) {

            //top, printing top, top is constant(row)
            for(int i=left; i<=right; i++) {
                list.add(matrix[top][i]);
            }
            //update top , as first row is already printed , now it's next row's turn will be there
            //shrink the matrix
            top++;

            //print right side when col is constant
            for(int i=top; i<=bottom; i++) {
                list.add(matrix[i][right]);
            }

            //shrink from right
            right--;

            //print from bottom
            if(top<=bottom) {
                
                for(int i=right; i>=left; i--) {
                    list.add(matrix[bottom][i]);
                }
                 //shrink from bottom
                 bottom--;
            }

            //print left side
            if(right>=left) {
                for(int i=bottom; i>=top; i--) {
                    list.add(matrix[i][left]);
                }
                 //shrink from left
                left++;
            }

           

            //now first time you printed, now again go in shrinked matrix.
       }

       return list;
    }
}