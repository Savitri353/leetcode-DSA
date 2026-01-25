class Solution {
    public List<List<Integer>> combinationSum(int[] array, int target) {
        List<List<Integer>> list = new ArrayList<>();

        solve(list, new ArrayList<>(), array, target, 0);
        return list;
    }

    public void solve(List<List<Integer>> list, ArrayList<Integer> temp, int[] array, int target, int i){

        if(target == 0) {
            list.add(new ArrayList<>(temp));
            return;
        }

        if(i==array.length || target<0) {
            return;
        }

         temp.add(array[i]); //take, do
         solve(list, temp, array, target-array[i], i); // explore
         temp.remove(temp.size()-1); //undo
         solve(list, temp, array, target, i+1);//explore
    }
}    