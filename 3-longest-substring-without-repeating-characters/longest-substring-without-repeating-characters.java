class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> set = new HashSet<>();
        int maxL = 0;
        int r=0;
        int l=0;

        for(r=0; r<s.length(); r++) {
            
            while(set.contains(s.charAt(r))) {
                set.remove(s.charAt(l));
                l++;
            }

            maxL = Math.max(maxL, r-l+1);
            set.add(s.charAt(r));
        }

        return maxL;
    }
}    