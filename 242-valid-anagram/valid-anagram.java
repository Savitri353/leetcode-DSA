class Solution {
    public boolean isAnagram(String s, String t) {
     //1. this is only for lowercase english later
        // if(s.length() != t.length()) {
        //     return false;
        // }

        // int[] freq = new int[26];

        // for(int i=0; i<s.length(); i++) {
        //     freq[s.charAt(i)-'a']++;
        // }

        //  for(int i=0; i<t.length(); i++) {
        //     freq[t.charAt(i)-'a']--;
        // }

        //  for(int i=0; i<freq.length; i++) {
        //    if(freq[i] != 0) {
        //     return false;
        //    } 
        // }

        // return true;

        //2. this is for unicodes

        if(s.length() != t.length()) {
             return false;
        }

        HashMap<Character, Integer> mp = new HashMap<>();

        //store frequency of s's characters
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            mp.put(c, mp.getOrDefault(c, 0)+1);
        }  

         //decrease frequency by using t's characters
        for(int i=0; i<t.length(); i++) {
            char c = t.charAt(i);
            if(!mp.containsKey(c)) {
                return false;
            }
            mp.put(c, mp.get(c)-1);
            if(mp.get(c) == 0) {
                mp.remove(c);
            }
        }

        return mp.isEmpty();

    }
}

