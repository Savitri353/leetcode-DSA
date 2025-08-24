class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.isEmpty()) {
            return 0;   
        }

            int hayLen = haystack.length();
            int neeLen = needle.length();

            for(int i=0; i<=hayLen-neeLen; i++) {
                if(haystack.substring(i, i+neeLen).equals(needle)){
                    return i;
                }
            }

            return -1;

    }
}