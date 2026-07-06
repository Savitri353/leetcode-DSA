class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       //1 store frequency

       HashMap<Integer, Integer> mp = new HashMap<>();

       for(int num: nums) {
         mp.put(num, mp.getOrDefault(num, 0) + 1);
       }

       //use priorityQueue
       PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a,b)-> a.getValue()-b.getValue());

       for(Map.Entry<Integer, Integer> entry: mp.entrySet()) {
            pq.offer(entry);

            if(pq.size()>k) {
                pq.poll();
            }
       }

       //store ans
       int[] result = new int[k];

        int idx = 0;
       while(!pq.isEmpty()) {
        result[idx++] = pq.poll().getKey();
       }

       return result;
    }
}