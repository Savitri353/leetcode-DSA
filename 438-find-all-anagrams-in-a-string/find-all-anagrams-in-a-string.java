class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        int k = p.length();
        char[] arrP = p.toCharArray();
        Arrays.sort(arrP);
        String p1 = new String(arrP);

        List<Integer> list = new ArrayList<>();

        for(int i=0; i<=s.length()-k; i++) {
            String sub = s.substring(i, i+k);
            
            char[] subArr = sub.toCharArray();

            Arrays.sort(subArr);

            String s2 = new String(subArr);

            if(s2.equals(p1)) {
                list.add(i);
            }
        }

        return list;
    }
}