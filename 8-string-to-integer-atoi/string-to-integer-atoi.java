class Solution {
    public int myAtoi(String s) {
        int i=0, n=s.length();
        int num = 0;
        int sign = 1;

        //skip whitespace
        while(i<n && s.charAt(i) == ' ') i++;

        //check sign
        if(i<n && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
            sign = s.charAt(i) == '-'?-1:1;
            i++;
        }

        //form number
        while(i<n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i)-'0';

            //check overflow before adding new number
            //num*10+digit;,  num should be num<=Integer.MAX_VALUE

            if(num>(Integer.MAX_VALUE-digit)/10) { 
                return sign==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
            }

            num = num*10+digit;
            i++;
        }

        return sign*num;
    }
}