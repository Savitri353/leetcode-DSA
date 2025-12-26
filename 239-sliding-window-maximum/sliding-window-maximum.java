import java.util.*;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] ans = new int[nums.length-k+1];
        Deque<Integer> dq = new ArrayDeque<>();

        //step-1
        for(int i=0; i<k; i++) {
            //first remove elements from the deques that are not can be answer
            while(dq.size()>0 && nums[dq.peekLast()] <= nums[i]) {
                dq.pollLast();
            }

            dq.offerLast(i);
        }

        //step 2
        int index=0;
        for(int i=k; i<nums.length; i++) {

            ans[index++] = nums[dq.peekFirst()];
            //maintain correct window.
            while(dq.size()>0 && dq.peekFirst() <= i-k) {
                dq.pollFirst();
            }

            //remove the smaller valuse from back
            while(dq.size()>0 && nums[dq.peekLast()] <= nums[i]) {
                dq.pollLast();
            }

            dq.offerLast(i);
            
        }

        ans[ans.length-1] = nums[dq.peekFirst()];

        return ans;
    }
}
