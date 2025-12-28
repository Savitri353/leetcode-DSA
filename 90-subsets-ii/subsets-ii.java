class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);

        solver(list, new ArrayList<>(), nums, 0);
        return list;
    }

    public void solver(List<List<Integer>> list, List<Integer> temp, int[] nums, int i) {
        if(i == nums.length) {
            list.add(new ArrayList<>(temp));
            return;
        }

        temp.add(nums[i]); //take element
        solver(list, temp, nums, i+1);
        temp.remove(temp.size()-1);//not take elemetn

        //now ignore the not take part for duplicate elements.
        int idx = i+1;
        while(idx<nums.length && nums[idx] == nums[idx-1]) {
            idx++;
        }

        solver(list, temp, nums, idx);

    }
}