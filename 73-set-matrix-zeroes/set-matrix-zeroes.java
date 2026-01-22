class Solution {
    public void setZeroes(int[][] matrix) {
        //better approach with less extra spase
        int n=matrix.length;
        int m=matrix[0].length;
        boolean[] row = new boolean[n];
        boolean[] col = new boolean[m];

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(matrix[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(row[i] == true || col[j] == true) {
                        matrix[i][j]=0;
                }
            }
        } 
    }
}
        // //******brute force approach with extra space, with extra space 


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
       

