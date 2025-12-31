class Solution {
    public List<List<Integer>> combinationSum2(int[] Arr, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(Arr);
        solve(list, new ArrayList<>(), Arr, target, 0);
        return list;
    }

    public void solve(List<List<Integer>> list, List<Integer> temp, int[] Arr, int target, int idx) {
        if(target == 0) {
            list.add(new ArrayList<>(temp));
            return;
        }

        if(target<0 || idx==Arr.length) {
            return;
        }
        
        for(int i=idx; i<Arr.length; i++) {
            if(i>idx && Arr[i] == Arr[i-1]) continue;
                
           temp.add(Arr[i]); //Do
           solve(list, temp, Arr, target-Arr[i], i+1);  //explore
           temp.remove(temp.size()-1); //undo     
        }   
    }
}