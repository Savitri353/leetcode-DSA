class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        int k = p.length();
        char[] arrP = p.toCharArray();
        Arrays.sort(arrP);
        String p1 = new String(arrP);

        List<Integer> list = new ArrayList<>();

        for(int i=0; i<=s.length()-k; i++) {
            String sSub = s.substring(i, i+k);
            
            char[] asSub = sSub.toCharArray();

            Arrays.sort(asSub);

            String s2 = new String(asSub);

            if(s2.equals(p1)) {
                list.add(i);
            }
        }

        return list;
    }
}