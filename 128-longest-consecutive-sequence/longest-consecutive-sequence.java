class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();

        for(int e:nums) {
            set.add(e);
        }

     
        int maxL = 0;
        for(int n:set) {
            //we are only taking the starting element, not the element that comes between the chain
            if(!set.contains(n-1)) {
                   int currL = 1;

                   while(set.contains(n+1)) {
                    n++;
                    currL++;
                   }  

                   maxL = Math.max(maxL, currL);      
            }
        }

        return maxL;
    }
}