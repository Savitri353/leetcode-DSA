class Solution {
    public String longestPalindrome(String s) {

        int n=s.length();
        int maxL = 0;
        int startIndex = 0;

        for(int i=0; i<n; i++) {

            int l1 = palindrome(s, i, i);
            int l2 = palindrome(s, i, i+1);

            int l = Math.max(l1, l2);

            if(maxL<l) {
                startIndex = i-(l-1)/2; //center - leftCharacters
                maxL = l; 
            }
        }

        return s.substring(startIndex, startIndex+maxL);
    }


    public int palindrome(String s, int left, int right) {

        while(left>=0 && right<s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        return right-left-1; // right - left + 1 - 2
    }
}        