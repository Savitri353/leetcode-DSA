class Solution {
    public List<List<Integer>> combinationSum(int[] array, int target) {
       List<List<Integer>> list = new ArrayList<>();

       solve(list, new ArrayList<>(), array, 0, target);
       return list;
    }

    public void solve(List<List<Integer>> list, List<Integer> temp, int[] array, int i, int target) {
        if(target == 0) {
            list.add(new ArrayList<>(temp));
            return;
        }

        if(i == array.length || target<0) {
            return;
        }

        temp.add(array[i]);
        solve(list, temp, array, i, target-array[i]);
        temp.remove(temp.size()-1);
        solve(list, temp, array, i+1, target);
    }
}    