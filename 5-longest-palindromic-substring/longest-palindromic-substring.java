class Solution {
    public String longestPalindrome(String s) {

        int maxL = 0;
        int startIdx = 0;

        for(int i=0; i<s.length(); i++) {
            
            int l1 = palindrome(s, i, i);
            int l2 = palindrome(s, i, i+1);

            int l = Math.max(l1, l2);

            if(maxL< l) {
                startIdx = i-(l-1)/2; //  to work with even length
                maxL = l;
            } 
        }

        return s.substring(startIdx, startIdx+maxL);
    }

    public int palindrome(String s, int i, int j) {

        while(i>=0 && j<s.length() && s.charAt(i) == s.charAt(j)) {
            i--;
            j++;
        }

        return j-i-1; //because of extra i-- and j++    j-i+1-2
    }
}        