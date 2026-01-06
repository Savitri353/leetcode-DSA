class Solution {
    public boolean exist(char[][] board, String word) {
        int m=board.length;
        int n = board[0].length;

        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(solve(board, i, j, word, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean solve(char[][] board, int row, int col, String word, int idx) {
        if(idx == word.length()) {
            return true;
        }

        if(row<0 || col<0 || row>=board.length || col>=board[0].length || board[row][col] != word.charAt(idx)) {
            return false;
        }

        //mark current cell as visited
        char temp = board[row][col];
        board[row][col] = '#';

        //explore all 4 direction for current cell
        boolean found = solve(board, row+1, col, word, idx+1)|| 
        solve(board, row-1, col, word, idx+1)|| 
        solve(board, row, col+1, word, idx+1)||
        solve(board, row, col-1, word, idx+1);

        // Step 4: backtrack (unmark)
        board[row][col] = temp;
        return found;
    }
}