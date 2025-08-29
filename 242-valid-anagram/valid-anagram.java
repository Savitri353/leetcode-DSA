class Solution {
    public boolean isAnagram(String s, String t) {
       if(s.length() != t.length()) {
          return false;
       }

        HashMap<Character, Integer> map = new HashMap<>();

        //count frequency of character in s
        for(char c:s.toCharArray()) {
            map.put(c, map.getOrDefault(c,0)+1);
        }

        //now decrease frequency of character using character of t
        for(char c:t.toCharArray()) {
            if(!map.containsKey(c)) {
                return false;
            }

            map.put(c, map.get(c)-1);
            if(map.get(c)==0) {
                map.remove(c);
            }
        }

        return map.isEmpty();
        

    //    int[] count1 = new int[26];
    
    //    for(int i=0; i<s.length(); i++) {
    //         char s1 = s.charAt(i);
    //         char t2 = t.charAt(i);
    //         count1[s1-'a']++;
    //         count1[t2-'a']--;
    //    }

    //   for(int c:count1) {
    //     if(c != 0) {
    //         return false;
    //     }
    //   } 
    //     return true;

    }
}