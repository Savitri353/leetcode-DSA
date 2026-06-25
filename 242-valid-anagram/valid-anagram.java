class Solution {
    public boolean isAnagram(String s, String t) {

        // if(s.length() != t.length()) return false;

        // int n = s.length();
        // int[] freq = new int[26];

        // for(int i=0; i<n; i++) {
        //     freq[s.charAt(i) - 'a']++;
        // }

        // for(int i=0; i<n; i++) {
        //     freq[t.charAt(i) - 'a']--;
        // }

        //  for(int i=0; i<26; i++) {
        //     if(freq[i] != 0) {
        //         return false;
        //     }
        // }

        // return true;

        if(s.length() != t.length()) return false;

        //to store frequency
        HashMap<Character, Integer> mp = new HashMap<>();


        //first store the frequency of first string's character
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            mp.put(c, mp.getOrDefault(c, 0)+1);
        }

        //now reduce the frequency of characters
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