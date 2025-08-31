class Solution {
    public int lengthOfLongestSubstring(String s) {
       Map<Character, Integer> map = new HashMap<>();

        int l=0, maxLength=0;
       for(int r=0; r<s.length(); r++) {
            char c = s.charAt(r);
            if(map.containsKey(c) && map.get(c)>=l) {
                l = map.get(c)+1;
            }

            map.put(c, r);
            maxLength = Math.max(maxLength, r-l+1);
       } 

       return maxLength;
    }
}