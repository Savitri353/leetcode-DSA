import java.util.*;

public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();

        boolean[] visited = new boolean[nums.length];

        solve(list, new ArrayList<>(), visited, nums);
        return list;
    } 

    public void solve(List<List<Integer>> list, List<Integer> temp, boolean[] visited, int[] nums) {
        if(temp.size() == nums.length) {
            list.add(new ArrayList<>(temp));
            return;
        }

        for(int i=0; i<nums.length; i++) {
            if(visited[i]) continue;

            temp.add(nums[i]);
            visited[i] = true;
            solve(list, temp, visited, nums);
            
            temp.remove(temp.size()-1);
            visited[i] = false;
        }
    }

}

//O(n × n!) time complexity