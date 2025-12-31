class Solution {
    public List<List<Integer>> combinationSum(int[] array, int target) {
        List<List<Integer>> result = new ArrayList<>();

        solve(result, new ArrayList<>(), target, 0, array);
        return result;
    }

    public void solve(List<List<Integer>> result, List<Integer> temp, int target, int idx, int[] array) {
        if(target == 0) {
            result.add(new ArrayList<>(temp));
            return;
        }

        if(target<0 || idx == array.length) {
            return;
        }

        //take
        temp.add(array[idx]);
        //explore
        solve(result, temp, target-array[idx], idx, array);
        //remove
        temp.remove(temp.size()-1);
        //explore
        solve(result, temp, target, idx+1, array);
    }
}