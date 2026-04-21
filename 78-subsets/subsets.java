class Solution {
    public List<List<Integer>> subsets(int[] nums) {
       List<List<Integer>> ans = new ArrayList<>();

       solve(0, new ArrayList<>(), ans, nums);
       return ans;
    }

    public void solve(int i, List<Integer> temp, List<List<Integer>> ans, int[] nums) {
        if(i==nums.length) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        temp.add(nums[i]);
        solve(i+1, temp, ans, nums);
        temp.remove(temp.size()-1);
        solve(i+1, temp, ans, nums);
    }

}

//tc : every element has two options(take or not take) and we have two elements: so 2^n