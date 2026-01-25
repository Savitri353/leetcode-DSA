class Solution {
    public String reverseWords(String s) {
        s = s.trim();

        //split the string into words
        String[] str = s.split("\\s+");
        int n = str.length-1;

        StringBuilder sb = new StringBuilder();
        for(int i=n; i>=0; i--) {
            sb.append(str[i]);
            if(i!=0) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }
}
