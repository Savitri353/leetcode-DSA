class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> list = new ArrayList<>();

        int top=0;
        int bottom = matrix.length-1; //no of rows
        int right = matrix[0].length-1; //no of colunms
        int left = 0;
        int m = matrix.length;
        int n = matrix[0].length;

        while(left<=right && top<=bottom) {

            //for row, row=top fixed and col will change
            for(int i=left; i<=right; i++) {
                list.add(matrix[top][i]);
            }

            top++;
              //for col, col = right fixed and row will change  // right col
            for(int i=top; i<=bottom; i++) {
                list.add(matrix[i][right]);
            }

            //for bottom row , if exists
            right--;
            if(top<=bottom) {
                    
                for(int i=right; i>=left; i--) {
                    list.add(matrix[bottom][i]);
                }
            }

             //for left col , if exists
            bottom--;
            if(left<=right) {
                    
                for(int i=bottom; i>=top; i--) {
                    list.add(matrix[i][left]);
                }
            }

            left++;
        }

        return list;

    }
}     