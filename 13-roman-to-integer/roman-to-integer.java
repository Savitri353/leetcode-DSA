class Solution {
    public int romanToInt(String s) {
      HashMap<Character, Integer> mp = new HashMap<>();

      mp.put('I', 1);
      mp.put('V', 5);
      mp.put('X', 10);
      mp.put('L', 50);
      mp.put('C', 100);
      mp.put('D', 500);
      mp.put('M', 1000);
     //roman string should be in decreasing order from left to right
      int result = 0;
      for(int i=0; i<=s.length()-2; i++) {
         if(mp.get(s.charAt(i)) < mp.get(s.charAt(i+1))) {
            result-=mp.get(s.charAt(i));
         } else {
            result+=mp.get(s.charAt(i));
         }
      }

      result+=mp.get(s.charAt(s.length()-1));
      return result;
    }
}