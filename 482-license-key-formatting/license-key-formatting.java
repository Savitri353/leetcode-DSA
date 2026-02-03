class Solution {
    public String licenseKeyFormatting(String s, int k) {
       
       //clean the string
       StringBuilder sb = new StringBuilder();

       int i=0;
       while(i<s.length()) {
          if(s.charAt(i) == '-') {
            i++;
          } else {
            sb.append(Character.toUpperCase(s.charAt(i)));
            i++;
          }
       }

       StringBuilder ans = new StringBuilder();
       i = sb.length()-1;

        int count = 0;
       while(i>=0) {
            ans.append(sb.charAt(i--));
            count++;
            if(i >= 0 && count == k) {
                ans.append('-');
                count = 0;
            }
       }

       return ans.reverse().toString();
    }
}