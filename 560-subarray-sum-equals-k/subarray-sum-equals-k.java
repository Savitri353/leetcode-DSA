class Solution {
    public int subarraySum(int[] nums, int k) {
       HashMap<Integer, Integer> mp = new HashMap<>();
        mp.put(0,1);
       int currentSum = 0;
       int result=0;

       for(int i=0; i<nums.length; i++) {
        currentSum+=nums[i];

        if(mp.containsKey(currentSum-k)) {
            result += mp.get(currentSum-k);
        } 
        mp.put(currentSum, mp.getOrDefault(currentSum, 0)+1);
       }

       return result;
    }
}
//O(n) tc
//1️ Keep a running prefix sum and a HashMap to store its frequency.
//2 For each element, if (currentSum − k) exists in the map, add its count to the answer.
//3 Update the map with the current prefix sum.