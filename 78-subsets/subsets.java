class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        
        solve(0, nums, list, new ArrayList<>());
        return list;
    }

    public void solve(int i, int[] nums, List<List<Integer>> list, List<Integer> temp) {
        if(i==nums.length) {
            list.add(new ArrayList<>(temp));
            return;
        }

        //first take element
        temp.add(nums[i]);
        solve(i+1, nums, list, temp);
        //undo, remove element from the temp list
        temp.remove(temp.size()-1);
        solve(i+1, nums, list, temp);

    }
}

//tc : every element has two options(take or not take) and we have two elements: so 2^n