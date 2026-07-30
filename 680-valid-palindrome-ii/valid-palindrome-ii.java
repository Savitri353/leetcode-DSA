class Solution {
    public boolean validPalindrome(String s) {
    
        
        int i=0, j=s.length()-1;
        int count = 1;
        while(i<j) {
            if(s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else {
                return isPalindrom(s, i+1, j) || isPalindrom(s, i, j-1);
            }   

        }

        return true;
    }

    public boolean isPalindrom(String s, int left, int right) {

            while(left<right) {
                if(s.charAt(left) != s.charAt(right)) {
                    return false;
                } 
                    left++;
                    right--;
                
            }

            return true;
    }
}