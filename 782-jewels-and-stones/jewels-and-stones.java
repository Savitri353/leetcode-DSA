class Solution {
    public int numJewelsInStones(String j, String s) {
        HashSet<Character> st = new HashSet<>();

        for(int i=0; i<j.length(); i++) {
            st.add(j.charAt(i));
        }

        int count = 0;
        for(int k=0; k<s.length(); k++) {
            if(st.contains(s.charAt(k))) {
                count++;
            }
        }

        return count;
    }
}