class Solution {
    public List<List<Integer>> combinationSum(int[] array, int target) {
        List<List<Integer>> result = new ArrayList<>();

        solve(result, new ArrayList<>(), array, target, 0);
        return result;
    }

    public void solve(List<List<Integer>> result, List<Integer> temp, int[] array, int target, int i) {
        if(target == 0) {
            result.add(new ArrayList<>(temp));
            return;
        }

        if(target<0 || i == array.length) {
            return;
        }

        temp.add(array[i]); //take
        solve(result, temp, array, target-array[i], i); //explore
        temp.remove(temp.size()-1); //undo
        solve(result, temp, array, target, i+1); //explore

    }
}    