class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        Arrays.sort(strs);

        String first = strs[0];
        String second = strs[strs.length-1];

        int i=0, j=0;
        
        while(i<first.length() && j<second.length() && first.charAt(i) == second.charAt(j)) {
             
             i++;
             j++;
        }

        return first.substring(0, i);
    }
}