class Solution {
    public String longestPalindrome(String s) {

        if(s==null || s.length()<2) {
            return s;
        }

        int startIndex=0;
        int maxL = 1;

        for(int i=0; i<s.length(); i++) {

            int l1 = expandFromCenter(s, i, i);
            int l2 = expandFromCenter(s, i, i+1);
            int l = Math.max(l1, l2);

            if(l>maxL) {
                startIndex = i-(l-1)/2;
                maxL = l;
            }
        }

        return s.substring(startIndex, startIndex+maxL);
    }

    public int expandFromCenter(String s, int left, int right) {
        
        while(left>=0 && right<s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        return right-left-1;
    }
}