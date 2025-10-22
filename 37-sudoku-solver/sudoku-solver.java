class Solution {
    public void solveSudoku(char[][] board) {
       helper(board, 0, 0);
    }

    public boolean helper(char[][] board, int row, int col) {
        if(row==9) {
            return true;
        }

        int nextRow = row, nextCol = col+1;
        if(col==8) {
            nextRow = row+1;
            nextCol=0;
        }

        if(board[row][col] != '.') {
            return helper(board, nextRow, nextCol);
        }

        for(char i='1'; i<='9'; i++) {
            if(isSafe(i, board, row, col)) {
                board[row][col] = i;
                if(helper(board, nextRow, nextCol)) {
                    return true;
                }

                board[row][col] = '.';
            }


        }

        return false;
    }   

    public boolean isSafe(char dig, char[][] board, int row, int col) {
        //vertically

        for(int i=0; i<9; i++) {
            if(board[i][col] == dig) {
                return false;
            }
        }

        //horizontally

        for(int j=0; j<9; j++) {
            if(board[row][j] == dig) {
                return false;
            }
        }

        int sr = (row/3)*3;
        int sc = (col/3)*3;

        for(int i=sr; i<=sr+2; i++) {
            for(int j=sc; j<=sc+2; j++) {
                if(board[i][j] == dig) {
                    return false;
                }
            }
        }

        return true;
    }

}