class Solution {
    public String longestCommonPrefix(String[] v) {

        Arrays.sort(v);

        String first = v[0];
        String second = v[v.length-1];

        int i=0, j=0;
      
        while(i<first.length()  && j<second.length() && first.charAt(i) == second.charAt(i)) {
            
            i++;
            j++;
           
        }

        return first.substring(0,i);
    }
}      