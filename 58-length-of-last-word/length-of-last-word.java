class Solution {
    public int lengthOfLastWord(String s) {

        //aproachh 1
        // s = s.trim();
        // String[] arr = s.split("\\s+");

        // return arr[arr.length-1].length();

        //approach 2

        s = s.trim();
        int i=s.length()-1;

        int l=0;
        while(i>=0 && s.charAt(i) != ' ') {
            l++;
            i--;
        }

        return l;
    }
}