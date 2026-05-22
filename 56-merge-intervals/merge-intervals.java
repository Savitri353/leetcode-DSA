class Solution {
    public int[][] merge(int[][] intervals) {

        //first sort
        Arrays.sort(intervals, (a,b)-> a[0]-b[0]);
        List<int[]> result = new ArrayList<>();

        for(int[] current: intervals) {

              if(result.isEmpty() || (result.get(result.size() -1 )[1]<current[0])) {
                result.add(current);
              } else {
                result.get(result.size()-1)[1] = Math.max(current[1], result.get(result.size()-1)[1]);
              }
        }

        return result.toArray(new int[result.size()][]);
    }
}        