class Solution {
    public int lengthOfLongestSubstring(String s) {
       Set<Character> st = new HashSet<>();

       int l = 0, r = 0, maxL = 0;

       for(r = 0; r<s.length(); r++) {
            while(st.contains(s.charAt(r))) {
                st.remove(s.charAt(l));
                l++;
            }

            st.add(s.charAt(r));

            maxL = Math.max(maxL, r-l+1);
       }

       return maxL;
    }
}