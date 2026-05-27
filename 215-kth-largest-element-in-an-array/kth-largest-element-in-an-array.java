class Solution {
    public int findKthLargest(int[] nums, int k) {
      
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int num:nums) {
            pq.add(num);

            if(pq.size()>k) {
                pq.poll();
            }
        }

        return pq.poll();
    }
}

//since Sorting is not allowed, i used a min-heap of size k
// i keep only the k largest elements, and the root of the heap gives me the kth largest element.