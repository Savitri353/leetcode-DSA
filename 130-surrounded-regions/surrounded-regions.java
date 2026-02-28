class Solution {
    public void solve(char[][] board) {
        int r = board.length; //row
        int c = board[0].length; //col
        boolean[][] visited = new boolean[r][c];

        //mark boarder O's , and from there all O's visited, because they are not surrounded by x
        
        //for row , first row and last row
        for(int j=0; j<c; j++) {
            //for first row
            if(board[0][j] == 'O' && !visited[0][j]) {
                dfs(board, visited, 0, j);
            }

            //for last row
            if(board[r-1][j] == 'O' && !visited[r-1][j]) {
                dfs(board, visited, r-1, j);
            }
        }

        //for col, first col and last col
         for(int i=0; i<r; i++) {
            //for first col
            if(board[i][0] == 'O' && !visited[i][0]) {
                dfs(board, visited, i, 0);
            }

            //for last col
            if(board[i][c-1] == 'O' && !visited[i][c-1]) {
                dfs(board, visited, i, c-1);
            }
        }

        //now convert remaining O's to x, which are surrounded
        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                if(board[i][j] == 'O' && visited[i][j] == false) {
                    board[i][j] = 'X';
                }
            }
        }
    }

    public void dfs(char[][] board, boolean[][] visited, int i, int j) {
        if(i<0 || j<0 || i>board.length-1 || j>board[0].length-1 || board[i][j] == 'X' || visited[i][j]) {
            return;
        }

        visited[i][j] = true;
        dfs(board, visited, i+1, j);
        dfs(board, visited, i-1, j);
        dfs(board, visited, i, j+1);
        dfs(board, visited, i, j-1);
    }
}