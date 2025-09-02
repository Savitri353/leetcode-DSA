class Solution {
    public String reverseWords(String s) {
        s = s.trim();

        String[] word = s.split("\\s+");

        StringBuilder sb = new StringBuilder();

        int n = word.length-1;
        for(int i=n; i>=0; i--) {
            sb.append(word[i]);
            if(i!=0) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }
}
