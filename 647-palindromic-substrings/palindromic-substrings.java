class Solution {
    public int countSubstrings(String s) {
       int count = 0;

       for(int i=0; i<s.length(); i++) {

            //for odd length
            count += expandFromCenter(s, i, i);
            
            //for even length
            count += expandFromCenter(s, i, i+1);
       }

       return count;
    }

    public int expandFromCenter(String str, int left, int right) {
        int cnt = 0;

        while(left>=0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
            cnt++;
            left--;
            right++;
        }
        return cnt;
    }
}