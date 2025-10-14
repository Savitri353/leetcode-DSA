class Solution {
    public int lengthOfLongestSubstring(String s) {
      Set<Character> s1 = new HashSet<>();
    
      int maxL = 0;  
      int l=0;
      for(int r=0; r<s.length(); r++) {
        while(s1.contains(s.charAt(r))) {
            s1.remove(s.charAt(l));
            l++;
        }

        s1.add(s.charAt(r));
        maxL=Math.max(maxL, r-l+1);
      }

      return maxL;
    }
}