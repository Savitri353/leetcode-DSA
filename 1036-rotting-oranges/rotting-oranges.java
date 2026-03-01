

class Solution {
    
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        Queue<int[]> q = new LinkedList<>();

        int cntFresh = 0;

        //step 1: add 2's position in queue. i.e starting point
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(grid[i][j]==2) {
                    q.add(new int[]{i,j});
                    
                } else if(grid[i][j] == 1){
                    cntFresh++;

                }
            }
        }

        if(cntFresh == 0) return 0;
        int minites=0;
        int[][] directions = {{-1, 0}, {1,0}, {0,-1}, {0,1}};

        
        //step 2: now explore neighbours
        while(!q.isEmpty()) {
           int size = q.size();

            while(size-- >0) {
                
                int[] curr = q.poll();
                int i = curr[0];
                int j = curr[1];

                for(int[] dir:directions) {
                    int new_i = i+dir[0];
                    int new_j = j+dir[1];

                    if(new_i >=0 && new_j >=0 && new_i<n && new_j<m && grid[new_i][new_j] == 1) {
                        grid[new_i][new_j] = 2;
                        q.offer(new int[]{new_i, new_j});
                        cntFresh--;
                    }
                }

            }
            minites++;
        } 

        return cntFresh == 0 ? (minites-1):-1;
    }
}    