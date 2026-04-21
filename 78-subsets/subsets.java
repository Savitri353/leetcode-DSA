class Solution {
    public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> list = new ArrayList<>();
    
       solve(0, nums, new ArrayList<>(), list);
       return list;
    }

   public void solve(int i, int[] nums, List<Integer> temp, List<List<Integer>> list) {
        if(i == nums.length) {
            list.add(new ArrayList<>(temp));
            return;
        }

        temp.add(nums[i]); //take
        solve(i+1, nums, temp, list); //explore
        temp.remove(temp.size()-1); //undo
        solve(i+1, nums, temp, list); //explore
    }

}

//tc : every element has two options(take or not take) and we have two elements: so 2^n