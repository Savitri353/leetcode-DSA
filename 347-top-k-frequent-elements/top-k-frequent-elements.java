class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer, Integer> mp = new HashMap<>(); 
       //1. frequncy
        for(int num:nums) {
            mp.put(num, mp.getOrDefault(num, 0)+1);
        }

        //2 use minHeap based on frequency
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a,b) -> a.getValue()-b.getValue());

        for(Map.Entry<Integer, Integer> entry: mp.entrySet()) {
            pq.offer(entry);

            if(pq.size()>k) {
                pq.remove();
            }
        }

        int[] result = new int[k];

        int idx = 0;
        while(!pq.isEmpty()) {
            result[idx++] = pq.poll().getKey();
        }

        return result;
    }
}