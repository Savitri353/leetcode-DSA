class Solution {
    public int[][] merge(int[][] intervals) {

        ArrayList<int[]> ans = new ArrayList<>();

        Arrays.sort(intervals, (a,b)->Integer.compare(a[0], b[0]));

        for(int[] current:intervals) {

            if(ans.isEmpty() || ans.get(ans.size()-1)[1] <  current[0]) {
                ans.add(current);
            } else {
                ans.get(ans.size()-1)[1] = Math.max(current[1], ans.get(ans.size()-1)[1]);
            }
         }

        return ans.toArray(new int[ans.size()][]);
    }
}    