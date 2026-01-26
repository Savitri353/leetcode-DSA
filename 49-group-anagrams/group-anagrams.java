class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for(String s:strs) {

            char[] strArr = s.toCharArray();
            Arrays.sort(strArr);

            String str = new String(strArr);
            if(!map.containsKey(str)) {
                map.put(str, new ArrayList<>());
            }
            
            map.get(str).add(s);
        }

        return new ArrayList<>(map.values());
    }  
}