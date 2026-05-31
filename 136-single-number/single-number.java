class Solution {
    public int singleNumber(int[] nums) {

       HashMap<Integer, Integer> mp = new HashMap<>();

       for(int num:nums) {
            mp.put(num, mp.getOrDefault(num,0)+1);
       }

       for(int key:mp.keySet()) {
            if(mp.get(key) == 1) {
                return key;
            }
       }

       return -1;
    }
}