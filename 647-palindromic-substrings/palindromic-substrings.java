class Solution {
    public int countSubstrings(String s) {
       int count = 0;

       for(int i=0; i<s.length(); i++) {
           
           count+=expandFromCenter(s, i, i);

           count+=expandFromCenter(s, i, i+1);
       }

       return count;
    }

    public int expandFromCenter(String s, int left, int right) {
        int cnt = 0;

        while(left>=0 && right<s.length() && s.charAt(left) == s.charAt(right)) {
            cnt++;
            left--;
            right++;
        }

        return cnt;
    }
}