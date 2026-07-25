class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, ArrayList<String>> mp = new HashMap<>();

        for(int i=0; i<strs.length; i++) {

            char[] curr = strs[i].toCharArray();
            Arrays.sort(curr);
            String key = new String(curr);

             if(!mp.containsKey(key)) {
                mp.put(key, new ArrayList<>());
             }

             mp.get(key).add(strs[i]);
        }

        return new ArrayList<>(mp.values());
    }
}