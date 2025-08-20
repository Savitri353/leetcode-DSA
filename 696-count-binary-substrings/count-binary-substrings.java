class Solution {
    public int countBinarySubstrings(String s) {
         int prev = 0;   // size of previous group
        int curr = 1;   // size of current group (start with first char)
        int ans = 0;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                curr++; // same char as previous, increase count
            } else {
                ans += Math.min(prev, curr); // add min of two groups
                prev = curr;  // shift current to previous
                curr = 1;     // reset current group size
            }
        }

        ans += Math.min(prev, curr); // add last comparison
        return ans; 
    }
}