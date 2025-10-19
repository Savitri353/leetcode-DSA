class Solution {
    public String longestPalindrome(String s) {
      int maxL = 1;
      int n = s.length();
      int start = 0;
      if(n<2) {
        return s;
      } 

      for(int i=0; i<n; i++) {
        int len1 = expand(s, i,i); //for odd
        int len2 = expand(s,i,i+1); //for even
        int len = Math.max(len1, len2);

        if(len>maxL) {
            start = i-(len-1)/2;
            maxL = len;
        }
      }

      return s.substring(start, start+maxL);
    }

    public int expand(String s, int left, int right) {
            while(left>=0 && right <= s.length()-1 && s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
            }

            return right-left-1;
    }
}