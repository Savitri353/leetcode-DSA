class Solution {
    public List<String> letterCombinations(String digits) {
        String[] keypad = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        List<String> list = new ArrayList<>();
        solve(list, keypad, digits, 0, new StringBuilder());
        return list;
    }

    public void solve(List<String> list, String[] keypad, String digits, int idx, StringBuilder temp) {
        if(idx == digits.length()) {
            list.add(temp.toString());
            return;
        }

        int digit = digits.charAt(idx)-'0';
        String letters = keypad[digit];

        for(char ch:letters.toCharArray()) {
            temp.append(ch); // take
            solve(list, keypad, digits, idx+1, temp); // explore
            temp.deleteCharAt(temp.length()-1);
        }
    }
}