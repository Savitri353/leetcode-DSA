class Solution {
    public String restoreString(String s, int[] ind) {
        HashMap<Integer, Character> mp = new HashMap<>();

        for(int i=0; i<ind.length; i++) {
            mp.put(ind[i], s.charAt(i));
        }
  
        char[] ans = new char[ind.length];
        for(int i=0; i<ind.length; i++) {

            ans[ind[i]] = mp.get(ind[i]); //find the correct index in ans array and put the correct maped character to that int.
        }

       return new String(ans);
    }
}