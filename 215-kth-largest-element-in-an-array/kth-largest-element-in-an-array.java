class Solution {
    public int findKthLargest(int[] nums, int k) {
        //Min-heap to store only k largest elements
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        //Traverse all elements in the array
        for(int num:nums) {
            minHeap.add(num);
            //if heap size exceeds k, remove the smallest element
            //This ensures heap always contains only k largest elements
            if(minHeap.size()>k) {
                minHeap.poll();
            }
        }

        return minHeap.peek();
    }
}

//since Sorting is not allowed, i used a min-heap of size k
// i keep only the k largest elements, and the root of the heap gives me the kth largest element.