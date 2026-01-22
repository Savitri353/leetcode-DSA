class Solution {
    public int[][] merge(int[][] intervals) {
        //Sort the array according to the starting values, so that Overlapping intervals will come next to each other so we will only compare the current intervals with previous one

        Arrays.sort(intervals, (a,b)->a[0]-b[0]);
        List<int[]> result = new ArrayList<>();

        //Traverse on the array
        for(int[] inter : intervals) {

            //add to the list if result is empty, or no overlap
            if(result.isEmpty() || result.get(result.size()-1)[1]<inter[0]) {
                result.add(inter);
            } else {
                result.get(result.size()-1)[1] = Math.max(result.get(result.size()-1)[1], inter[1]);
                 
            }
        }

        return result.toArray(new int[result.size()][]);
    }
}