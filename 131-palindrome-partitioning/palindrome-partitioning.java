class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        solve(result, s, 0, new ArrayList<>());
        return result;
    }

    public void solve(List<List<String>> result, String s, int start, List<String> temp) {
        if(start == s.length()) {
            result.add(new ArrayList<>(temp));
        }

        for(int end=start; end<s.length(); end++) {
            if(isPalindrome(start, end, s)) {
                temp.add(s.substring(start, end+1));

                solve(result, s, end+1, temp);
                temp.remove(temp.size()-1);
            }
           
        }
    }

    public boolean isPalindrome(int start, int end, String s) {
        while(end>start) {
            if(s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}