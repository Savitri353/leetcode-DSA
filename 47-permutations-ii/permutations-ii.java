class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        Arrays.sort(nums);

        solve(result, new ArrayList<>(), used, nums);
        return result;
    }

    public void solve(List<List<Integer>> result, List<Integer> temp, boolean[] used, int[] nums) {
        if(temp.size() == nums.length) {
            result.add(new ArrayList<>(temp));
            return;
        }

        for(int i=0; i<nums.length; i++) {
            if(used[i]) continue;

            if(i>0 && nums[i] == nums[i-1] && !used[i-1]) continue;

            temp.add(nums[i]);
            used[i] = true;

            solve(result, temp, used, nums);

            temp.remove(temp.size()-1);
            used[i] = false;
        }
    }
}