class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();

        for(int num:nums) {
            set.add(num);
        }

        int ans = 0;
        for(int num:set) {
            //if it is not the part of the chain, means if it is the starting point
            if(!set.contains(num-1)) {

                int currentNum = num;
               int currentL=1; //element itself

                while(set.contains(currentNum + 1) ) {
                    currentNum++;
                    currentL++;
                }

                ans = Math.max(ans, currentL);
            }
        }

        return ans;
    }
}