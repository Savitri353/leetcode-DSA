

class Solution {

    public int orangesRotting(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        Queue<int[]> q = new LinkedList<>();

        int freshCount = 0;

        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(grid[i][j] == 2) {
                    q.add(new int[] {i, j});
                } else if(grid[i][j] == 1) {
                    freshCount++;
                }
            }
        }

        if(freshCount == 0) {
            return 0;
        }

        int[][] dir = {{-1, 0}, {0, 1}, {1,0}, {0, -1}};

        int minutes = 0;

        while(!q.isEmpty() && freshCount > 0 ) {
            int size = q.size();

            for(int i=1; i<=size; i++) {
                int[] currunt = q.remove();

                int cu_i = currunt[0];
                int cu_j = currunt[1];

                for(int[] d:dir) {
                    int new_i = cu_i+d[0];
                    int new_j = cu_j+d[1];

                    if(new_i>=0 && new_i<m && new_j>=0 && new_j<n && grid[new_i][new_j] == 1) {
                        grid[new_i][new_j] = 2;
                        q.add(new int[] {new_i, new_j});
                        freshCount--;
                    }
                }
            }

              minutes++;
        }

        return freshCount == 0 ? minutes: -1;

    }
}       