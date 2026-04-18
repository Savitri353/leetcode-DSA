class Solution {
    public int characterReplacement(String s, int k) {
        int maxL=0, maxF=0, left=0, right=0;

        int[] freq = new int[26];

        for(right = 0; right<s.length(); right++) {
            freq[s.charAt(right) - 'A']++;
            
            maxF = Math.max(maxF, freq[s.charAt(right) - 'A']);

            //for invalid window
            while((right-left+1) - maxF > k) {
                freq[s.charAt(left) - 'A']--;
                left++;
               
            }

            maxL = Math.max(maxL, right-left+1);
        }

        return maxL;
    }
}