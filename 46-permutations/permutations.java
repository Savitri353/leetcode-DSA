import java.util.*;

public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];

        solve(result, visited, nums, new ArrayList<>());
        return result;
    } 

    public void solve(List<List<Integer>> result, boolean[] visited, int[] nums, List<Integer> temp) {
        if(temp.size() == nums.length) {
            result.add(new ArrayList<>(temp));
        }

        for(int i=0; i<nums.length; i++) {
            if(visited[i]) continue;

            temp.add(nums[i]); //add
            visited[i] = true;
            solve(result, visited, nums, temp); //explore
            temp.remove(temp.size()-1); //undo
            visited[i] = false;
            //explore i=i+1
        }
    }
}
