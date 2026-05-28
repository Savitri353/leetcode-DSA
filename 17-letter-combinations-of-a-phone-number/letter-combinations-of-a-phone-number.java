class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();

        String[] keys = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        solve(list, keys, digits, new StringBuilder(), 0);
        return list;
    }   

    public void solve(List<String> list, String[] keys, String digits, StringBuilder temp, int idx) {
        if(idx == digits.length()) {
            list.add(temp.toString());
            return;
        }

        int digit = digits.charAt(idx)-'0';
        String letter = keys[digit];

        for(char ch:letter.toCharArray()) {
            temp.append(ch); //add

            solve(list, keys, digits, temp, idx+1); //explore
            temp.deleteCharAt(temp.length()-1); //undo
        }
    }
}