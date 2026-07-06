class Solution {
    public boolean canConstruct(String ra, String ma) {

        int[] f1 = new int[26];
        

        for(int i=0; i<ra.length(); i++) {
            f1[ra.charAt(i) -'a']++;
        }

        for(int i=0; i<ma.length(); i++) {
            f1[ma.charAt(i) -'a']--;
        }

        for(int i=0; i<26; i++) {
            if(f1[i] > 0) {
                return false;
            }
        }

        return true;
    }
}       