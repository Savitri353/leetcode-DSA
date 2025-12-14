class Solution {
    public int lengthOfLongestSubstring(String s) {
        //set to
        Set<Character> set = new HashSet<>();

        int left = 0;
        int maxLength = 0;

             // move right pointer
        for(int right = 0; right<s.length(); right++) {
           
           // if duplicate found, shrink window from left
            while(set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
           }

           //add current character
           set.add(s.charAt(right));

           maxLength = Math.max(maxLength, right-left+1);
        }

        return maxLength;
    }
}