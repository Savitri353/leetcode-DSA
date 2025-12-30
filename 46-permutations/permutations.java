import java.util.*;

public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        solve(result, new ArrayList<>(), nums, used);
        return result;
    }

   public void solve(List<List<Integer>> result, List<Integer> temp, int[] nums, boolean[] used) {
        if(temp.size() == nums.length) {
            result.add(new ArrayList<>(temp));
            return;
        }


        for(int i=0; i<nums.length; i++) {
            if(used[i]) continue;

            temp.add(nums[i]); //take
            used[i] = true;
            solve(result, temp, nums, used); //explore

            temp.remove(temp.size()-1); //undo and explore
            used[i] = false;

        }
    }
}
