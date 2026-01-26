class Solution {
    public char findTheDifference(String s, String t) {
        String t1 = t.toLowerCase();
        String s1 = s.toLowerCase();
      
        int[] freq1 = new int[26];
        for(int i=0; i<t1.length(); i++) {
            freq1[t1.charAt(i) -'a']++;
        }
         
      
       for(int i=0; i<s1.length(); i++) {
            freq1[s1.charAt(i)-'a']--;
       }
 
       char c=' ';
       for(int i=0; i<26; i++) {
        if(freq1[i] == 1) {
           c=(char)(i+'a');
           break;
        }
       }
       return c;
    }
}