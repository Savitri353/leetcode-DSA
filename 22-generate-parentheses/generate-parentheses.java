class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        solve(list, "", 0, 0, n);
        return list;
    }

    public void solve(List<String> list, String current, int open, int close, int n) {
        if(current.length() == 2*n) {
            list.add(current);
            return;
        }

        if(open<n) {
            solve(list, current+"(", open+1, close, n);
        }

        if(close<open) {
            solve(list, current+")", open, close+1, n);
        }
    }
}
        