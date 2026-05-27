

class Solution {
    
    public int orangesRotting(int[][] grid) {
        //1. find rotten and fresh , put rotten into queue
        //2. level wise, remove elements from queue and make rotten in four direction for all rotten oranges at the same time

        Queue<int[]> q = new LinkedList<>();
        int countFresh = 0;
        int n=grid.length;
        int m=grid[0].length;

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(grid[i][j] == 2) {
                    q.add(new int[] {i, j});
                } else if(grid[i][j] == 1){
                    countFresh++;
                }
            }
        }

        //if there is no fresh oranges return 0 minutes
        if(countFresh == 0) {
            return 0;
        }

        //start rittening oranges in four directionaly

        int[][] directions = {{-1,0}, {0, 1}, {1, 0}, {0, -1}};
        int minutes = 0;

        while(!q.isEmpty() && countFresh > 0) {
            int size = q.size();

            while(size>0) {

                int[] currentPos = q.poll();
                size--;

                for(int[] direction: directions) {
                    int new_i = currentPos[0] + direction[0];
                    int new_j = currentPos[1] + direction[1];

                    if(new_i>=0 && new_j>=0 && new_i<n && new_j<m && grid[new_i][new_j] == 1) {
                        grid[new_i][new_j] = 2;
                        q.add(new int[] {new_i, new_j});
                        countFresh--;
                    }
                }

            }

            minutes++;
        }


        return countFresh == 0 ? minutes : -1;

    }
}    