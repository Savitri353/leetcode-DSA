class Solution {
    public boolean isAnagram(String s, String t) {
       if(s.length() != t.length()) {
          return false;
       }

       int[] count1 = new int[26];
    
       for(int i=0; i<s.length(); i++) {
            char s1 = s.charAt(i);
            char t2 = t.charAt(i);
            count1[s1-'a']++;
            count1[t2-'a']--;
       }

      for(int c:count1) {
        if(c != 0) {
            return false;
        }
      } 
        return true;
    }
}