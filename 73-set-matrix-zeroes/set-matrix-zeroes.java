class Solution {
    public void setZeroes(int[][] matrix) {
         int n=matrix.length;
         int m=matrix[0].length;

         boolean firstRowImpacted = false;
         boolean firstColImpacted = false;
        
        for(int col=0; col<m; col++) {
            if(matrix[0][col] == 0) {
                firstRowImpacted = true;
            }
        }

        for(int row=0; row<n; row++) {
            if(matrix[row][0] == 0) {
                firstColImpacted = true;
            }
        }
        //set markers
        //now skip first row and col, and look for the zero and mark it's first row and col
        for(int i=1; i<n; i++) {
            for(int j=1; j<m; j++) {
                if(matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        //now set the 0 wherever required
         for(int i=1; i<n; i++) {
            for(int j=1; j<m; j++) {
                if(matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
   
                }
            }
        }

        //now handle first row and col
        if(firstRowImpacted) {
            for(int j=0; j<m; j++) {
                matrix[0][j] = 0;
            }
        }

        if(firstColImpacted) {
            for(int i=0; i<n; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}            
        //2.better approach with less extra spase
    //     int n=matrix.length;
    //     int m=matrix[0].length;
    //     boolean[] row = new boolean[n];
    //     boolean[] col = new boolean[m];

    //     for(int i=0; i<n; i++) {
    //         for(int j=0; j<m; j++) {
    //             if(matrix[i][j] == 0) {
    //                 row[i] = true;
    //                 col[j] = true;
    //             }
    //         }
    //     }

    //     for(int i=0; i<n; i++) {
    //         for(int j=0; j<m; j++) {
    //             if(row[i] == true || col[j] == true) {
    //                     matrix[i][j]=0;
    //             }
    //         }
    //     } 
    

        // //1.******brute force approach with extra space, with extra space 


        // int n=matrix.length;
        // int m=matrix[0].length;
        // int[][] temp = new int[n][m];

        //  for(int i=0; i<n; i++) {
        //     for(int j=0; j<m; j++) {
        //         temp[i][j] = matrix[i][j];
        //     }
        //  }

        // for(int i=0; i<n; i++) {
        //     for(int j=0; j<m; j++) {
        //         if(matrix[i][j] == 0) {
        //             for(int k=0; k<m; k++) { //for row
        //                 temp[i][k] =0;
        //             }

        //             for(int k=0; k<n; k++) { //for col
        //                 temp[k][j] = 0;
        //             }
        //         }
        //     }
        // }

        //  for(int i=0; i<n; i++) {
        //     for(int j=0; j<m; j++) {
        //         matrix[i][j] = temp[i][j];
        //     }
        //  }
       

