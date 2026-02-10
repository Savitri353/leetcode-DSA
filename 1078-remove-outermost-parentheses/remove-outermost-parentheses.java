class Solution {
    public String removeOuterParentheses(String s) {
    
        StringBuilder sb = new StringBuilder();

        int count = 0;
        for(int i=0; i<s.length(); i++) {
            
            if(s.charAt(i) == '(') {
                if(count>0) {
                    sb.append(s.charAt(i));
                }
                count++;
            } else { //')'
               count--;
               if(count>0) {
                 sb.append(s.charAt(i));
               }
            }
        }

        return sb.toString();
    }
}    

//in both cases, i mean whenever we get '(' we have to increase count and whenever we get ')' we have to decrease it.