class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> mp =new HashMap<>();

        for(String s:strs) {
            char[] sA = s.toCharArray();

            Arrays.sort(sA);

            String match = new String(sA);
            if(!mp.containsKey(match)) {
                mp.put(match, new ArrayList<>());
            }

            mp.get(match).add(s);
        }

        return new ArrayList<>(mp.values());
    }  

}