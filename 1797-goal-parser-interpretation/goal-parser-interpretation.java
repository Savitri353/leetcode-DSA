class Solution {
    public String interpret(String s) {
      
        StringBuilder sb = new StringBuilder();

         int i=0;
         while(i<s.length()) {

            if(s.charAt(i) == 'G') {
                sb.append('G');
                i++;
            } else if(i+1<s.length() && s.substring(i, i+2).equals("()")) {
                sb.append('o');
                i = i+2;
            } else if(i+3 < s.length() && s.substring(i, i+4).equals("(al)")) {
                sb.append("al");
               
                i =  i+4;
               
            } else {
                sb.append(s.charAt(i));
                i++;
            }
        }
        
        return sb.toString();
    }
}