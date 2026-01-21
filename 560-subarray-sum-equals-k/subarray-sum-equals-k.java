class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> mp = new HashMap<>();

        mp.put(0,1); // mp.put(cumulative sum, count);
        int cumSum = 0;
        int result = 0;

        for(int i=0; i<nums.length; i++) {
            cumSum+=nums[i];

            if(mp.containsKey(cumSum-k)) {
                result+=mp.get(cumSum-k);
            }

            mp.put(cumSum, mp.getOrDefault(cumSum, 0)+1);
        }

        return result;
    }
}