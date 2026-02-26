class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        
        boolean[] visited = new boolean[rooms.size()];

        dfs(rooms, visited, 0);

        for(int i=0; i<rooms.size(); i++) {
            if(!visited[i]) return false;
        }

        return true;
    }

    public void dfs(List<List<Integer>> rooms, boolean[] visited, int start) {

        visited[start] = true;

        for(int neighbour:rooms.get(start)) {
            if(!visited[neighbour]) {
                dfs(rooms, visited, neighbour);
            }
        }
    }
}