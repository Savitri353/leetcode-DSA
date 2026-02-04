class Solution {
    public String removeDuplicates(String s) {
        
        StringBuilder sb = new StringBuilder(); //treat sb as stack, simulate a stack using sb

        int i=0;

        while(i<s.length()) {
            char ch = s.charAt(i);
            int length = sb.length();

            if(length > 0 && sb.charAt(length-1) == ch) {
                sb.deleteCharAt(length-1); //pop

            } else {
               sb.append(s.charAt(i)); //push
            }

            i++;
        }

        return sb.toString();
    }
}