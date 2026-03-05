class Solution {
    public int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;
        
        for(int i=0; i<nums.length; i++) {
            if(count == 0) {
                candidate = nums[i];
            }

            if(candidate == nums[i]) {
                count++;
            } else {
                count--;
            }

            
        }

        return candidate;
    }

}

// I used Boyer–Moore Voting Algorithm which works in O(n) time and O(1) space. Since the majority element appears more than n/2 times, it cannot be eliminated by pairwise cancellation.