class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;

        HashMap<Character, Character> mp1 = new HashMap<>();
        HashMap<Character, Character> mp2 = new HashMap<>();

        for(int i=0; i<s.length(); i++) {
            
            //first check into mp1 whether it is already there,and if it is there then check is it maped to the second string's character
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if(mp1.containsKey(c1)) {
                if(mp1.get(c1) != c2) {
                    return false;
                } 
            } else {
                 mp1.put(c1,c2);
            }

            //now check into mp2 t->s
            if(mp2.containsKey(c2)){
                if(mp2.get(c2) != c1) {
                    return false;
                }
            } else {
                mp2.put(c2,c1);
            }
        }

    // if we are able to successfully map from both side s->t and t->s. then we can return true
        return true;
    }
}