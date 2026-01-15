class Solution {
    public List<List<String>> solveNQueens(int n) {
        char[][] arr = new char[n][n];
        for(int i=0; i<n; i++) {
            Arrays.fill(arr[i],'.');
        }

        List<List<String>> list = new ArrayList<>();
        solve(arr, list, n, 0);
        return list;
    } 

    public void solve(char[][] arr, List<List<String>> list, int n, int row) {
            if(row == n) {
                ArrayList<String> temp = new ArrayList<>();
                for(char[] ans:arr) {
                     temp.add(new String(ans));
                }
               list.add(temp);
               return;
            }

            //for each row, the loop tries all columns
            for(int j=0; j<n; j++) {
                if(isSafe(arr, row, j)) {
                    arr[row][j] = 'Q';
                    solve(arr, list, n, row+1);
                    arr[row][j] = '.';
                }
            }
    }

    public boolean isSafe(char[][] arr, int row, int col) {
        //for same col, vertically, row will update col will be constant
        for(int i=row; i>=0; i--) {
            if(arr[i][col] == 'Q') return false;
        }

        //left dia
        for(int i=row, j=col; i>=0 && j>=0; i--, j--)  {
            if(arr[i][j] == 'Q') return false;
        }

        
        //right dia
       for(int i=row,j=col; i>=0&&j<arr[0].length; i--, j++) {
            if(arr[i][j] == 'Q') return false;
       }

       return true;
    }
}  

//“For each row, the loop tries all columns. Recursion explores the next row, and if a configuration fails, backtracking removes the queen and the loop tries the next column.”