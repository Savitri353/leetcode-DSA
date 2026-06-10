class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, ArrayList<String>> mp = new HashMap<>();

        for(String ans:strs) {

            char[] key = ans.toCharArray();
            Arrays.sort(key);

            String keySort = new String(key);

            if(!mp.containsKey(keySort)) {
                mp.put(keySort, new ArrayList<>());
            }

            mp.get(keySort).add(ans);
        }


        return new ArrayList<>(mp.values());
    }
}    