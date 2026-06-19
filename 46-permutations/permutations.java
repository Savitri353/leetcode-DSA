import java.util.*;

public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];

        solve(list, visited, new ArrayList<>(), nums);
        return list;
    }

    public void solve(List<List<Integer>> list, boolean[] visited, List<Integer> temp, int[] nums) {

        if(temp.size()==nums.length) {
            list.add(new ArrayList<>(temp));
            return;
        }

        for(int i=0; i<nums.length; i++) {
            if(visited[i]) {
                continue;
            }
            visited[i] = true;
            temp.add(nums[i]); //do
            solve(list, visited,temp, nums); //explore
            temp.remove(temp.size()-1); //undo
            visited[i] = false;
        }
    }
}       

