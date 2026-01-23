class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> fremp = new HashMap<>();

        for(int i=0; i<nums.length; i++) {
            fremp.put(nums[i], fremp.getOrDefault(nums[i], 0)+1);
        }

        for(int key:fremp.keySet()) {
            if(fremp.get(key) == 1) {
                return key;
            }
        }

        return -1;
    }
}