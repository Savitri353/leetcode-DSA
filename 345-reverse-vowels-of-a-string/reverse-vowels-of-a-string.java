class Solution {
    public String reverseVowels(String s) {
       Set<Character> set = new HashSet<>();
       set.add('a');
       set.add('e');
       set.add('i');
       set.add('o');
       set.add('u');
       
       char[] str = s.toCharArray();
       int st=0;
       int e=str.length-1;

       while(st<e) {
       
           while(st<e && !set.contains(Character.toLowerCase(str[st]))) {
                st++;
           }

            while(st<e && !set.contains(Character.toLowerCase(str[e]))) {
                e--;
           }

           char temp = str[st];
           str[st] = str[e];
           str[e] = temp;

            st++;
            e--;
       }

       return new String(str);
    }
}