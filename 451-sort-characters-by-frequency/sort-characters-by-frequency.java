class Solution {
    public String frequencySort(String s) {
        
        HashMap<Character, Integer> mp = new HashMap<>();

        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            mp.put(c, mp.getOrDefault(c,0)+1);
        }

        PriorityQueue<Character> pq = new PriorityQueue<>(
            (a,b)-> mp.get(b) - mp.get(a)
        );

        pq.addAll(mp.keySet());
        StringBuilder sb = new StringBuilder();

        while(!pq.isEmpty()) {

            char c = pq.poll();

            for(int i=0; i<mp.get(c); i++) {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}