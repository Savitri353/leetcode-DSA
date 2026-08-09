class Solution {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a,b)-> a[0]-b[0]);

        ArrayList<int[]> list = new ArrayList<>();

        for(int[] curr:intervals) {

            if(list.isEmpty() || curr[0] > list.get(list.size()-1)[1]) {
                list.add(curr);
            } else {
                list.get(list.size()-1)[1] = Math.max(list.get(list.size()-1)[1], curr[1]);
            }
        }

        return list.toArray(new int[list.size()][]);
    }
}    