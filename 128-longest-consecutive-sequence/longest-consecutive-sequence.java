class Solution {
    public int longestConsecutive(int[] nums) {
        
       HashSet<Integer> set = new HashSet<>();

       for(int num:nums) {
          set.add(num);
       }

        int maxL = 0;

       for(int num:set) {
           if(!set.contains(num -1)) {

            int current = num;
            int curreL = 1;

            while(set.contains(current+1)) {

                current++;
                curreL++;
            }

            maxL = Math.max(maxL, curreL);

           }
       }

       return maxL;
    }
}